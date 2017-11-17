package com.marco.pten.db.repositories;

import com.marco.pten.db.data.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by marco on 5/24/2017.
 */
public interface UserRepository extends MongoRepository<User, String> {
    User findById(String id);
}
