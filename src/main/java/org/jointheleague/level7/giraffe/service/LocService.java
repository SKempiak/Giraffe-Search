package org.jointheleague.level7.giraffe.service;

import org.jointheleague.api.giraffe.Giraffe.Search.repository.dto.Result;
import org.jointheleague.level7.giraffe.repository.LocRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocService {

    public String getResults(String query) {
        return "searching for a dnd object related to " + query;
    }

}