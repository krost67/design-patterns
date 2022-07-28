package com.podlasenko.example.correct;

import com.podlasenko.example.entity.User;

import java.util.List;

public interface UserPersistenceService extends PersistenceService<User> {

    List<User> findByName(String name);
}
