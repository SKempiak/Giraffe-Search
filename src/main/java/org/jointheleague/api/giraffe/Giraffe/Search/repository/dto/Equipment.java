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
        "name",
        "equipment_category",
        "weapon_category",
        "weapon_range",
        "category_range",
        "cost",
        "damage",
        "range",
        "weight",
        "properties",
        "url"
})
@Generated("jsonschema2pojo")
public class Equipment {

    @JsonProperty("index")
    private String index;
    @JsonProperty("name")
    private String name;
    @JsonProperty("equipment_category")
    private EquipmentCategory equipmentCategory;
    @JsonProperty("weapon_category")
    private String weaponCategory;
    @JsonProperty("weapon_range")
    private String weaponRange;
    @JsonProperty("category_range")
    private String categoryRange;
    @JsonProperty("cost")
    private Cost cost;
    @JsonProperty("damage")
    private Damage damage;
    @JsonProperty("range")
    private Range range;
    @JsonProperty("weight")
    private Integer weight;
    @JsonProperty("properties")
    private List<Property> properties = null;
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

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("equipment_category")
    public EquipmentCategory getEquipmentCategory() {
        return equipmentCategory;
    }

    @JsonProperty("equipment_category")
    public void setEquipmentCategory(EquipmentCategory equipmentCategory) {
        this.equipmentCategory = equipmentCategory;
    }

    @JsonProperty("weapon_category")
    public String getWeaponCategory() {
        return weaponCategory;
    }

    @JsonProperty("weapon_category")
    public void setWeaponCategory(String weaponCategory) {
        this.weaponCategory = weaponCategory;
    }

    @JsonProperty("weapon_range")
    public String getWeaponRange() {
        return weaponRange;
    }

    @JsonProperty("weapon_range")
    public void setWeaponRange(String weaponRange) {
        this.weaponRange = weaponRange;
    }

    @JsonProperty("category_range")
    public String getCategoryRange() {
        return categoryRange;
    }

    @JsonProperty("category_range")
    public void setCategoryRange(String categoryRange) {
        this.categoryRange = categoryRange;
    }

    @JsonProperty("cost")
    public Cost getCost() {
        return cost;
    }

    @JsonProperty("cost")
    public void setCost(Cost cost) {
        this.cost = cost;
    }

    @JsonProperty("damage")
    public Damage getDamage() {
        return damage;
    }

    @JsonProperty("damage")
    public void setDamage(Damage damage) {
        this.damage = damage;
    }

    @JsonProperty("range")
    public Range getRange() {
        return range;
    }

    @JsonProperty("range")
    public void setRange(Range range) {
        this.range = range;
    }

    @JsonProperty("weight")
    public Integer getWeight() {
        return weight;
    }

    @JsonProperty("weight")
    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @JsonProperty("properties")
    public List<Property> getProperties() {
        return properties;
    }

    @JsonProperty("properties")
    public void setProperties(List<Property> properties) {
        this.properties = properties;
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