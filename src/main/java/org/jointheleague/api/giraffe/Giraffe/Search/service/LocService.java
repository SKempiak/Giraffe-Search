package org.jointheleague.api.giraffe.Giraffe.Search.service;

import org.jointheleague.api.giraffe.Giraffe.Search.repository.LocRepo;
import org.jointheleague.api.giraffe.Giraffe.Search.repository.dto.Result;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocService {

    private final LocRepo locRepository;

    public LocService(LocRepo locRepository) {
        this.locRepository = locRepository;
    }

    public List<Result> getResults(String query){
        return locRepository.getResults(query);
    }

}