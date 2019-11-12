package com.joy.effectivejava.c1.i4;

public class Computer {

    /**
     * private constructor
     */
    private Computer(){
        throw new AssertionError();
    }

    public final int TWO = 2;

    public static int add(int a, int b){
        return a + b;
    }

    public static int sub(int a, int b){
        return a - b;
    }

    public static int mult(int a, int b){
        return a * b;
    }

    public static int divide(int a, int b){
        return a/b;
    }

    public static int mod(int a, int b){
        return a%b;
    }


}
