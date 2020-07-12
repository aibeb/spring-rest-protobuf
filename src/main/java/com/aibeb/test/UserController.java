package com.aibeb.test;

import java.util.logging.Logger;

import com.aibeb.test.UserProto.User;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    protected Logger logger = Logger.getLogger(UserController.class.getName());

    @PostMapping("/user")
    public User AddUser(@RequestBody User user) {
        logger.info(user.getName());
        logger.info(user.getEmail());
        return UserProto.User.newBuilder().setName("aibeb").setEmail("sunwei@aibeb.com").build();
    }
}