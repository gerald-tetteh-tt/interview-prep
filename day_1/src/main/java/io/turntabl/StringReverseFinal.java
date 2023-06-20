package io.turntabl;

import java.util.stream.IntStream;

public class StringReverseFinal {

    public String reverseWithStream(String input) {
        StringBuilder stringBuilder = new StringBuilder();
        IntStream.range(0,input.length())
                .mapToObj(index -> input.charAt(input.length() - 1 - index))
                .forEach(stringBuilder::append);
        return stringBuilder.toString();
    }

    public String reverseWithStreamAndCollect(String input) {
        return IntStream.range(0,input.length())
                .mapToObj(index -> input.charAt(input.length() - 1 - index))
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append).toString();
    }
}
