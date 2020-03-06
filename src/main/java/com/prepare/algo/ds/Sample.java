package com.prepare.algo.ds;

import java.util.Arrays;

public class Sample {


    // 0 1 1 2 3 5 .. n //
    // n=10
    public static void main(String[] args){

        int x =0 ;
        int y = 1;
        int temp = 0;
        for(int i=2; i<10; i++){
            temp = y;
            y =x+y;
            x =temp;
            System.out.println(y);
        }



    }


}
