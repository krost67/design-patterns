package com.podlasenko.example;

public final class EagerSingleton {

    private static final EagerSingleton INSTANCE = new EagerSingleton();

    private EagerSingleton() {
        if (INSTANCE != null) {
            throw new UnsupportedOperationException();
        }
    }

    public static EagerSingleton getInstance() {
        return INSTANCE;
    }
}
