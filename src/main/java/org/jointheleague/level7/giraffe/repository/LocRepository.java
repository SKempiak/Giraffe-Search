package org.jointheleague.level7.giraffe.repository;


import org.jointheleague.api.giraffe.Giraffe.Search.repository.dto.AbilityScores;
import org.jointheleague.api.giraffe.Giraffe.Search.repository.dto.Alignment;
import org.jointheleague.api.giraffe.Giraffe.Search.repository.dto.Result;
import org.jointheleague.level7.giraffe.repository.dto.LocResponse;
import org.springframework.stereotype.Repository;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;
import java.util.Locale;

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
        String modified = query;
        if (query.contains("ability score")) {
            String tempMod = modified.replace("ability score", "").toLowerCase(Locale.ROOT).trim().replaceAll(" ", "-");
                List<Result> results = webClient.get()
                        .uri(uriBuilder -> uriBuilder.query("ability-scores/" + tempMod).build()
                        ).retrieve()
                        .bodyToMono(AbilityScores.class)
                        .block()
                        .getFinalResults();
            System.out.println(tempMod);

            return results;
        } else if (query.contains("skill")) {
            String tempMod = modified.replace("skill", "").toLowerCase(Locale.ROOT).trim().replace(" ", "-");
            List<Result> results = webClient.get()
                    .uri(uriBuilder -> uriBuilder.query("skills/" + tempMod).build()
                    ).retrieve()
                    .bodyToMono(LocResponse.class)
                    .block()
                    .getResults();

            System.out.println(tempMod);

            return results;
        } else if (query.contains("proficiency")) {
            String tempMod = modified.replace("proficienc", "").toLowerCase(Locale.ROOT).trim().replace(" ", "-");
            List<Result> results = webClient.get()
                    .uri(uriBuilder -> uriBuilder.query("proficiencies/" + tempMod).build()
                    ).retrieve()
                    .bodyToMono(LocResponse.class)
                    .block()
                    .getResults();

            System.out.println(tempMod);

            return results;
        } else if (query.contains("language")) {
            String tempMod = modified.replace("language", "").toLowerCase(Locale.ROOT).trim().replace(" ", "-");
            List<Result> results = webClient.get()
                    .uri(uriBuilder -> uriBuilder.query("languages/" + tempMod).build()
                    ).retrieve()
                    .bodyToMono(LocResponse.class)
                    .block()
                    .getResults();

            System.out.println(tempMod);

            return results;
        } else if (query.contains("alignment")) {
            String tempMod = modified.replace("alignment", "").toLowerCase(Locale.ROOT).trim().replace(" ", "-");
            List<Result> results = webClient.get()
                    .uri(uriBuilder -> uriBuilder.query("alignment/" + tempMod).build()
                    ).retrieve()
                    .bodyToMono(Alignment.class)
                    .block()
                    .getFinalResult();

            System.out.println(tempMod);

            return results;
        } else if (query.contains("background")) {
            String tempMod = modified.replace("background", "").toLowerCase(Locale.ROOT).trim().replace(" ", "-");

            List<Result> results = webClient.get()
                    .uri(uriBuilder -> uriBuilder.query("background/" + tempMod).build()
                    ).retrieve()
                    .bodyToMono(LocResponse.class)
                    .block()
                    .getResults();

            System.out.println(tempMod);

            return results;
        }
        else if (query.contains("class")) {
            String tempMod = modified.replace("class", "").toLowerCase(Locale.ROOT).trim().replace(" ", "-");

            List<Result> results = webClient.get()
                    .uri(uriBuilder -> uriBuilder.query("classes/" + tempMod).build()
                    ).retrieve()
                    .bodyToMono(LocResponse.class)
                    .block()
                    .getResults();

            System.out.println(tempMod);

            return results;
        }
        else if (query.contains("subclass")) {
            String tempMod = modified.replace("subclass", "").toLowerCase(Locale.ROOT).trim().replace(" ", "-");

            List<Result> results = webClient.get()
                    .uri(uriBuilder -> uriBuilder.query("subclasses/" + tempMod).build()
                    ).retrieve()
                    .bodyToMono(LocResponse.class)
                    .block()
                    .getResults();

            System.out.println(tempMod);

            return results;
        }
        else if (query.contains("feature")) {
            String tempMod = modified.replace("feature", "").toLowerCase(Locale.ROOT).trim().replace(" ", "-");

            List<Result> results = webClient.get()
                    .uri(uriBuilder -> uriBuilder.query("ability-scores/" + tempMod).build()
                    ).retrieve()
                    .bodyToMono(LocResponse.class)
                    .block()
                    .getResults();

            System.out.println(tempMod);

            return results;
        }


        return null;
    }
}