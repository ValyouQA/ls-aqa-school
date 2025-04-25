package ru.ls.qa.school.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OddTaskTest {
    @Test
    public void testIsOdd() {
        assertTrue(OddTask.isOdd(1));
        assertFalse(OddTask.isOdd(2));
        assertTrue(OddTask.isOdd(3));
        assertFalse(OddTask.isOdd(0));
        assertTrue(OddTask.isOdd(-5));
    }

    @Test
    public void testIsOdd2() {
        assertTrue(OddTask.isOdd(Integer.MAX_VALUE));
        assertFalse(OddTask.isOdd(Integer.MAX_VALUE - 1));
        assertTrue(OddTask.isOdd(Integer.MIN_VALUE + 1));
        assertFalse(OddTask.isOdd(Integer.MIN_VALUE));
    }

}