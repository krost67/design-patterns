package com.podlasenko.example.wrong;

import com.podlasenko.example.entity.Entity;

import java.util.List;

/*
 *  common interface to be implemented by all persistence services.
 */

public interface PersistenceService<T extends Entity> {

    void save(T entity);

    void delete(T entity);

    T findById(Long id);

    List<T> findByName(String name);
}
