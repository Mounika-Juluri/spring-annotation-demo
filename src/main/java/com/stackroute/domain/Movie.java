package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
public class Movie {
    @Autowired
    private Actor actor;

    public Movie(){}

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                '}';
    }

    public Movie(Actor actor) {
        this.actor = actor;
    }
}
