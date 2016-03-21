package com.websystique.springmvc.controller;

import com.websystique.springmvc.model.User;
import com.websystique.springmvc.repositories.UserRepository;
import com.websystique.springmvc.test.Home;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by pawel on 19.03.16.
 */
@Controller
public class HomeController {

    @Autowired
    Home home;

    @Autowired
    UserRepository userRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {

        home.sayHome();

        User user = new User("Pawel", "Malina");

        user.setLogin("Pawel");
        user.setPassword("Malina");

//        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
//        context.register(JpaConfig.class);
//
//        UserRepository userRepository = context.getBean("userRepository", UserRepository.class);

        userRepository.save(user);

        return "index";
    }
}
