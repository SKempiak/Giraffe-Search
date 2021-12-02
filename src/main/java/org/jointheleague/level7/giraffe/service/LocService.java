package org.jointheleague.level7.giraffe.service;

import org.jointheleague.level7.giraffe.repository.LocRepository;
import org.jointheleague.level7.giraffe.repository.dto.Result;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocService {

    private final LocRepository locRepository;

    public LocService(LocRepository locRepository) {

        this.locRepository = locRepository;
    }

    public List<Result> getResults(String query) {
        return locRepository.getResults(query);
    }

}