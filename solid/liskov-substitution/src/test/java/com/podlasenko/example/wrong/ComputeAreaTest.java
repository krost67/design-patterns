package com.podlasenko.example.wrong;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class ComputeAreaTest {
    private Rectangle rectangle;
    private Square square;

    @Before
    public void setup() {
        rectangle = new Rectangle(10, 20);
        square = new Square(10);
    }

    @Test
    public void computeArea_ShouldReturnCorrectResult_WhenRectangleIsUsing() {
        int area = rectangle.computeArea();
        assertEquals(200, area);
    }

    @Test
    public void computeArea_ShouldReturnCorrectResult_WhenSquareIsUsing() {
        int area = square.computeArea();
        assertEquals(100, area);
    }

    @Test
    public void useRectangle_ShouldReturnCorrectResult_WhenRectangleIsUsing() {
        Rectangle rectangle = new Rectangle();
        useRectangle(rectangle);
        assertEquals(20, rectangle.getHeight());
        assertEquals(30, rectangle.getWidth());
        useRectangle(square);
    }

    @Test
    public void useRectangle_ShouldReturnIncorrectResult_WhenSquareIsUsing() {
        Square square = new Square();
        useRectangle(square);
        assertNotEquals(20, square.getHeight());
        assertEquals(30, square.getWidth());
    }

    private static void useRectangle(Rectangle rectangle) {
        rectangle.setHeight(20);
        rectangle.setWidth(30);
    }
}
