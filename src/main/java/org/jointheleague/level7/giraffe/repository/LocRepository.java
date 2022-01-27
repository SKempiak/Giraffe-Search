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
        String clarify = query;
        if (clarify.contains("ability score")) {
            return webClient.get()
                    .uri(uriBuilder -> uriBuilder.query("ability-scores").build()
                    ).retrieve()
                    .bodyToMono(LocResponse.class)
                    .block()
                    .getResults();
        }
        if (clarify.contains("skill")) {
            return webClient.get()
                    .uri(uriBuilder -> uriBuilder.query("skills").build()
                    ).retrieve()
                    .bodyToMono(LocResponse.class)
                    .block()
                    .getResults();
        }
        if (clarify.contains("proficiency") || clarify.contains("proficiencies")) {
            return webClient.get()
                    .uri(uriBuilder -> uriBuilder.query("proficiencies").build()
                    ).retrieve()
                    .bodyToMono(LocResponse.class)
                    .block()
                    .getResults();
        }
        if (clarify.contains("language")) {
            return webClient.get()
                    .uri(uriBuilder -> uriBuilder.query("languages").build()
                    ).retrieve()
                    .bodyToMono(LocResponse.class)
                    .block()
                    .getResults();
        }
        if (clarify.contains("alignment")) {
            return webClient.get()
                    .uri(uriBuilder -> uriBuilder.query("alignment").build()
                    ).retrieve()
                    .bodyToMono(LocResponse.class)
                    .block()
                    .getResults();
        }
        if (clarify.contains("background")) {
            return webClient.get()
                    .uri(uriBuilder -> uriBuilder.query("backgrounds").build()
                    ).retrieve()
                    .bodyToMono(LocResponse.class)
                    .block()
                    .getResults();
        }
        if (clarify.contains("class")) {
            return webClient.get()
                    .uri(uriBuilder -> uriBuilder.query("classes").build()
                    ).retrieve()
                    .bodyToMono(LocResponse.class)
                    .block()
                    .getResults();
        }
        if (clarify.contains("background")) {
            return webClient.get()
                    .uri(uriBuilder -> uriBuilder.query("background").build()
                    ).retrieve()
                    .bodyToMono(LocResponse.class)
                    .block()
                    .getResults();
        }
        if (clarify.contains("subclass")) {
            return webClient.get()
                    .uri(uriBuilder -> uriBuilder.query("subclasses").build()
                    ).retrieve()
                    .bodyToMono(LocResponse.class)
                    .block()
                    .getResults();
        }
        if (clarify.contains("feature")) {
            return webClient.get()
                    .uri(uriBuilder -> uriBuilder.query("features").build()
                    ).retrieve()
                    .bodyToMono(LocResponse.class)
                    .block()
                    .getResults();
        }


        return null;
    }
}