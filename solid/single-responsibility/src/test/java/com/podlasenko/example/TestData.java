package com.podlasenko.example;

public class TestData {

    public static final String VALID_USER_JSON =
            "{\"name\": \"Yevhen\", \"email\": \"yevhen@email.com\", \"address\":\"110 Miami lane\"}";

    // Invalid USER JSON String - email format wrong
    public static final String INVALID_USER_JSON =
            "{\"name\": \"Sam\", \"email\": \"sam@email\", \"address\":\"111 Sugar lane\"}";
}
