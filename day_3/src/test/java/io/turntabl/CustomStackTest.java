package io.turntabl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CustomStackTest {
    private CustomStack<Integer> underTest;
    private final List<Integer> integerList = List.of(1,6,7,9,2,5,10,5,8,4);

    @BeforeEach
    void setUp() {
        underTest = new CustomStack<>(Integer.class,10);
    }

    @Test
    void testPush() throws Exception {
        underTest.push(integerList.get(0));
        underTest.push(integerList.get(1));
        underTest.push(integerList.get(2));

        assertEquals(integerList.get(2),underTest.pop());
        assertEquals(integerList.get(1),underTest.pop());
        assertEquals(integerList.get(0),underTest.pop());
    }

    @Test
    void testExceptionThrownOnOverflow() throws Exception {
        for (Integer number: integerList) {
            underTest.push(number);
        }

        assertThrows(Exception.class, () -> underTest.push(5));
    }

    @Test
    void peek() {
    }

    @Test
    void pop() {
    }
}