package com.podlasenko.example.message.factory;

import com.podlasenko.example.message.JsonMessage;
import com.podlasenko.example.message.Message;
import com.podlasenko.example.message.TextMessage;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;

public class MessageCreatorTest {

    MessageCreator textMessageCreator;
    MessageCreator jsonMessageCreator;

    @Before
    public void setup() {
        textMessageCreator = new TextMessageCreator();
        jsonMessageCreator = new JsonMessageCreator();
    }

    @Test
    public void getMessage_ShouldReturnTextMessage() {
        Message textMessage = textMessageCreator.getMessage();

        assertThat(textMessage, instanceOf(TextMessage.class));
    }

    @Test
    public void getMessage_ShouldReturnJsonMessage() {
        Message jsonMessage = jsonMessageCreator.getMessage();

        assertThat(jsonMessage, instanceOf(JsonMessage.class));
    }
}
