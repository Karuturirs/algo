package com.prepare.algo.practice;

import java.util.Arrays;
import java.util.List;

public class StreamExample1 {
    public static void main(String[] args){
        List<String> brandList = Arrays.asList("Honda","Toyota","Tesla","Audi");
        Object prefix1 = "car";

        brandList.stream()
                .filter(name -> name != "Tesla")
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
    }
}
