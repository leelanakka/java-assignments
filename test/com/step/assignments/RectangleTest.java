package com.step.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @Test
    void getWidth() {
        Rectangle rectangle = new Rectangle(2, 4);
        assertEquals(2,rectangle.getWidth());
    }

    @Test
    void getLength() {
        Rectangle rectangle = new Rectangle(4, 10);
        assertEquals(10,rectangle.getLength());
    }

    @Test
    void getArea(){
        Rectangle rectangle = new Rectangle(5, 10);
        assertEquals(50,rectangle.getArea());
    }
}