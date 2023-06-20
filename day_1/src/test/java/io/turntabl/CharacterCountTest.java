package io.turntabl;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CharacterCountTest {

    @Test
    void testCountCharacters() {
        List<Character> input = List.of('c','c','d','d','c','f');

        Map<Character, Long> result = CharacterCount.countCharacters(input);

        assertEquals(3L,result.get('c'));
        assertEquals(2L,result.get('d'));
        assertEquals(1L,result.get('f'));
    }
}