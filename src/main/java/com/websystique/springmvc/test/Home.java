package com.websystique.springmvc.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by pawel on 20.03.16.
 */
@Component
public class Home {

    @Autowired
    private Wall wall;

    public Home() {

    }

    public void sayHome(){
        System.out.println("I am home");
        wall.sayWall();
    }

    public Wall getWall() {
        return wall;
    }

    public void setWall(Wall wall) {
        this.wall = wall;
    }
}
