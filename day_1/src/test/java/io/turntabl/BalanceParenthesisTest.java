package io.turntabl;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class BalanceParenthesisTest {

    @ParameterizedTest
    @CsvSource({"(()),true","()()(()),true",")(,false","()()((),false"})
    void testBalanceOnlyParenthesis(String input, boolean expected) {
        boolean result = BalanceParenthesis.isBalancedParenthesis(input);

        assertEquals(expected,result);
    }

    @ParameterizedTest
    @CsvSource({"[[]],[,true","{{}}},{,false","(())(),(,true","[][][[[]]][],[,true"})
    void testDifferentBracketBalanced(String input, char type, boolean expected) {
        boolean result = BalanceParenthesis.isBalancedBrackets(input,type);

        assertEquals(expected,result);
    }
}