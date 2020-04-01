package com.prepare.algo.practice;

import java.util.*;
import java.util.stream.Collectors;

public class WordCountEngine {

    public static void main(String[] args){
        String document = "Practice makes perfect. you'll only get Perfect by practice. just practice!";
        wordCountEngine(document);

        System.out.println(reverse(document));
    }

    public static String[][] wordCountEngine(String document){

        String[][] ne = {{"dd","gg"},{"oo","ii"}};
        String[] words = document.split(" ");
        List<String> wordlist = Arrays.stream(words).map( x-> {
                                    x = x.toLowerCase();
                                    return x.toLowerCase().replaceAll("\\W", "");
                                }).collect(Collectors.toList());
        LinkedHashMap<String,Integer> aa = new LinkedHashMap<>();

        wordlist.stream().forEach(x-> {
            if(aa.containsKey(x)){
                int j = aa.get(x)+1;
                aa.put(x, j);
            }else{
                aa.put(x, 1);
            }
        });
       // aa.forEach(new Comparator<>());
        return ne;
    }

    public static String reverse(String document){
        char[] c = new char[document.length()];
        int i = document.length()-1;
        int j=0;
        while(i>=0){
           c[j] = document.charAt(i);
           j++;
           i--;
        }
        return String.valueOf(c);
    }
}
