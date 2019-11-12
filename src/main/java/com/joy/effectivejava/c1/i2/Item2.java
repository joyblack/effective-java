package com.joy.effectivejava.c1.i2;

import com.joy.effectivejava.c1.i2.simple.Student;

/**
 * 第2条：遇到多个构造器参数时要考虑使用构建器
 * 1.simple：简单构造器
 * 2.layer：类层次结构构造器
 */
public class Item2 {
    public static void main(String[] args) {
        Student student = new Student.Builder("joy_black", "522401199401025931")
                .age(26)
                .height(20.1D)
                .weight(30.2D)
                .build();

        Student student2 = new Student.Builder("joy_black", "522401199401025931")
                .build();

        System.out.println(student);
        System.out.println(student2);


    }
}
