package com.github.UlrikeWerner.Extra;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 3, 3, 5, 7, 5, 1, 3};
        countUniqueValues(numbers);

        String[] names = {"Anna", "Chris", "Anna", "Lisa", "Noah", "Lisa", "Anna"};
        countUniqueValues(names);
    }

    public static void countUniqueValues(int[] array){
        Map<Integer, Integer> list = new HashMap<>();
        for (int element : array) {
            list.putIfAbsent(element, 0);
            list.put(element, list.get(element) +1);
        }
        System.out.println(list);
    }

    public static void countUniqueValues(Object[] array){
        Map<Object, Integer> list = new HashMap<>();
        for (Object element : array) {
            list.putIfAbsent(element, 0);
            list.put(element, list.get(element) +1);
        }
        System.out.println(list);
    }
}
