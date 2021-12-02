package org.jointheleague.api.giraffe.Giraffe.Search.repository;


import org.jointheleague.api.giraffe.Giraffe.Search.repository.dto.LocResponse;
import org.jointheleague.api.giraffe.Giraffe.Search.repository.dto.Result;
import org.springframework.stereotype.Repository;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Repository
public class LocRepo {
    private final WebClient webClient;

    private static final String baseUrl = "https://www.dnd5eapi.co/api/";

    public LocRepo() {

        webClient = WebClient
                .builder()
                .baseUrl(baseUrl)
                .build();
    }
    public LocRepo(WebClient webClientMock) {
        this.webClient = webClientMock;
    }

    public List<Result> getResults(String query) {
        List<Result> Values = webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .path(ability-scores + "/"+query)
                        .build()
                ).retrieve()
                .bodyToMono(LocResponse.class)
                .block()
                .getResults();
        Values+=webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .path("spells" + "/"+query)
                        .build()
                ).retrieve()
                .bodyToMono(LocResponse.class)
                .block()
                .getResults();
        Values+=webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .path("monsters" + "/"+query)
                        .build()
                ).retrieve()
                .bodyToMono(LocResponse.class)
                .block()
                .getResults();
        Values+=webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .path("features" + "/"+query)
                        .build()
                ).retrieve()
                .bodyToMono(LocResponse.class)
                .block()
                .getResults();

        return Values;
    }


}