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
        "desc",
        "higher_level",
        "range",
        "components",
        "material",
        "ritual",
        "duration",
        "concentration",
        "casting_time",
        "level",
        "attack_type",
        "damage",
        "school",
        "classes",
        "subclasses",
        "url"
})
@Generated("jsonschema2pojo")
public class Spells {


    @JsonProperty("index")
    private String index;
    @JsonProperty("name")
    private String name;
    @JsonProperty("desc")
    private List<String> desc = null;
    @JsonProperty("higher_level")
    private List<String> higherLevel = null;
    @JsonProperty("range")
    private String range;
    @JsonProperty("components")
    private List<String> components = null;
    @JsonProperty("material")
    private String material;
    @JsonProperty("ritual")
    private Boolean ritual;
    @JsonProperty("duration")
    private String duration;
    @JsonProperty("concentration")
    private Boolean concentration;
    @JsonProperty("casting_time")
    private String castingTime;
    @JsonProperty("level")
    private Integer level;
    @JsonProperty("attack_type")
    private String attackType;
    @JsonProperty("damage")
    private Damage damage;
    @JsonProperty("school")
    private School school;
    @JsonProperty("classes")
    private List<Class> classes = null;
    @JsonProperty("subclasses")
    private List<Subclass> subclasses = null;
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

    @JsonProperty("desc")
    public List<String> getDesc() {
        return desc;
    }

    @JsonProperty("desc")
    public void setDesc(List<String> desc) {
        this.desc = desc;
    }

    @JsonProperty("higher_level")
    public List<String> getHigherLevel() {
        return higherLevel;
    }

    @JsonProperty("higher_level")
    public void setHigherLevel(List<String> higherLevel) {
        this.higherLevel = higherLevel;
    }

    @JsonProperty("range")
    public String getRange() {
        return range;
    }

    @JsonProperty("range")
    public void setRange(String range) {
        this.range = range;
    }

    @JsonProperty("components")
    public List<String> getComponents() {
        return components;
    }

    @JsonProperty("components")
    public void setComponents(List<String> components) {
        this.components = components;
    }

    @JsonProperty("material")
    public String getMaterial() {
        return material;
    }

    @JsonProperty("material")
    public void setMaterial(String material) {
        this.material = material;
    }

    @JsonProperty("ritual")
    public Boolean getRitual() {
        return ritual;
    }

    @JsonProperty("ritual")
    public void setRitual(Boolean ritual) {
        this.ritual = ritual;
    }

    @JsonProperty("duration")
    public String getDuration() {
        return duration;
    }

    @JsonProperty("duration")
    public void setDuration(String duration) {
        this.duration = duration;
    }

    @JsonProperty("concentration")
    public Boolean getConcentration() {
        return concentration;
    }

    @JsonProperty("concentration")
    public void setConcentration(Boolean concentration) {
        this.concentration = concentration;
    }

    @JsonProperty("casting_time")
    public String getCastingTime() {
        return castingTime;
    }

    @JsonProperty("casting_time")
    public void setCastingTime(String castingTime) {
        this.castingTime = castingTime;
    }

    @JsonProperty("level")
    public Integer getLevel() {
        return level;
    }

    @JsonProperty("level")
    public void setLevel(Integer level) {
        this.level = level;
    }

    @JsonProperty("attack_type")
    public String getAttackType() {
        return attackType;
    }

    @JsonProperty("attack_type")
    public void setAttackType(String attackType) {
        this.attackType = attackType;
    }

    @JsonProperty("damage")
    public Damage getDamage() {
        return damage;
    }

    @JsonProperty("damage")
    public void setDamage(Damage damage) {
        this.damage = damage;
    }

    @JsonProperty("school")
    public School getSchool() {
        return school;
    }

    @JsonProperty("school")
    public void setSchool(School school) {
        this.school = school;
    }

    @JsonProperty("classes")
    public List<Class> getClasses() {
        return classes;
    }

    @JsonProperty("classes")
    public void setClasses(List<Class> classes) {
        this.classes = classes;
    }

    @JsonProperty("subclasses")
    public List<Subclass> getSubclasses() {
        return subclasses;
    }

    @JsonProperty("subclasses")
    public void setSubclasses(List<Subclass> subclasses) {
        this.subclasses = subclasses;
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

    private String getSubtitle() {
        String s=new String();
        if(level>0){
            if(level==1){
                s+= "1st level "+school;
            }else if(level==2){
                s+= "2nd level "+school;
            }else if(level==3){
                s+= "3rd level "+school;
            }else{
                s+= level+"th level "+school;
            }
        }else{
            s+= school+" Cantrip";
        }
        if(damage!=null){
            s+=", Damaging ("+damage.getDamageType().getName()+")";
        }
        if(concentration==true){
            s+=", Concentration";
        }
        return s;
    }




    public Result getResult() {
        Result r=new Result();
        r.setName(name);
        r.setSubtitle(getSubtitle());
        r.setSummary(desc.get(0));

        return r;
    }

}

