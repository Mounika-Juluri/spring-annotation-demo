package com.stackroute.config;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.stackroute")

public class BeanConfiguration {

    @Bean(name = "actorA")
    public Actor getActorA(){
        Actor actor=new Actor("abc","male",20);
        return actor;
    }
    @Bean(name = "actorB")
    public Actor getActorB(){
        Actor actor=new Actor("bdc","female",40);
        return actor;
    }
    @Bean(name = "actorC")
    public Actor getActorC(){
        Actor actor=new Actor("dce","male",60);
        return actor;
    }
    @Bean(name = "actor")
        public Actor getActor(){
            Actor actor=new Actor("dce","male",60);
            return actor;
        }
    @Bean(name = "movie")
    public Movie getMovie(){
       Movie movie=new Movie(getActor());
        return movie;
    }

}
