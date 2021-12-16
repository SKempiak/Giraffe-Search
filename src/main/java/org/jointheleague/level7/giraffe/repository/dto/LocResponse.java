package org.jointheleague.level7.giraffe.repository.dto;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class LocResponse {
    private List<org.jointheleague.level7.giraffe.repository.dto.Result> results = null;

    @JsonProperty("results")
    public List<org.jointheleague.api.giraffe.Giraffe.Search.repository.dto.Result> getResults() {
        return results;
    }

    @JsonProperty("results")
    public void setResults(List<Result> results) {
        this.results = results;
    }

}
