package com.prepare.algo.practice;

import java.util.*;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class AverageOfMatrix {

    public static void main(String[] args){

        double[][] array =  {{1.2,3.2}, {2.1,4.3}, {5.4,6.6},{9.0,2.1}};

        DoubleStream ss = Arrays.stream(array).flatMapToDouble(Arrays::stream);
        //ss.forEach(System.out::println);
        OptionalDouble average =ss.average();

        if(average.isPresent())
            System.out.println(average.getAsDouble());



        List<String> rows = null;/*new ArrayList<>();
        rows.add("RAVI");
        rows.add(null);
        rows.add("Sankar");*/
        for (String row:rows) {
            System.out.println(row);
        }

    }
}
