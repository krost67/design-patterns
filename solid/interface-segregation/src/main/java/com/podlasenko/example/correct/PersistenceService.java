package com.podlasenko.example.correct;

import com.podlasenko.example.entity.Entity;

public interface PersistenceService<T extends Entity> {

    void save(T entity);

    void delete(T entity);

    T findById(Long id);
}
