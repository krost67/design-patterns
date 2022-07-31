package com.podlasenko.example.message.factory;

import com.podlasenko.example.message.Message;

public abstract class MessageCreator {

    public Message getMessage() {
        Message message = createMessage();
        message.encryptMessage();
        return message;
    }

    protected abstract Message createMessage();
}
