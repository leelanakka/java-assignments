package com.step.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CuboidTest {

    @Test
    void getHeight() {
        Cuboid cuboid = new Cuboid(5, 10, 15);
        assertEquals(5,cuboid.getHeight());
    }

    @Test
    void getVolume() {
        Cuboid cuboid = new Cuboid(5, 10, 5);
        assertEquals(250,cuboid.getVolume());
    }

}