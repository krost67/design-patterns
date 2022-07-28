package com.podlasenko.example.correct;

import java.io.IOException;
import com.podlasenko.example.model.User;

/*
 *  Handles incoming JSON requests that work on User resource/entity
 */

public class UserController {
    private final UserObjectMapper userObjectMapper = new UserObjectMapper();
    private final UserValidator userValidator = new UserValidator();
    private final UserRepository userRepository = new UserRepository();

    // Create a new user
    public String createUser(String userJson) throws IOException {
        User user = userObjectMapper.mapUser(userJson);

        boolean isValid = userValidator.validateUser(user);
        if (!isValid) {
            return "ERROR";
        }

        userRepository.save(user);

        return "SUCCESS";
    }
}