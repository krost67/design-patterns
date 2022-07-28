package com.podlasenko.example.correct;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.podlasenko.example.model.User;

public class UserObjectMapper {
    private final ObjectMapper mapper = new ObjectMapper();

    public User mapUser(String userJson) throws JsonProcessingException {
        return mapper.readValue(userJson, User.class);
    }
}
