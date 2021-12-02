package org.jointheleague.level7.giraffe.repository.dto;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


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
