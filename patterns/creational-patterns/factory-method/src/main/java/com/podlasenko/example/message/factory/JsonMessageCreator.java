package com.podlasenko.example.message.factory;

import com.podlasenko.example.message.JsonMessage;
import com.podlasenko.example.message.Message;

public class JsonMessageCreator extends MessageCreator {

    @Override
    protected Message createMessage() {
        return new JsonMessage();
    }
}
