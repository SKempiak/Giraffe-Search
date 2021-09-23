package org.jointheleague.api.giraffe.Giraffe.Search.repository;

import org.springframework.stereotype.Repository;
import org.springframework.web.reactive.function.client.WebClient;

import javax.xml.transform.Result;
import java.util.List;

@Repository
public class LocRepo {
    private final WebClient webClient;

    private static final String baseUrl = "https://www.loc.gov/books";

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
        return webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .queryParam("fo", "json")
                        .queryParam("at", "results")
                        .queryParam("q", query)
                        .build()
                ).retrieve()
                .bodyToMono(LocResponse.class)
                .block()
                .getResults();
    }


}
