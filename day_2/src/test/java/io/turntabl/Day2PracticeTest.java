package io.turntabl;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Day2PracticeTest {

    private final Day2Practice underTest = new Day2Practice();

    @Test
    void findMostCommonInList() {
        List<Character> characterList = List.of('c','c','c','d','e','e');

        Character result = underTest.findMostCommonInList(characterList);

        assertEquals('c', result);
    }

    @Test
    void findMostCommonInEmptyList() {
        List<Character> characterList = List.of();

        Character result = underTest.findMostCommonInList(characterList);

        assertNull(result);
    }

    @Test
    void removeAdjacentToMostCommon() {
        List<Character> characterList = List.of('c','c','c','d','e','e');
        List<Character> expected = List.of('c','c','c','e','e');

        List<Character> filtredList = underTest.removeAdjacentToMostCommon(characterList);
        System.out.println(filtredList);

        assertEquals(expected,filtredList);
    }
}