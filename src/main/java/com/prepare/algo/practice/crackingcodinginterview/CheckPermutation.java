package com.prepare.algo.practice.crackingcodinginterview;

import java.util.Arrays;

/**
 * Cracking coding interview
 * Chapter 1 Arrays and Strings
 * (1.2) Page 90
 * Check Permutation: Given two strings, write a method to decide if one is a permutation of the other.
 * O(nlogn)
 */
public class CheckPermutation {

    public static void main(String[] args) {
        String a = "raaavir";
        String b = "rivaaar";
        System.out.println(isAPermutaion(a,b));
        System.out.println(isAPermutaion(null,null));
    }

    public static boolean isAPermutaion(String a, String b){
        if(a==null || b==null){
            return false;
        }
        if(a.length() == b.length()){
            char[] x = a.toCharArray();
            char[] y = b.toCharArray();
            Arrays.sort(x);
            Arrays.sort(y);

            return String.valueOf(x).equals(String.valueOf(y));

            /*int i=0;
            while(i < x.length){
                if(x[i] != y[i++]){
                    return false;
                }
            }
            return true;*/
        }else{
            return false;
        }

    }

}
