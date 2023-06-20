package io.turntabl.personal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstNonRepeatableCharacterTest {

    @Test
    void testFindFirstNonRepeatingCharacter() {
        Character result = FirstNonRepeatableCharacter.firstUniqueChar("zzzzzbbbccccddehhhhiii");

        assertEquals('e', result);
    }
}