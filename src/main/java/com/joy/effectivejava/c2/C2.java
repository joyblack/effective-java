package com.joy.effectivejava.c2;

import com.joy.effectivejava.c2.i10.PhoneNumber;

import java.util.HashMap;
import java.util.Map;

public class C2 {
    public static void main(String[] args) {
        Map<PhoneNumber, String> m = new HashMap<>();
        m.put(new PhoneNumber(1,2), "3");

        System.out.println(m.get(new PhoneNumber(1,2)));


    }
}
