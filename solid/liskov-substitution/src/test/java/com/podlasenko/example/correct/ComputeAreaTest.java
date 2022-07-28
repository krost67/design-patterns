package com.podlasenko.example.correct;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
    public void useShape_ShouldReturnCorrectResult_WhenRectangleIsUsing() {
        int area = useShape(rectangle);
        assertEquals(200, area);
    }

    @Test
    public void useShape_ShouldReturnCorrectResult_WhenSquareIsUsing() {
        int area = useShape(square);
        assertEquals(100, area);
    }

    private static int useShape(Shape shape) {
        return shape.computeArea();
    }
}
