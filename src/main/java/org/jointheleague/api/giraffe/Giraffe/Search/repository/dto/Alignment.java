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
    @JsonAlias("url")
    private String url;
    @JsonProperty("index")
    private String index;
    @JsonAlias("count")
    private int count;
    @JsonProperty("results")
    private List<Alignment> results;

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();


    public String getIndex() {
        return index;
    }


    public void setIndex(String index) {
        this.index = index;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getUrl() {
        return url;
    }


    public void setUrl(String url) {
        this.url = url;
    }


    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }


    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public void setAbbreviation(String newAbb) {abbreviation = newAbb;}

    public String getAbbreviation() {return abbreviation;}

    public void setDescription(String newDesc) {desc = newDesc;}

    public String getDescription() {return desc;}

    public void setCount(int count) {this.count = count;}

    public int getCount() {return count;}
    @JsonProperty("results")
    public void setAlignments(List<Alignment> alignments) {this.results = alignments;}
    @JsonProperty("results")
    public List<Alignment> getAlignments() {return results;}

    public List<Result> getFinalResult() {
        List<Result> results = new ArrayList<Result>();
        Result result = new Result();

        if (count == 0) {
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
        return null;
    }
}