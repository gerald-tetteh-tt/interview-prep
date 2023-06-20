package io.turntabl;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterCount {

    public static Map<Character,Long> countCharacters(List<Character> characterList) {
        return characterList
                .stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
    }
}
