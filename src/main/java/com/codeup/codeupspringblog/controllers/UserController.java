package com.codeup.codeupspringblog.controllers;

import org.springframework.stereotype.Controller;
import com.codeup.codeupspringblog.repositories.UserRepository;


@Controller
public class UserController {

    private final UserRepository usersDao;

    public UserController(UserRepository usersDao) {
        this.usersDao = usersDao;
    }

}
