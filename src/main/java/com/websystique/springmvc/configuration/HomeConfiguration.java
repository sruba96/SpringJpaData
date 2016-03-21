package com.websystique.springmvc.configuration;

import com.websystique.springmvc.test.Home;
import com.websystique.springmvc.test.Wall;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by pawel on 20.03.16.
 */
@Configuration
@ComponentScan("configuration")
public class HomeConfiguration {

    @Bean
    public Wall wall(){
        Wall wall = new Wall();
        return wall;
    }

    @Bean
    public Home home(){
        Home home = new Home();
        home.setWall(wall());
        return home;
    }



}
