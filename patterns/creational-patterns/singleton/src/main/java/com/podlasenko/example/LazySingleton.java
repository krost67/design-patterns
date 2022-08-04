package com.podlasenko.example;

public final class LazySingleton {

    private static volatile LazySingleton INSTANCE;

    private LazySingleton() {
        if (INSTANCE != null) {
            throw new UnsupportedOperationException();
        }
    }

    public static LazySingleton getInstance() {
        if (INSTANCE == null) {
            synchronized (LazySingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new LazySingleton();
                }
            }
        }

        return INSTANCE;
    }
}
