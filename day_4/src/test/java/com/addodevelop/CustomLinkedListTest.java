package com.addodevelop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CustomLinkedListTest {
    CustomLinkedList<Integer> underTest;

    @BeforeEach
    void setUp() {
        underTest = new CustomLinkedList<>();
    }

    @Test
    void add() {
        underTest.add(5);
        underTest.add(10);

        assertEquals(5,underTest.poll());
        assertEquals(1,underTest.getLength());
    }

    @Test
    void poll() {
        underTest.add(5);
        underTest.add(7);

        assertEquals(5,underTest.poll());
    }

    @Test
    void testReturnTrueOnLoop() {
    }
}