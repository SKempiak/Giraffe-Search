package org.jointheleague.api.giraffe.Giraffe.Search.repository.dto;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.*;

@Generated("jsonschema2pojo")
public class Alignment {

    @JsonProperty("name")
    private String name;
    @JsonProperty("abbreviation")
    private String abbreviation;
    @JsonProperty("desc")
    private String desc;
    @JsonProperty("url")
    private String url;
    @JsonProperty("index")
    private String index;
    @JsonProperty("count")
    private int count = -1;
    @JsonProperty("results")
    private List<Alignment> results;

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("index")
    public String getIndex() {
        return index;
    }

    @JsonProperty("index")
    public void setIndex(String index) {
        this.index = index;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        System.out.println(name);
        this.name = name;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @JsonProperty("abbreviation")
    public void setAbbreviation(String newAbb) {abbreviation = newAbb;}

    @JsonProperty("abbreviation")
    public String getAbbreviation() {return abbreviation;}

    @JsonProperty("desc")
    public void setDescription(String newDesc) {desc = newDesc;}

    @JsonProperty("desc")
    public String getDescription() {return desc;}

    @JsonProperty("count")
    public void setCount(int count) {this.count = count;}

    @JsonProperty("count")
    public int getCount() {return count;}

    @JsonProperty("results")
    public void setAlignments(List<Alignment> alignments) {this.results = alignments;}
    @JsonProperty("results")
    public List<Alignment> getAlignments() {return results;}

    public List<Result> getFinalResult() {
        List<Result> results = new ArrayList<Result>();
        Result result = new Result();

        if (count == -1) {
            result.setName(getName());
            result.setSubtitle(getAbbreviation());
            result.setSummary(getDescription());
            results.add(result);
            System.out.println(getName() + " " + getAbbreviation() + " " + getDescription() + getUrl());
            return results;
        } else {
//            result.setName("Alignments");
//            result.setSubtitle(getCount());
            System.out.println(getCount() + " " + getAlignments().size());
        }
        return results;
    }
}