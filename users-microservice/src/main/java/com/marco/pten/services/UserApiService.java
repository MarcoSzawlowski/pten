package com.marco.pten.services;

import com.marco.pten.db.data.User;
import com.marco.pten.db.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by marco on 5/29/2017.
 */

@Service
public class UserApiService {

    @Autowired
    UserRepository userRepository;

    public void save(User user)
    {
        userRepository.save(user);
    }

    public List<User> findAll()
    {
       return userRepository.findAll();
    }

    public User findById(String id)
    {
        return userRepository.findById(id);
    }
}
