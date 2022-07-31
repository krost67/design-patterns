package com.podlasenko.example.message.factory;

import com.podlasenko.example.message.Message;
import com.podlasenko.example.message.TextMessage;

public class TextMessageCreator extends MessageCreator {

    @Override
    protected Message createMessage() {
        return new TextMessage();
    }
}
