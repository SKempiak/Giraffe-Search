package org.jointheleague.api.giraffe.Giraffe.Search.repository.dto;

import java.util.ArrayList;
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
        "starting_proficiencies",
        "language_options",
        "starting_equipment",
        "starting_equipment_options",
        "feature",
        "personality_traits",
        "ideals",
        "bonds",
        "flaws"
})
@Generated("jsonschema2pojo")
public class Background {

    @JsonProperty("index")
    private String index;
    @JsonProperty("name")
    private String name;
    @JsonProperty("starting_proficiencies")
    private List<Proficiency> startingProficiencies = null;
    @JsonProperty("language_options")
    private LanguageOptions languageOptions;
    @JsonProperty("starting_equipment")
    private List<StartingEquipment> startingEquipment = null;
    @JsonProperty("starting_equipment_options")
    private List<StartingEquipmentOption> startingEquipmentOptions = null;
    @JsonProperty("feature")
    private Feature feature;
    @JsonProperty("personality_traits")
    private PersonalityTraits personalityTraits;
    @JsonProperty("ideals")
    private Ideals ideals;
    @JsonProperty("bonds")
    private Bonds bonds;
    @JsonProperty("flaws")
    private Flaws flaws;
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

    @JsonProperty("starting_proficiencies")
    public List<Proficiency> getStartingProficiencies() {
        return startingProficiencies;
    }

    @JsonProperty("starting_proficiencies")
    public void setStartingProficiencies(List<Proficiency> startingProficiencies) {
        this.startingProficiencies = startingProficiencies;
    }

    @JsonProperty("language_options")
    public LanguageOptions getLanguageOptions() {
        return languageOptions;
    }

    @JsonProperty("language_options")
    public void setLanguageOptions(LanguageOptions languageOptions) {
        this.languageOptions = languageOptions;
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

    @JsonProperty("feature")
    public Feature getFeature() {
        return feature;
    }

    @JsonProperty("feature")
    public void setFeature(Feature feature) {
        this.feature = feature;
    }

    @JsonProperty("personality_traits")
    public PersonalityTraits getPersonalityTraits() {
        return personalityTraits;
    }

    @JsonProperty("personality_traits")
    public void setPersonalityTraits(PersonalityTraits personalityTraits) {
        this.personalityTraits = personalityTraits;
    }

    @JsonProperty("ideals")
    public Ideals getIdeals() {
        return ideals;
    }

    @JsonProperty("ideals")
    public void setIdeals(Ideals ideals) {
        this.ideals = ideals;
    }

    @JsonProperty("bonds")
    public Bonds getBonds() {
        return bonds;
    }

    @JsonProperty("bonds")
    public void setBonds(Bonds bonds) {
        this.bonds = bonds;
    }

    @JsonProperty("flaws")
    public Flaws getFlaws() {
        return flaws;
    }

    @JsonProperty("flaws")
    public void setFlaws(Flaws flaws) {
        this.flaws = flaws;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public String mergeSubList() {
        String profs = "";
        for (int i = 0; i < startingProficiencies.size(); i++) {
            if (startingProficiencies.size() - 1 == i) {
                profs = profs + startingProficiencies.get(i).getName();
            } else {
                profs = profs + startingProficiencies.get(i).getName().replace("Skill: ", "") + ", ";
            }
        }
        return profs;
    }

    public String mergeDesc() {
        String descriptions = "";
        for (int i = 0; i < startingProficiencies.size(); i++) {
                descriptions = descriptions + feature.getDesc().get(i);
        }
        return descriptions;
    }

    public List<Result> getFinalResult() {
        List<Result> results = new ArrayList<Result>();
        Result result = new Result();
        result.setName(getName());
        result.setSubtitle(mergeSubList());
        result.setSummary(mergeDesc());
        results.add(result);
        return results;
    }

}