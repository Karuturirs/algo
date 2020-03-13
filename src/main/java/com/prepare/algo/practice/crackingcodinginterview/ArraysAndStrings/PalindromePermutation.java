package com.prepare.algo.practice.crackingcodinginterview.ArraysAndStrings;

import java.util.HashMap;

/**
 * Cracking coding interview
 * Chapter 1 Arrays and Strings
 * (1.2) Page 90
 * Given a string, write a function to check if it is a permutation of a palindrome.
 * A palindrome is a word or phrase that is the same forwards and backwards. A permutation
 * is a rearrangement of letters. The palindrome does not need to be limited to just dictionary words.
 * EXAMPLE
 * Input: Tact Coa
 * Output: True (permutations: "taco cat", "atco eta", etc.)
 * Time complexity: O(n)
 * Space complexity: O(n)  can be done in O(1) using bit vector( TODO )
 */
public class PalindromePermutation {

    public static void main(String[] args) {
        String a = "aba";
        PalindromePermutation pp =  new PalindromePermutation();
        System.out.println(pp.isPalindrome(a));
        System.out.println(pp.isPalindrome("a"));
        System.out.println(pp.isPalindrome(""));
        System.out.println(pp.isPalindrome(null));
        System.out.println(pp.isPalindrome("abba"));
        System.out.println(pp.isPalindrome("abbaa"));
        System.out.println(pp.isPalindrome("abbaaaaaaaaaaaaa"));
    }

    public boolean isPalindrome(String word){
        if(word == null || word == ""){
           return false;
        }

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for(int i=0; i<word.length();i++){
            char ele = word.charAt(i);
            if(map.containsKey(ele)){
                int count = map.get(ele);
                map.put(ele, count+1);
            }else{
                map.put(ele, 1);
            }
        }

        int onces = 0;

        for(int value:map.values()){
            if(value ==1){
                onces++;
            }else if(value%2 !=0){
                return false;
            }
        }


        return onces <= 1;
    }

}
