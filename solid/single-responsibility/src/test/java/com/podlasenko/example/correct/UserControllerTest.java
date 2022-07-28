package com.podlasenko.example.correct;

import com.podlasenko.example.wrong.WrongUserController;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static com.podlasenko.example.TestData.INVALID_USER_JSON;
import static com.podlasenko.example.TestData.VALID_USER_JSON;
import static org.junit.Assert.assertEquals;

public class UserControllerTest {
    private UserController controller;

    @Before
    public void setup() {
         controller = new UserController();
    }

    @Test
    public void createUser_ShouldReturnSuccess() throws IOException {
        String response = controller.createUser(VALID_USER_JSON);
        assertEquals("SUCCESS", response);
    }

    @Test
    public void createUser_ShouldReturnError() throws IOException {
        String response = controller.createUser(INVALID_USER_JSON);
        assertEquals("ERROR", response);
    }
}
