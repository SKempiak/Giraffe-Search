package org.jointheleague.api.giraffe.Giraffe.Search.repository.dto;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;




public class Result {

    String name;
    String subtitle;
    String summary;

    public void setName(String name) {
        this.name = name;
    }
    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }
    public void setSummary(String summary) {
        this.summary = summary;
    }

}