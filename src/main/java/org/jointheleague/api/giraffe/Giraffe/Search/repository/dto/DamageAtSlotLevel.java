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
        "2",
        "3",
        "4",
        "5",
        "6",
        "7",
        "8",
        "9"
})
@Generated("jsonschema2pojo")
public class DamageAtSlotLevel {

    @JsonProperty("2")
    private String _2;
    @JsonProperty("3")
    private String _3;
    @JsonProperty("4")
    private String _4;
    @JsonProperty("5")
    private String _5;
    @JsonProperty("6")
    private String _6;
    @JsonProperty("7")
    private String _7;
    @JsonProperty("8")
    private String _8;
    @JsonProperty("9")
    private String _9;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("2")
    public String get2() {
        return _2;
    }

    @JsonProperty("2")
    public void set2(String _2) {
        this._2 = _2;
    }

    @JsonProperty("3")
    public String get3() {
        return _3;
    }

    @JsonProperty("3")
    public void set3(String _3) {
        this._3 = _3;
    }

    @JsonProperty("4")
    public String get4() {
        return _4;
    }

    @JsonProperty("4")
    public void set4(String _4) {
        this._4 = _4;
    }

    @JsonProperty("5")
    public String get5() {
        return _5;
    }

    @JsonProperty("5")
    public void set5(String _5) {
        this._5 = _5;
    }

    @JsonProperty("6")
    public String get6() {
        return _6;
    }

    @JsonProperty("6")
    public void set6(String _6) {
        this._6 = _6;
    }

    @JsonProperty("7")
    public String get7() {
        return _7;
    }

    @JsonProperty("7")
    public void set7(String _7) {
        this._7 = _7;
    }

    @JsonProperty("8")
    public String get8() {
        return _8;
    }

    @JsonProperty("8")
    public void set8(String _8) {
        this._8 = _8;
    }

    @JsonProperty("9")
    public String get9() {
        return _9;
    }

    @JsonProperty("9")
    public void set9(String _9) {
        this._9 = _9;
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