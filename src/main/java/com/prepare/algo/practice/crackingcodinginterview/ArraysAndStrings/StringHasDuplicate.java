package com.prepare.algo.practice.crackingcodinginterview.ArraysAndStrings;

import java.util.Arrays;

/**
 * Cracking coding interview
 * Chapter 1 Arrays and Strings
 * (1.1) Page 90
 * Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you
 * cannot use additional data structures?
 * O(nlogn)
 */
public class StringHasDuplicate {

    public static void main(String[] args){
        String name = "ravi";
        StringHasDuplicate shd = new StringHasDuplicate();
       System.out.println(shd.hasDuplicate(name));
        System.out.println(shd.hasDuplicate(""));
        System.out.println(shd.hasDuplicate(null));
    }

    public boolean hasDuplicate(String word){
        if(word ==null){
            return false;
        }
        char[] elements = word.toLowerCase().toCharArray();
        Arrays.sort(elements);
        int i=1;
        while(i<elements.length){
            int x = elements[i-1];
            int y = elements[i++];
            System.out.println(x +"---"+ y+"  "+i);
            if(x==y){
                return true;
            }
        }
        return false;
    }
}
