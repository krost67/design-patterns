package com.podlasenko.example.wrong;

import com.podlasenko.example.exception.FormatException;
import com.podlasenko.example.formatter.Formatter;
import com.podlasenko.example.formatter.JSONFormatter;
import com.podlasenko.example.model.Message;

public class WrongMessagePrinter {

    // printer depends on formatter
    public String printMessage(Message msg) throws FormatException {
        Formatter formatter = new JSONFormatter();

        String formattedMessage = formatter.format(msg);
        System.out.println(formattedMessage);

        return formattedMessage;
    }
}
