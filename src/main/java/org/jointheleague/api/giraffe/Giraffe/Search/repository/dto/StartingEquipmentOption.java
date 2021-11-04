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
import org.jointheleague.api.giraffe.Giraffe.Search.repository.dto.From__1;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "choose",
        "type",
        "from"
})
@Generated("jsonschema2pojo")
public class StartingEquipmentOption {

    @JsonProperty("choose")
    private Integer choose;
    @JsonProperty("type")
    private String type;
    @JsonProperty("from")
    private List<From__1> from = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("choose")
    public Integer getChoose() {
        return choose;
    }

    @JsonProperty("choose")
    public void setChoose(Integer choose) {
        this.choose = choose;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("from")
    public List<From__1> getFrom() {
        return from;
    }

    @JsonProperty("from")
    public void setFrom(List<From__1> from) {
        this.from = from;
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