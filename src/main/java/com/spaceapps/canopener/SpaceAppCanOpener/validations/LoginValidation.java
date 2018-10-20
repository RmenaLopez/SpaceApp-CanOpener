package com.spaceapps.canopener.SpaceAppCanOpener.validations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spaceapps.canopener.SpaceAppCanOpener.entity.User;
import com.spaceapps.canopener.SpaceAppCanOpener.repository.UserRepository;

@Component
public class LoginValidation {

    private UserRepository userRepository;

    @Autowired
    public LoginValidation(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean areValidCredentials(User userRequest){

        User user = userRepository.getByEmail(userRequest.getEmail());
        return user.equals(userRequest);
    }
}
