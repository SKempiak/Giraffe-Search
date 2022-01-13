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


public class Monster {
        @JsonProperty("index")
        private String index;
        @JsonProperty("name")
        private String name;
        @JsonProperty("size")
        private String size;
        @JsonProperty("type")
        private String type;
        @JsonProperty("subtype")
        private Object subtype;
        @JsonProperty("alignment")
        private String alignment;
        @JsonProperty("armor_class")
        private Integer armorClass;
        @JsonProperty("hit_points")
        private Integer hitPoints;
        @JsonProperty("hit_dice")
        private String hitDice;
        @JsonProperty("strength")
        private Integer strength;
        @JsonProperty("dexterity")
        private Integer dexterity;
        @JsonProperty("constitution")
        private Integer constitution;
        @JsonProperty("intelligence")
        private Integer intelligence;
        @JsonProperty("wisdom")
        private Integer wisdom;
        @JsonProperty("charisma")
        private Integer charisma;
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

        @JsonProperty("size")
        public String getSize() {
            return size;
        }

        @JsonProperty("size")
        public void setSize(String size) {
            this.size = size;
        }

        @JsonProperty("type")
        public String getType() {
            return type;
        }

        @JsonProperty("type")
        public void setType(String type) {
            this.type = type;
        }

        @JsonProperty("subtype")
        public Object getSubtype() {
            return subtype;
        }

        @JsonProperty("subtype")
        public void setSubtype(Object subtype) {
            this.subtype = subtype;
        }

        @JsonProperty("alignment")
        public String getAlignment() {
            return alignment;
        }

        @JsonProperty("alignment")
        public void setAlignment(String alignment) {
            this.alignment = alignment;
        }

        @JsonProperty("armor_class")
        public Integer getArmorClass() {
            return armorClass;
        }

        @JsonProperty("armor_class")
        public void setArmorClass(Integer armorClass) {
            this.armorClass = armorClass;
        }

        @JsonProperty("hit_points")
        public Integer getHitPoints() {
            return hitPoints;
        }

        @JsonProperty("hit_points")
        public void setHitPoints(Integer hitPoints) {
            this.hitPoints = hitPoints;
        }

        @JsonProperty("hit_dice")
        public String getHitDice() {
            return hitDice;
        }

        @JsonProperty("hit_dice")
        public void setHitDice(String hitDice) {
            this.hitDice = hitDice;
        }

        @JsonProperty("strength")
        public Integer getStrength() {
            return strength;
        }

        @JsonProperty("strength")
        public void setStrength(Integer strength) {
            this.strength = strength;
        }

        @JsonProperty("dexterity")
        public Integer getDexterity() {
            return dexterity;
        }

        @JsonProperty("dexterity")
        public void setDexterity(Integer dexterity) {
            this.dexterity = dexterity;
        }

        @JsonProperty("constitution")
        public Integer getConstitution() {
            return constitution;
        }

        @JsonProperty("constitution")
        public void setConstitution(Integer constitution) {
            this.constitution = constitution;
        }

        @JsonProperty("intelligence")
        public Integer getIntelligence() {
            return intelligence;
        }

        @JsonProperty("intelligence")
        public void setIntelligence(Integer intelligence) {
            this.intelligence = intelligence;
        }

        @JsonProperty("wisdom")
        public Integer getWisdom() {
            return wisdom;
        }

        @JsonProperty("wisdom")
        public void setWisdom(Integer wisdom) {
            this.wisdom = wisdom;
        }

        @JsonProperty("charisma")
        public Integer getCharisma() {
            return charisma;
        }

        @JsonProperty("charisma")
        public void setCharisma(Integer charisma) {
            this.charisma = charisma;
        }

        @JsonAnyGetter
        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        @JsonAnySetter
        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

    public Result getResult() {
        Result r=new Result();
        r.setName(name);
        r.setSubtitle(getSubtitle());
        r.setSummary(getDesc());

        return r;
    }

    public String getSubtitle(){
            String s=new String();
            s+=size;
            s+=" "+type;
            if(subtype!=null){
                s+="("+subtype+")";
            }
            s+=", "+alignment;
            return s;
    }

    public String getDesc(){
            String d=new String();
            d+="AC: "+armorClass;
            d+=" HP: "+hitPoints+" ("+hitDice+"+"+mathoplex()+")";
            d+="\n";
            d+="Strength -- "+strength;
        d+="\n";
        d+="Dexterity -- "+dexterity;
        d+="\n";
        d+="Constitution -- "+constitution;
        d+="\n";
        d+="Intelligence -- "+intelligence;
        d+="\n";
        d+="Wisdom -- "+wisdom;
        d+="\n";
        d+="Charisma -- "+charisma;
            return d;
    }

    public int mathoplex() {
        int space=0;
        for (int i = 0; i < hitDice.length(); i++) {
            if(hitDice.charAt(i)=='d'){
                space=i;
            }
        }
        String stuff= hitDice.substring(0, space);
        int times=Integer.parseInt(stuff);
        int con=((constitution-10)/2)-(((constitution-10)/2)%1);
        return (con * times);
    }

}

