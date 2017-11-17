package com.marco.pten.controllers;

import com.marco.pten.db.data.User;
import com.marco.pten.services.UserApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by marco on 5/16/2017.
 */

@RestController
@RequestMapping("api/users")
public class UserApi {

    @Autowired
    private UserApiService userApiService;

    @PostMapping("/add")
    public void addUser(@RequestBody User user)
    {
        // will replace
        userApiService.save(user);
    }

    @RequestMapping("/all")
    public List<User> allUsers()
    {
        return userApiService.findAll();
    }

    @GetMapping("/get/{id}")
    public User getUser(@PathVariable String id)
    {
        return userApiService.findById(id);
    }
}
