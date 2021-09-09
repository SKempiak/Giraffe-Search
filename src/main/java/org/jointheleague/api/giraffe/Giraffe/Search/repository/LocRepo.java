package org.jointheleague.api.giraffe.Giraffe.Search.repository;


import org.springframework.stereotype.Repository;
import org.springframework.web.reactive.function.client.WebClient;

@Repository
public class LocRepo {
    private final WebClient webClient;
private static final String baseUrl = "http://localhost:5000/v2/api-docs";

    public LocRepo() {
        webClient = WebClient
                .builder()
                .baseUrl(baseUrl)
                .build();
    }

    public String getResults(String query){
        return "Searching for DND stuff to " + query;
    }

}
