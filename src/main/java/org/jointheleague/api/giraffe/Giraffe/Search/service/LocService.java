package org.jointheleague.api.giraffe.Giraffe.Search.service;

import org.jointheleague.api.giraffe.Giraffe.Search.repository.dto.Result;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocService {

    public List<Result> getResults(String query){
        return "Searching for D&D stuff to " + query;
    }

}

