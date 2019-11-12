package com.joy.effectivejava.c2.I14;

import lombok.Data;
import lombok.ToString;

import java.util.Comparator;

@Data
public class Apple implements Comparable<Apple> {
    private String name;
    private String color;
    private Double weight;

    /**
     * 比较器
     */
    private static final Comparator<Apple> COMPARATOR =
            Comparator.comparing(Apple::getName)
            .thenComparing(Apple::getColor)
            .thenComparingDouble(Apple::getWeight);





    public Apple(String name, String color, Double weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    @Override
    public int compareTo(Apple o) {
        return COMPARATOR.compare(this, o);
    }

    @Override
    public String toString() {
        return "Apple{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}' + "\n";
    }
}
