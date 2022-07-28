package com.podlasenko.example.wrong;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.podlasenko.example.model.User;
import com.podlasenko.example.model.UserStorage;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 *  Handles incoming JSON requests that work on User resource/entity
 *  This version of controller receives requests, validate requests, store data, respond data
 *
 *  This class should be responsible only for receiving/responding data
 *  TODO: we need to split implementation for validation and persistence logic to a different classes
 */

public class WrongUserController {
    private final UserStorage userStorage = new UserStorage();

    // Create a new user
    public String createUser(String userJson) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        User user = mapper.readValue(userJson, User.class);
        if (!isValidUser(user)) {
            return "ERROR";
        }

        userStorage.store(user);

        return "SUCCESS";
    }

    // Validates the user object
    private boolean isValidUser(User user) {
        if (!isPresent(user.getName())) {
            return false;
        }
        user.setName(user.getName().trim());

        if (!isValidAlphaNumeric(user.getName())) {
            return false;
        }

        if (user.getEmail() == null || user.getEmail().trim().length() == 0) {
            return false;
        }

        user.setEmail(user.getEmail().trim());
        return isValidEmail(user.getEmail());
    }

    // Simply checks if value is null or empty
    private boolean isPresent(String value) {
        return value != null && value.trim().length() > 0;
    }

    // Check string for special characters
    private boolean isValidAlphaNumeric(String value) {
        Pattern pattern = Pattern.compile("[^A-Za-z0-9]");
        Matcher matcher = pattern.matcher(value);
        return !matcher.find();
    }

    // Check string for valid email address - this is not for prod.
    // Just for demo. This fails for lots of valid emails.
    private boolean isValidEmail(String value) {
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher matcher = pattern.matcher(value);
        return matcher.find();
    }

}