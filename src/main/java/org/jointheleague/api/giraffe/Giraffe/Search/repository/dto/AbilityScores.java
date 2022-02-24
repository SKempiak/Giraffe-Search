package org.jointheleague.api.giraffe.Giraffe.Search.repository.dto;

import java.util.*;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "count",
        "results",
        "name",
        "index",
        "url"
})
@Generated("jsonschema2pojo")
public class AbilityScores {

    @JsonProperty("count")
    private Integer count;
    @JsonProperty("results")
    private List<Result> results = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    @JsonProperty("name")
    private String name;
    @JsonProperty("index")
    private String index;
    @JsonProperty("url")
    private String url;
    
    @JsonProperty("count")
    public Integer getCount() {
        return count;
    }

    @JsonProperty("count")
    public void setCount(Integer count) {
        this.count = count;
    }

    @JsonProperty("results")
    public List<Result> getResults() {
        return results;
    }

    @JsonProperty("results")
    public void setResults(List<Result> results) {
        this.results = results;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("index")
    public String getIndex() {
        return index;
    }

    @JsonProperty("index")
    public void setIndex(String index) {
        this.index = index;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }
    
    public List<Result> getFinalResults() {
        if(count == null) {
            List<Result> results = new ArrayList<Result>();
            Result r =new Result();
            r.setName(name);
            r.setSubtitle(getIndex());
            r.setSummary(getUrl());
            results.add(r);
            return results;
        } else {
            List<Result> results = new ArrayList<Result>();
            for (int i = 0; i < count; i++) {
                Result r =new Result();
                r.setName(name);
                r.setSubtitle(getIndex());
                r.setSummary(getUrl());
                results.add(r);
            }
            return results;
        }
    }
    
}