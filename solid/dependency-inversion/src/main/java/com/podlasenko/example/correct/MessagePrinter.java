package com.podlasenko.example.correct;

import com.podlasenko.example.exception.FormatException;
import com.podlasenko.example.formatter.Formatter;
import com.podlasenko.example.model.Message;

public class MessagePrinter {

    public String printMessage(Message msg, Formatter formatter) throws FormatException {
        String formattedMessage = formatter.format(msg);
        System.out.println(formattedMessage);

        return formattedMessage;
    }
}
