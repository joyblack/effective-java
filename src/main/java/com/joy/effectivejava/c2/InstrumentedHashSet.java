package com.joy.effectivejava.c2;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class InstrumentedHashSet<E> extends HashSet<E> {
    // 元素数量
    private int addCount = 0;

    public InstrumentedHashSet() {

    }

    public InstrumentedHashSet(int capacity, float loadFactor) {
        super(capacity, loadFactor);
    }

    @Override
    public boolean add(E e) {
        addCount ++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> e){
        addCount += e.size();
        return super.addAll(e);
    }

    public int getAddCount(){
        return addCount;
    }


    public static void main(String[] args) {
        InstrumentedHashSet<String> s = new InstrumentedHashSet<>();
        s.addAll(Arrays.asList("a","b","c"));
        // 6, this is a error result.
        System.out.println(s.addCount);
    }


}
