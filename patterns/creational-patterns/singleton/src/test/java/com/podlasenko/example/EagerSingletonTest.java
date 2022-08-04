package com.podlasenko.example;

import org.junit.Test;

import static org.junit.Assert.assertSame;

public class EagerSingletonTest {

    @Test
    public void getInstance_ShouldReturnSameObject() {
        EagerSingleton firstInstance = EagerSingleton.getInstance();
        EagerSingleton secondInstance = EagerSingleton.getInstance();

        assertSame(firstInstance, secondInstance);
    }
}
