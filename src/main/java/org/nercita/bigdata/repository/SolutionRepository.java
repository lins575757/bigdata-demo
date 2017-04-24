package org.nercita.bigdata.repository;

import org.nercita.bigdata.domain.Solution;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SolutionRepository extends MongoRepository<Solution, String> {
}
