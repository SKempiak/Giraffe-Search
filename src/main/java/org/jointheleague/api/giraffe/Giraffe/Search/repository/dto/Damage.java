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
        "damage_type",
        "damage_at_slot_level"
})
@Generated("jsonschema2pojo")
public class Damage {

    @JsonProperty("damage_type")
    private DamageType damageType;
    @JsonProperty("damage_at_slot_level")
    private DamageAtSlotLevel damageAtSlotLevel;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("damage_type")
    public DamageType getDamageType() {
        return damageType;
    }

    @JsonProperty("damage_type")
    public void setDamageType(DamageType damageType) {
        this.damageType = damageType;
    }

    @JsonProperty("damage_at_slot_level")
    public DamageAtSlotLevel getDamageAtSlotLevel() {
        return damageAtSlotLevel;
    }

    @JsonProperty("damage_at_slot_level")
    public void setDamageAtSlotLevel(DamageAtSlotLevel damageAtSlotLevel) {
        this.damageAtSlotLevel = damageAtSlotLevel;
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