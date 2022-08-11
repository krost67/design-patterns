package com.podlasenko.example;

import org.junit.Before;
import org.junit.Test;

import static com.podlasenko.example.TestData.prepareEmployee;
import static org.junit.Assert.assertEquals;

public class BusinessCardDesignerTest {

    private BusinessCardDesigner businessCardDesigner;

    @Before
    public void setup() {
        businessCardDesigner = new BusinessCardDesigner();
    }

    @Test
    public void designCard_ShouldReturnCorrectResult() {
        Customer adapter = new EmployeeObjectAdapter(prepareEmployee());

        String result = businessCardDesigner.designCard(adapter);
        assertEquals("Elliot Alderson\n" +
                "Security Engineer\n" +
                "Allsafe Cybersecurity, New York City, New York", result);
    }
}
