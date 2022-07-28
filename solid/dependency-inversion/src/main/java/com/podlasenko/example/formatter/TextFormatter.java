package com.podlasenko.example.formatter;

import com.podlasenko.example.model.Message;

public class TextFormatter implements Formatter {

    public String format(Message message) {
        return message.getDatetime() + ":" + message.getMsg();
    }
}
