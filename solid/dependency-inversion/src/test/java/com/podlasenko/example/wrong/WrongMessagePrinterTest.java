package com.podlasenko.example.wrong;

import com.podlasenko.example.exception.FormatException;
import org.junit.Before;
import org.junit.Test;

import static com.podlasenko.example.TestData.prepareTestMessage;
import static org.junit.Assert.assertEquals;

public class WrongMessagePrinterTest {

    private WrongMessagePrinter messagePrinter;

    @Before
    public void setup() {
        messagePrinter = new WrongMessagePrinter();
    }

    @Test
    public void printMessage() throws FormatException {
        String message = messagePrinter.printMessage(prepareTestMessage());
        assertEquals("{\"msg\":\"Test message\",\"datetime\":[2022,7,28,12,30]}", message);
    }
}
