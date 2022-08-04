package com.podlasenko.example;

import org.junit.Test;

import static org.junit.Assert.assertSame;

public class LazySingletonTest {

    @Test
    public void getInstance_ShouldReturnSameObject() {
        LazySingleton firstInstance = LazySingleton.getInstance();
        LazySingleton secondInstance = LazySingleton.getInstance();

        assertSame(firstInstance, secondInstance);
    }
}
