package org.jointheleague.api.giraffe.Giraffe.Search.repository.dto;

import java.util.*;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.*;

public class AbilityScores {

    @JsonAlias("count")
    private Integer count;
    @JsonAlias("results")
    private List<AbilityScores> results = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    @JsonAlias("name")
    private String name;
    @JsonAlias("index")
    private String index;
    @JsonAlias("url")
    private String url;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<AbilityScores> getResults() {
        return results;
    }

    public void setResults(List<AbilityScores> results) {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getUrl() {
        return url;
    }

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
            System.out.println(name + " " + getIndex() + " " + getUrl());
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
            System.out.println(count);
            return results;
        }
    }
    
}