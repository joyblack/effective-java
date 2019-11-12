package com.joy.effectivejava.c1.i3;

/**
 * 方式二：通过静态工厂方法
 */
public class MyLonelyLife2 {
    private static final MyLonelyLife2 INSTANCE = new MyLonelyLife2();

    private MyLonelyLife2(){

    }

    public static MyLonelyLife2 getInstance(){
        return INSTANCE;
    }




}
