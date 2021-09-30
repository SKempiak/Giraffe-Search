package org.jointheleague.api.giraffe.Giraffe.Search.service;


import org.jointheleague.api.giraffe.Giraffe.Search.repository.dto.Result;

import org.jointheleague.api.giraffe.Giraffe.Search.repository.LocRepo;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocService {
        private final LocRepo locRepo;


    public List<Result> getResults(String query){
        return "Searching for D&D stuff to " + query;
    }

        public LocService(LocRepo locRepo) {
            this.locRepo = locRepo;
        }


        public String getResults(String query){
            return locRepo.getResults(query);
        }
}

