package com.podlasenko.example.correct;

import com.podlasenko.example.model.User;
import com.podlasenko.example.model.UserStorage;

public class UserRepository {
    private final UserStorage userStorage = new UserStorage();

    public void save(User user) {
        userStorage.store(user);
    }

    public User getByName(String name) {
        return userStorage.getByName(name);
    }
}
