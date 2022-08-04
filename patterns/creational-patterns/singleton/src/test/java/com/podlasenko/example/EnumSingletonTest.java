package com.podlasenko.example;

import org.junit.Test;

import static org.junit.Assert.assertSame;

public class EnumSingletonTest {

    @Test
    public void getInstance_ShouldReturnSameObject() {
        EnumSingleton firstInstance = EnumSingleton.INSTANCE;
        EnumSingleton secondInstance = EnumSingleton.INSTANCE;

        assertSame(firstInstance, secondInstance);
    }
}
