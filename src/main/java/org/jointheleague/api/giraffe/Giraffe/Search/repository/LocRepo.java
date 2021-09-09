package org.jointheleague.api.giraffe.Giraffe.Search.repository;


import org.springframework.stereotype.Repository;

@Repository
public class LocRepo {

    public String getResults(String query){
        return "Searching for DND stuff to " + query;
    }

}
