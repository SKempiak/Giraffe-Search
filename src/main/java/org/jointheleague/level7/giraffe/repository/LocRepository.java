package org.jointheleague.level7.giraffe.repository;


import org.jointheleague.api.giraffe.Giraffe.Search.repository.dto.Result;
import org.jointheleague.level7.giraffe.repository.dto.LocResponse;
import org.springframework.stereotype.Repository;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Repository
public class LocRepository {
    private final WebClient webClient;

    private static final String baseUrl = "https://www.dnd5eapi.co/api/";
// CLARIFY MUST BE CHANGED LATER ON TO IMPLEMENT OTHER DOCUMENTATIONS
    String clarify = "ability-scores";
    public LocRepository() {

        webClient = WebClient
                .builder()
                .baseUrl(baseUrl)
                .build();
    }
    public LocRepository(WebClient webClientMock) {
        this.webClient = webClientMock;
    }

    public List<Result> getResults(String query) {
        String combine = "/" + query;
        if (clarify.equals("ability-scores")) {
            return webClient.get()
                    .uri(uriBuilder -> uriBuilder.query("ability-scores").build()
                    ).retrieve()
                    .bodyToMono(LocResponse.class)
                    .block()
                    .getResults();
        }
        return webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .path("ability-scores/")
                        .build()
                ).retrieve()
                .bodyToMono(LocResponse.class)
                .block()
                .getResults();
    }

}