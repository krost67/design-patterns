package com.podlasenko.example;

import com.podlasenko.example.model.Circle;
import com.podlasenko.example.model.Rectangle;
import com.podlasenko.example.model.Shape;
import lombok.experimental.UtilityClass;

@UtilityClass
public class TestData {

    public static Shape prepareCircle() {
        Circle circle = new Circle();
        circle.setX(10);
        circle.setY(20);
        circle.setRadius(15);
        circle.setColor("red");
        return circle;
    }

    public static Shape prepareRectangle() {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(10);
        rectangle.setHeight(20);
        rectangle.setColor("blue");
        return rectangle;
    }
}
