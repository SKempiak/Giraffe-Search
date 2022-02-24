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



@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "name",
        "subtitle",
        "summary"
})
@Generated("jsonschema2pojo")
public class Result {

    @JsonProperty("name")
    String name;
    @JsonProperty("subtitle")
    String subtitle;
    @JsonProperty("summary")
    String summary;

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }
    @JsonProperty("subtitle")
    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }
    @JsonProperty("summary")
    public void setSummary(String summary) {
        this.summary = summary;
    }

}