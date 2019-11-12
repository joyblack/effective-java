package com.joy.effectivejava.c1.i2.simple;

import lombok.ToString;

@ToString
public class Student {
    private final String name;
    private final String idNumber;

    private final Integer age;
    private final Double weight;
    private final Double height;

    public static class Builder {
        // 必填设置为final
        private final String name;
        private final String idNumber;

        // 选填不设置
        private Integer age = null;
        private Double weight = null;
        private Double height = null;

        public Builder(String name, String idNumber){
            this.name = name;
            this.idNumber = idNumber;
        }

        public Builder age(Integer age){
            this.age = age;
            return this;
        }

        public Builder weight(Double weight){
            this.weight = weight;
            return this;
        }

        public Builder height(Double height){
            this.height = height;
            return this;
        }

        public Student build(){
            return new Student(this);
        }
    }

    /*
     * 使用builder的构造器
     */
    private Student(Builder builder){
        this.idNumber = builder.idNumber;
        this.name = builder.name;
        this.age = builder.age;
        this.weight = builder.weight;
        this.height = builder.height;
    }

}
