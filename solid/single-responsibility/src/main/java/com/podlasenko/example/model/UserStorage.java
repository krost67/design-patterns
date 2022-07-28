package com.podlasenko.example.model;

import java.util.HashMap;
import java.util.Map;

public class UserStorage {

    private static final Map<String, User> STORAGE = new HashMap<>();

    public void store(User user) {
        synchronized (STORAGE) {
            STORAGE.put(user.getName(), user);
        }
    }

    public User getByName(String name) {
        synchronized (STORAGE) {
            return STORAGE.get(name);
        }
    }
}