package com.spaceapps.canopener.SpaceAppCanOpener.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spaceapps.canopener.SpaceAppCanOpener.entity.User;
import com.spaceapps.canopener.SpaceAppCanOpener.service.UserService;

@RestController
public class UserController {

    final private String CREATE_USER_URL = "/user/new";

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(CREATE_USER_URL)
    public User createNewUser (@RequestBody User userRequest,
                               HttpServletRequest request, HttpServletResponse response) throws Exception {

        User storedUser = userService.createNewUser(userRequest);
        response.setStatus(HttpStatus.CREATED.value());
        return storedUser;
    }
}
