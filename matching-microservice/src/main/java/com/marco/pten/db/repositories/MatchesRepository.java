package com.marco.pten.db.repositories;

import com.marco.pten.db.data.Matches;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by marco on 5/24/2017.
 */
public interface MatchesRepository extends MongoRepository<Matches, String> {
    Matches findById(String id);

    Matches findByMatchContains(String id);
}
