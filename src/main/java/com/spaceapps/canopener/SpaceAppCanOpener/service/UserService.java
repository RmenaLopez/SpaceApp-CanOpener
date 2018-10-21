package com.spaceapps.canopener.SpaceAppCanOpener.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spaceapps.canopener.SpaceAppCanOpener.entity.User;
import com.spaceapps.canopener.SpaceAppCanOpener.repository.UserRepository;
import com.spaceapps.canopener.SpaceAppCanOpener.validations.LoginValidation;

@Service
@Transactional
public class UserService {

    private UserRepository userRepository;
    private LoginValidation loginValidation;

    @Autowired
    public UserService(UserRepository userRepository, LoginValidation loginValidation) {
        this.userRepository = userRepository;
        this.loginValidation = loginValidation;
    }

    public User createNewUser (User userRequest) throws Exception{

        return userRepository.save(userRequest);
    }

    public boolean areValidCredentials(User user) {
        return loginValidation.areValidCredentials(user);
    }
}
