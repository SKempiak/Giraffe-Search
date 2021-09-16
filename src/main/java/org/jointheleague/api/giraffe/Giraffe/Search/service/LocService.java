package org.jointheleague.api.giraffe.Giraffe.Search.service;

import org.springframework.stereotype.Service;

@Service
public class LocService {

    public String getResults(String query){
        return "Searching for book stuff to " + query;
    }

}

