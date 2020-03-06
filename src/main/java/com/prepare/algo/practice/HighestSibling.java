package com.prepare.algo.practice;

import java.util.Arrays;

/**
 * Given an integer  N in range [0......2,147,483,647]
 * ex: 553 siblings are 355,535, 553 return max sibling 533
 *     213 return  should be 321.
 *      if no sibling return -1 if result exceeds 100,000,000
 *
 *
 */

public class HighestSibling {

    public static void main(String[] args){
        //long x = ;
        //int
        System.out.println(1<<3);

        System.out.println(10<<2);//10*2^2=10*4=40
        System.out.println(10<<3);//10*2^3=10*8=80
        System.out.println(20<<2);//20*2^2=20*4=80
        System.out.println(15<<4);//15*2^4=15*16=240

        System.out.println(findMaxSibling(355));
        System.out.println(findMaxSibling(123));
        System.out.println(findMaxSibling(211453534));

    }


    public static int findMaxSibling(int x) {
        String s = String.valueOf(x);
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        StringBuilder sb = new StringBuilder();
        for(int i =ch.length-1; i>=0; i--) {
            sb.append(ch[i]);
        }
        return Integer.parseInt(sb.toString());

    }


}
