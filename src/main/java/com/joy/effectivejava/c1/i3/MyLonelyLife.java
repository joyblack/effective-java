package com.joy.effectivejava.c1.i3;

/**
 * 方式一：通过公有域方式
 */
public class MyLonelyLife {
    public static final MyLonelyLife INSTANCE = new MyLonelyLife();

    private MyLonelyLife(){

    }


}
