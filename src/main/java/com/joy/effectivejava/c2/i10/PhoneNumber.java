package com.joy.effectivejava.c2.i10;

import java.util.Objects;

/**
 * 10. 覆盖equals时，也请覆盖hashCode方法。
 */
public class PhoneNumber {


    private Integer a;
    private Integer b;

    public PhoneNumber(Integer a, Integer b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneNumber that = (PhoneNumber) o;
        return Objects.equals(a, that.a) &&
                Objects.equals(b, that.b);
    }

    /**
     * 若不覆盖此方法将导致【值相等】的对象对于基于散列的集的key无法正常工作。
     */
    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }
}
