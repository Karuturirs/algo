package com.prepare.algo.practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithNoDuplicates {


    public static void main(String[] args){

        String s = "ravisankar";

        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            // try to extend the range [i, j]
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            }
            else {
                set.remove(s.charAt(i++));
            }
        }
        System.out.println(ans);
        slidewindow();
    }


    public static void slidewindow(){
        // Big O(n)
        String name = "ravisankar";

        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;
        for(int j=0,i=0; j< name.length(); j++){
            if(map.containsKey(name.charAt(j))){
                i = Math.max(map.get(name.charAt(j)),i);
            }
            max = Math.max(max , j-i+1);
            map.put(name.charAt(j), j+1);

        }

        System.out.println(max);
    }
}
