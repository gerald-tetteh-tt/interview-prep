package io.turntabl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringReverseTest {
    private final String input = "hello there";
    private final String expected = "ereht olleh";

    @Test
    void reverseStringStream() {
        String result = StringReverse.reverseStringStream(input);

        assertEquals(expected,result);
    }

    @Test
    void recursiveReverse() {
        String result = StringReverse.reverseRecursion(input);

        assertEquals(expected,result);
    }
}