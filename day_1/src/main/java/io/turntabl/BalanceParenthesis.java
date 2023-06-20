package io.turntabl;

import java.util.Stack;

public class BalanceParenthesis {

    public static boolean isBalancedParenthesis(String input) {
        Stack<Character> parenthesisStack = new Stack<>();
        for (char bracket: input.toCharArray()) {
            if(bracket == '(') {
                parenthesisStack.push(bracket);
            } else {
                if(parenthesisStack.isEmpty()) {
                    return false;
                }
                parenthesisStack.pop();
            }
        }
        return parenthesisStack.isEmpty();
    }

    public static boolean isBalancedBrackets(String input, char open) {
        int bracketCounter = 0;
        for (char bracket: input.toCharArray()) {
            if(bracket == open) {
                bracketCounter++;
            } else {
                if(bracketCounter < 1) {
                    return false;
                }
                bracketCounter--;
            }
        }
        return bracketCounter == 0;
    }
}
