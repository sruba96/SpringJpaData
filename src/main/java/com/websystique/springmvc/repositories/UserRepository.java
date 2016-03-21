package com.websystique.springmvc.repositories;


import com.websystique.springmvc.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

/**
 * Created by pawel on 20.03.16.
 */

public interface UserRepository extends JpaRepository<User, Long>{
}
