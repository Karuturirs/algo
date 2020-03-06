package com.prepare.algo.practice;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
public interface Add {
    public int add(int x, int y);

    public default void display(){
        System.out.println("Hello World");
    }

    public default void println(){
        System.out.println("Hello World pri nt");
        List<String> a = new ArrayList<>();
        a.stream();
     }
}
