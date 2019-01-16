package com.stackroute.config;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.stackroute")
public class BeanConfiguration {
    @Bean(name = "actor")
    public Actor getActor(){
        Actor actor=new Actor();
       // Actor actor=new Actor("abc","male",20);
        return actor;
    }
    @Bean(name = "movie")
    public Movie getMovie(){
       Movie movie=new Movie();
        return movie;
    }

}
