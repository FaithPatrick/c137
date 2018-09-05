package com.morty.c137.controller;

import com.morty.c137.po.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/{id}")
    public User getUserById(Integer id) {
        return null;
    }

}
