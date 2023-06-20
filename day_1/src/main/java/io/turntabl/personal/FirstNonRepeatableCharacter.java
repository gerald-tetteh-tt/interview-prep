package io.turntabl.personal;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatableCharacter {

    public static Character firstUniqueChar(String input) {
        Optional<Map.Entry<Character,Long>> uniqueCharSet = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(set -> set.getValue() == 1L)
                .findFirst();
        return uniqueCharSet.get().getKey();
    }
}
