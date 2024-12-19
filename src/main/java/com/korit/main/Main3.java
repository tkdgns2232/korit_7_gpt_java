package com.korit.main;


import com.korit.util.ForEachPrinter2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// 제네릭
public class Main3 {
    public static boolean test(){
        boolean result = false;
        result = 10 % 2 == 0;
        return result;
    }

    public static void main(String[] args) {
        String[] names = new String[] {"a", "b", "c"};
        Integer[] numbers = new Integer[] {1, 2, 3};

        List<Integer> list = List.of(1,2,3,4,5); // of는 상수 역할
        List<Integer> list2 = new ArrayList<>(list);
        list2.addAll(list);
        list2.add(10);

        List<Integer> list3 = list.stream().collect(Collectors.toList());
        list3.add(20);
    }
}
