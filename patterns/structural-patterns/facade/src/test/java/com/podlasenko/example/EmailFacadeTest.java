package com.podlasenko.example;

import com.podlaseko.example.EmailFacade;
import com.podlaseko.example.Order;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class EmailFacadeTest {

    private EmailFacade emailFacade;

    @Before
    public void setup() {
        emailFacade = new EmailFacade();
    }

    @Test
    public void sendOrderEmail_ShouldReturnCorrectResult() {
        Order order = new Order("111-222-333", 99.00);
        boolean result = emailFacade.sendOrderEmail(order);

        assertTrue(result);
    }
}
