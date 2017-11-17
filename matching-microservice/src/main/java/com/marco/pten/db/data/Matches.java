package com.marco.pten.db.data;

import javafx.util.Pair;
import org.springframework.data.annotation.Id;

/**
 * Created by marco on 10/27/2017.
 */
public class Matches {

    @Id
    private String id;

    private Pair<String, String> match;

    public Matches(Pair<String, String> match) {
        this.match = match;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Pair<String, String> getMatch() {
        return match;
    }

    public void setMatch(Pair<String, String> match) {
        this.match = match;
    }
}
