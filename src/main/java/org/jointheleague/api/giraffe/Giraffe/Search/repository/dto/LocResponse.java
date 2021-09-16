package org.jointheleague.api.giraffe.Giraffe.Search.repository.dto;


import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LocResponse {
    private List<Result> results = null;

    @JsonProperty("results")
    public List<Result> getResults() {
        return results;
    }

    @JsonProperty("results")
    public void setResults(List<Result> results) {
        this.results = results;
    }
}
