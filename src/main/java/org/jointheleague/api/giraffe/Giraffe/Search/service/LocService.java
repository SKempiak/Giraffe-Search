package org.jointheleague.api.giraffe.Giraffe.Search.service;

import org.jointheleague.api.giraffe.Giraffe.Search.repository.LocRepo;
import org.springframework.stereotype.Service;

@Service
public class LocService {
        private final LocRepo locRepo;

        public LocService(LocRepo locRepo) {
            this.locRepo = locRepo;
        }

        public String getResults(String query){
            return locRepo.getResults(query);
        }
}

