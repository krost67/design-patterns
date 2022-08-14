package com.podlasenko.example.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MessageDecoratorTest {

    private Message message;

    @Before
    public void setup() {
        message = new TextMessage("<Hello world!>");
    }

    @Test
    public void getContent_ShouldReturnDecoratorImplementation() {
        String initialMessage = message.getContent();
        assertEquals("<Hello world!>", initialMessage);

        message = new HtmlEncodedMessage(message);
        String htmlEncodedMessage = message.getContent();
        assertEquals("&lt;Hello world!&gt;", htmlEncodedMessage);

        message = new Base64EncodedMessage(message);
        String base64EncodedMessage = message.getContent();
        assertEquals("Jmx0O0hlbGxvIHdvcmxkISZndDs=", base64EncodedMessage);
    }

}
