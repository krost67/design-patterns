package com.podlasenko.example.correct;

import com.podlasenko.example.exception.FormatException;
import com.podlasenko.example.formatter.JSONFormatter;
import com.podlasenko.example.formatter.TextFormatter;
import org.junit.Before;
import org.junit.Test;

import static com.podlasenko.example.TestData.prepareTestMessage;
import static org.junit.Assert.assertEquals;

public class CorrectMessagePrinterTest {

    private MessagePrinter messagePrinter;

    @Before
    public void setup() {
        messagePrinter = new MessagePrinter();
    }

    @Test
    public void printMessage_ShouldReturnJSONFormat() throws FormatException {
        String jsonMessage = messagePrinter.printMessage(prepareTestMessage(), new JSONFormatter());
        assertEquals("{\"msg\":\"Test message\",\"datetime\":[2022,7,28,12,30]}", jsonMessage);
    }

    @Test
    public void printMessage_ShouldReturnTextFormat() throws FormatException {
        String textMessage = messagePrinter.printMessage(prepareTestMessage(), new TextFormatter());
        assertEquals("2022-07-28T12:30:Test message", textMessage);
    }
}
