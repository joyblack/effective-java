package com.joy.effectivejava.c1.i4;

/**
 * 第4条：通过使用私有构造器的方式来强化【不可实例化类】
 * 一般这种类，我们只使用他的方法、静态成员。
 */
public class Item4 {
    public static void main(String[] args) {
        // This will be error.
        // Computer computer = new Computer();
        System.out.println(Computer.mod(3, 4));
    }

}
