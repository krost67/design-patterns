package com.podlasenko.example.model;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TextMessage implements Message {

    private final String message;

    @Override
    public String getContent() {
        return message;
    }
}
