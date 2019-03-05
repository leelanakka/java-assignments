package com.step.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinutesAndSecondsTest {

    @Test
    void getDurationString() {
        String actual = MinutesAndSeconds.getDurationString(61,22);
        assertEquals("1h 1m 22s ",actual);
    }

    @Test
    void getDurationString1() {
        String actual = MinutesAndSeconds.getDurationString(48645900);
        assertEquals("13512h 45m 0s ",actual);
    }

    @Test
    void testForInvalidMessage() {
        String actual = MinutesAndSeconds.getDurationString(-1);
        assertEquals("invalid input",actual);
    }
}