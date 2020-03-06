package com.prepare.algo.practice;

import java.util.Arrays;

public class SubStringPalandroms {

    public static void main(String[] args){
        SubStringPalandroms sbp =  new SubStringPalandroms();

        String[] teststring = {"aba", "a", "sfsadfgsdassa", "fsgfgsgdsfdgsgdfgdgsdfgsdgfs", "aaaaaaaaaaaaaaaaaaaa"};

        Arrays.stream(teststring).forEach(x-> System.out.println(sbp.countSubstrings(x) == sbp.bruceForce(x)? true:false));
    }


    public int countSubstrings(String s) {

        int x =0;
        for(int i=0;i< s.length(); i++){
            x += findPalandrom(s, i, i);
            x += findPalandrom(s, i, i+1);

        }
        System.out.println("-->"+x);
        return x;
    }

    public int findPalandrom(String s, int left, int right){
        int x =0;
        while(left >= 0 && right< s.length() && s.charAt(left) == s.charAt(right)){
            x++;
            left--;
            right++;
        }
        return x;
    }

    public int bruceForce(String s) {
        int x = s.length();

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {

                String substring = s.substring(i, j + 1);
                // System.out.println(substring);
                if (isPalandrome(substring)) {
                    x++;
                }
            }
        }
        return x;
    }

    public boolean isPalandrome(String sub){
        StringBuilder sb = new StringBuilder();
        sb.append(sub);
        sb.reverse();
        //System.out.println(sb +"  :  "+sub);
        return sub.equals(sb.toString());
    }


}
