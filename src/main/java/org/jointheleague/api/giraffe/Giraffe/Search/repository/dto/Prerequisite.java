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
        "ability_score",
        "minimum_score"
})
@Generated("jsonschema2pojo")
public class Prerequisite {

    @JsonProperty("ability_score")
    private AbilityScores abilityScore;
    @JsonProperty("minimum_score")
    private Integer minimumScore;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ability_score")
    public AbilityScores getAbilityScore() {
        return abilityScore;
    }

    @JsonProperty("ability_score")
    public void setAbilityScore(AbilityScores abilityScore) {
        this.abilityScore = abilityScore;
    }

    @JsonProperty("minimum_score")
    public Integer getMinimumScore() {
        return minimumScore;
    }

    @JsonProperty("minimum_score")
    public void setMinimumScore(Integer minimumScore) {
        this.minimumScore = minimumScore;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
