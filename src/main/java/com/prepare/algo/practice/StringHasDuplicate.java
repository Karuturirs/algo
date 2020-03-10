package com.prepare.algo.practice;

import java.util.Arrays;

public class StringHasDuplicate {

    public static void main(String[] args){
        String name = "ravi";
        StringHasDuplicate shd = new StringHasDuplicate();
       System.out.println(shd.hasDuplicate(name));
    }

    public boolean hasDuplicate(String word){
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
