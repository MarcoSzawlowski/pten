package com.marco.pten.services;

import com.marco.pten.db.data.Matches;
import com.marco.pten.db.repositories.MatchesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by marco on 5/29/2017.
 */

@Service
public class MatchesApiService {

    @Autowired
    MatchesRepository matchesRepository;

    public void save(Matches matches)
    {
        matchesRepository.save(matches);
    }

    public List<Matches> findAll()
    {
       return matchesRepository.findAll();
    }

    public Matches findById(String id)
    {
        return matchesRepository.findById(id);
    }

    public Matches findByUserId(String id) {return matchesRepository.findByMatchContains(id);}
}
