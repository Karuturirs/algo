package com.prepare.algo.practice.crackingcodinginterview.recursion;

public class MagicIndex {

    public static void main(String[] args) {
        int[] A = {0,2,3,4,5,6};
        System.out.println(magicIndex(A));

    }

    public static int magicIndex(int[] array){
        if(array!= null){
            int i=array.length-1;
            while(i>=0){
                if(array[i]== i){
                 return i;
                }
                i--;
            }

        }

        return -1;
    }
}
