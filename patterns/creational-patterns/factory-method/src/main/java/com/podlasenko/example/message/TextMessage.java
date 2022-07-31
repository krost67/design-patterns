package com.podlasenko.example.message;

public class TextMessage extends Message {

    @Override
    public String getContent() {
        return "Hello World";
    }
}
