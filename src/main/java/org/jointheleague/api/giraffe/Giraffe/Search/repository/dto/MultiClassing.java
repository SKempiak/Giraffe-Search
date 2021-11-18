
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
        "prerequisites",
        "proficiencies"
})
@Generated("jsonschema2pojo")
public class MultiClassing {

    @JsonProperty("prerequisites")
    private List<Prerequisite> prerequisites = null;
    @JsonProperty("proficiencies")
    private List<Proficiency__1> proficiencies = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("prerequisites")
    public List<Prerequisite> getPrerequisites() {
        return prerequisites;
    }

    @JsonProperty("prerequisites")
    public void setPrerequisites(List<Prerequisite> prerequisites) {
        this.prerequisites = prerequisites;
    }

    @JsonProperty("proficiencies")
    public List<Proficiency__1> getProficiencies() {
        return proficiencies;
    }

    @JsonProperty("proficiencies")
    public void setProficiencies(List<Proficiency__1> proficiencies) {
        this.proficiencies = proficiencies;
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