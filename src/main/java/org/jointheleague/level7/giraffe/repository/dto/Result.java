package org.jointheleague.api.giraffe.Giraffe.Search.repository.dto;

<<<<<<< HEAD
public class Result {

    String name;
    String subtitle;
    String summary;

=======
package org.jointheleague.level7.giraffe.repository.dto;

//package org.jointheleague.api.giraffe.Giraffe.Search.repository.dto;
//
//import com.fasterxml.jackson.annotation.JsonAlias;
//
//import java.util.List;
//
//public class Result {
//
//    private String title;
//
//    @JsonAlias("contributor")
//    private List<String> authors;
//
//    @JsonAlias("id")
//    private String link;
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public List<String> getAuthors() {
//        return authors;
//    }
//
//    public void setAuthors(List<String> authors) {
//        this.authors = authors;
//    }
//
//    public String getLink() {
//        return link;
//    }
//
//    public void setLink(String link) {
//        this.link = link;
//    }
//
//}


import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;




public class Result {
String name;
String subtitle;
String summary;

>>>>>>> 72338224c07181c15c539a0166d152581957a0e3
    public void setName(String name) {
        this.name = name;
    }
    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }
    public void setSummary(String summary) {
        this.summary = summary;
    }
<<<<<<< HEAD

}

=======
>>>>>>> 72338224c07181c15c539a0166d152581957a0e3
}