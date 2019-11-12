package com.joy.effectivejava.c2.I14;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Item14 {
    public static void main(String[] args) {
        List<Apple> list = Arrays.asList(
                new Apple("a", "red", 14D),
                new Apple("a", "yellow", 14D),
                new Apple("a", "purple", 14D),
                new Apple("a", "ccc", 15D),
                new Apple("a", "ccc", 15D),
                new Apple("a", "ccc", 13D),
                new Apple("a", "ccc", 14D),
                new Apple("a", "ccc", 16D),
                new Apple("a", "ggg", 1D),
                new Apple("a", "sss", 1D),
                new Apple("a", "rrr", 14D),
                new Apple("a", "ttt", 14D),
                new Apple("a", "yyy", 14D),
                new Apple("a", "uuu", 14D)

        );
        Collections.sort(list);
        System.out.println(list);
    }
}
