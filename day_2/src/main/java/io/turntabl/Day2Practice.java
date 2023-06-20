package io.turntabl;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Day2Practice {

    public <T>T findMostCommonInList(List<T> items) {
        Optional<Map.Entry<T, Long>> maxItem =  items.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue());
        return maxItem.map(Map.Entry::getKey).orElse(null);
    }

    public <T>List<T> removeAdjacentToMostCommon(List<T> items) {
        T maxItem = findMostCommonInList(items);
        return IntStream.range(0,items.size())
                .filter((index) -> {
                    if(index == 0 || items.get(index) == maxItem) {
                        return true;
                    }
                    return items.get(index - 1) != maxItem;
                })
                .mapToObj(items::get)
                .toList();
    }
}
