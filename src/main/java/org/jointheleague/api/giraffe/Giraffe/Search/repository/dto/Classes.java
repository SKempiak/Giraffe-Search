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
        "hit_die",
        "proficiency_choices",
        "proficiencies",
        "saving_throws",
        "starting_equipment",
        "starting_equipment_options",
        "class_levels",
        "multi_classing",
        "subclasses",
        "spellcasting",
        "spells",
        "url"
})
@Generated("jsonschema2pojo")
public class Classes {

    @JsonProperty("index")
    private String index;
    @JsonProperty("name")
    private String name;
    @JsonProperty("hit_die")
    private Integer hitDie;
    @JsonProperty("proficiency_choices")
    private List<ProficiencyChoice> proficiencyChoices = null;
    @JsonProperty("proficiencies")
    private List<Proficiency> proficiencies = null;
    @JsonProperty("saving_throws")
    private List<SavingThrow> savingThrows = null;
    @JsonProperty("starting_equipment")
    private List<StartingEquipment> startingEquipment = null;
    @JsonProperty("starting_equipment_options")
    private List<StartingEquipmentOption> startingEquipmentOptions = null;
    @JsonProperty("class_levels")
    private String classLevels;
    @JsonProperty("multi_classing")
    private MultiClassing multiClassing;
    @JsonProperty("subclasses")
    private List<Subclass> subclasses = null;
    @JsonProperty("spellcasting")
    private Spellcasting spellcasting;
    @JsonProperty("spells")
    private String spells;
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

    @JsonProperty("hit_die")
    public Integer getHitDie() {
        return hitDie;
    }

    @JsonProperty("hit_die")
    public void setHitDie(Integer hitDie) {
        this.hitDie = hitDie;
    }

    @JsonProperty("proficiency_choices")
    public List<ProficiencyChoice> getProficiencyChoices() {
        return proficiencyChoices;
    }

    @JsonProperty("proficiency_choices")
    public void setProficiencyChoices(List<ProficiencyChoice> proficiencyChoices) {
        this.proficiencyChoices = proficiencyChoices;
    }

    @JsonProperty("proficiencies")
    public List<Proficiency> getProficiencies() {
        return proficiencies;
    }

    @JsonProperty("proficiencies")
    public void setProficiencies(List<Proficiency> proficiencies) {
        this.proficiencies = proficiencies;
    }

    @JsonProperty("saving_throws")
    public List<SavingThrow> getSavingThrows() {
        return savingThrows;
    }

    @JsonProperty("saving_throws")
    public void setSavingThrows(List<SavingThrow> savingThrows) {
        this.savingThrows = savingThrows;
    }

    @JsonProperty("starting_equipment")
    public List<StartingEquipment> getStartingEquipment() {
        return startingEquipment;
    }

    @JsonProperty("starting_equipment")
    public void setStartingEquipment(List<StartingEquipment> startingEquipment) {
        this.startingEquipment = startingEquipment;
    }

    @JsonProperty("starting_equipment_options")
    public List<StartingEquipmentOption> getStartingEquipmentOptions() {
        return startingEquipmentOptions;
    }

    @JsonProperty("starting_equipment_options")
    public void setStartingEquipmentOptions(List<StartingEquipmentOption> startingEquipmentOptions) {
        this.startingEquipmentOptions = startingEquipmentOptions;
    }

    @JsonProperty("class_levels")
    public String getClassLevels() {
        return classLevels;
    }

    @JsonProperty("class_levels")
    public void setClassLevels(String classLevels) {
        this.classLevels = classLevels;
    }

    @JsonProperty("multi_classing")
    public MultiClassing getMultiClassing() {
        return multiClassing;
    }

    @JsonProperty("multi_classing")
    public void setMultiClassing(MultiClassing multiClassing) {
        this.multiClassing = multiClassing;
    }

    @JsonProperty("subclasses")
    public List<Subclass> getSubclasses() {
        return subclasses;
    }

    @JsonProperty("subclasses")
    public void setSubclasses(List<Subclass> subclasses) {
        this.subclasses = subclasses;
    }

    @JsonProperty("spellcasting")
    public Spellcasting getSpellcasting() {
        return spellcasting;
    }

    @JsonProperty("spellcasting")
    public void setSpellcasting(Spellcasting spellcasting) {
        this.spellcasting = spellcasting;
    }

    @JsonProperty("spells")
    public String getSpells() {
        return spells;
    }

    @JsonProperty("spells")
    public void setSpells(String spells) {
        this.spells = spells;
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