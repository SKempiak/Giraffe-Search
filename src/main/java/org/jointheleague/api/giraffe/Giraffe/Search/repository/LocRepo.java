package org.jointheleague.api.giraffe.Giraffe.Search.repository;


import org.jointheleague.api.giraffe.Giraffe.Search.repository.dto.LocResponse;
import org.jointheleague.api.giraffe.Giraffe.Search.repository.dto.Result;
import org.springframework.stereotype.Repository;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

@Repository
public class LocRepo {
    private final WebClient webClient;

    private static final String baseUrl = "https://www.dnd5eapi.co/api/";
    List<String> Categories = Arrays.asList("skills/", "proficiencies/", "languages/", "alignment/", "backgrounds/", "classes/", "subclasses/", "features/", "races/", "subraces/", "traits/", "equipment-categories/", "equipment/", "magic-items/", "weapon-properties/", "spells/", "feats/", "monsters/", "conditions/", "damage-types/", "magic-schools/", "rules/", "rule-sections/");
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
        for (int i = 0; i < Categories.size(); i++) {
            if(query.contains(spaceToDash(Categories.get(i).substring(0, Categories.get(i).length()-2)))) {
                int iRemastered = i;
                return webClient.get()
                        .uri(uriBuilder -> uriBuilder
                                .path(Categories.get(iRemastered))
                                .build()
                        ).retrieve()
                        .bodyToMono(LocResponse.class)
                        .block()
                        .getResults();
            }
        }
        return null;
    }
    public String spaceToDash(String query) {
        query = query.toLowerCase(Locale.ROOT);
        query = query.replaceAll(" ", "-");
        return query;
    }

}