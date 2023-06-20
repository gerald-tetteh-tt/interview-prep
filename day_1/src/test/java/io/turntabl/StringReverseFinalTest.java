package io.turntabl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringReverseFinalTest {

    StringReverseFinal underTest = new StringReverseFinal();

    @Test
    void testReverseStringWithStream() {
        String input = "hello world";
        String expected = "dlrow olleh";

        String result = underTest.reverseWithStreamAndCollect(input);

        assertEquals(expected,result);
    }
}