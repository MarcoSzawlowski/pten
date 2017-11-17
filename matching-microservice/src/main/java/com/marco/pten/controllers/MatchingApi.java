package com.marco.pten.controllers;

import com.marco.pten.db.data.Matches;
import com.marco.pten.services.MatchesApiService;
import javafx.util.Pair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by marco on 5/16/2017.
 */

@RestController
@RequestMapping("api/matches")
public class MatchingApi {

    @Autowired
    private MatchesApiService matchesApiService;

    @PostMapping("/{id}/create")
    public void createMatch(@PathVariable String id, @RequestBody String match)
    {
        matchesApiService.save(new Matches(new Pair<>(id, match)));
    }

    @GetMapping("/get/{id}")
    public Matches getUsersMatches(@PathVariable String id)
    {
        return matchesApiService.findByUserId(id);
    }
}
