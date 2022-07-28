package com.podlasenko.example.formatter;

import com.podlasenko.example.exception.FormatException;
import com.podlasenko.example.model.Message;

public interface Formatter {
    String format(Message message) throws FormatException;
}
