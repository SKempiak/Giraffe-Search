package org.jointheleague.api.giraffe.Giraffe.Search.repository.dto;

import java.util.HashMap;
import java.util.List;
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
        "index",
        "races",
        "subraces",
        "name",
        "desc",
        "proficiencies",
        "proficiency_choices",
        "url"
})
@Generated("jsonschema2pojo")
public class Traits {

    @JsonProperty("index")
    private String index;
    @JsonProperty("races")
    private List<Race> races = null;
    @JsonProperty("subraces")
    private List<Object> subraces = null;
    @JsonProperty("name")
    private String name;
    @JsonProperty("desc")
    private List<String> desc = null;
    @JsonProperty("proficiencies")
    private List<Object> proficiencies = null;
    @JsonProperty("proficiency_choices")
    private ProficiencyChoices proficiencyChoices;
    @JsonProperty("url")
    private String url;
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

    @JsonProperty("races")
    public List<Race> getRaces() {
        return races;
    }

    @JsonProperty("races")
    public void setRaces(List<Race> races) {
        this.races = races;
    }

    @JsonProperty("subraces")
    public List<Object> getSubraces() {
        return subraces;
    }

    @JsonProperty("subraces")
    public void setSubraces(List<Object> subraces) {
        this.subraces = subraces;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("desc")
    public List<String> getDesc() {
        return desc;
    }

    @JsonProperty("desc")
    public void setDesc(List<String> desc) {
        this.desc = desc;
    }

    @JsonProperty("proficiencies")
    public List<Object> getProficiencies() {
        return proficiencies;
    }

    @JsonProperty("proficiencies")
    public void setProficiencies(List<Object> proficiencies) {
        this.proficiencies = proficiencies;
    }

    @JsonProperty("proficiency_choices")
    public ProficiencyChoices getProficiencyChoices() {
        return proficiencyChoices;
    }

    @JsonProperty("proficiency_choices")
    public void setProficiencyChoices(ProficiencyChoices proficiencyChoices) {
        this.proficiencyChoices = proficiencyChoices;
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

}