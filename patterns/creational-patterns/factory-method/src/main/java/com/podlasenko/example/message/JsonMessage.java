package com.podlasenko.example.message;

public class JsonMessage extends Message {

    @Override
    public String getContent() {
        return "{\"text]\":\"Hello World\"}";
    }
}
