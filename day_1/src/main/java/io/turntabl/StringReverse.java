package io.turntabl;

import java.util.stream.IntStream;

public class StringReverse {

    public static String reverseStringStream(String input) {
        char[] splitString = input.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        IntStream.range(0, splitString.length)
                .mapToObj((i) -> splitString[splitString.length - 1 - i])
                .forEach(stringBuilder::append);
        return stringBuilder.toString();
    }

    public static String reverseRecursion(String input) {
        return reverseProcessor(input.length() - 1, input, "");
    }

    private static String reverseProcessor(int index, String input, String result) {
        if(index < 1) {
            return result + input.charAt(0);
        }
        result += input.charAt(index);
        return reverseProcessor(index - 1, input, result);
    }
}
