package com.prepare.algo.ds;

import java.util.Comparator;

public class help {


    public static void main(String[] args){

        Comparator<String> stringComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }

        };
        int result = stringComparator.compare("hello","world");
        System.out.println(result);


        //Comparator<String> lambdaStringComparator = (o1,o2) -> o1.compareTo(o2);
       // System.out.println(lambdaStringComparator.compare("hello","world"));

    }
}
