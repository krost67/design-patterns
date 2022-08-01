package com.podlasenko.example.model;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static com.podlasenko.example.TestData.prepareCircle;
import static com.podlasenko.example.TestData.prepareRectangle;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

public class ShapeCloningTest {

    private List<Shape> shapes;
    private List<Shape> shapesCopy;

    @Before
    public void setup() {
        shapes = new ArrayList<>();
        shapesCopy = new ArrayList<>();

        shapes.add(prepareCircle());
        shapes.add(prepareRectangle());
    }

    @Test
    public void clone_ShouldReturnCorrectResult() {
        for (Shape shape : shapes) {
            shapesCopy.add(shape.clone());
        }

        assertEquals(2, shapesCopy.size());

        Shape circleCopy = shapesCopy.get(0);
        assertThat(circleCopy, instanceOf(Circle.class));
        assertEquals(shapes.get(0), circleCopy);

        Shape rectangleCopy = shapesCopy.get(1);
        assertThat(rectangleCopy, instanceOf(Rectangle.class));
        assertEquals(shapes.get(1), rectangleCopy);
    }

}
