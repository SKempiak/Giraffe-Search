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
        "normal",
        "long"
})
@Generated("jsonschema2pojo")
public class Range {

    @JsonProperty("normal")
    private Integer normal;
    @JsonProperty("long")
    private Object _long;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("normal")
    public Integer getNormal() {
        return normal;
    }

    @JsonProperty("normal")
    public void setNormal(Integer normal) {
        this.normal = normal;
    }

    @JsonProperty("long")
    public Object getLong() {
        return _long;
    }

    @JsonProperty("long")
    public void setLong(Object _long) {
        this._long = _long;
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