package com.prepare.algo.practice.leetcode;


import java.util.HashMap;

/**
 * Write an algorithm to determine if a number is "happy".
 *
 * A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.
 *
 * Example:
 *
 * Input: 19
 * Output: true
 * Explanation:
 * 1^2 + 9^2 = 82
 * 8^2 + 2^2 = 68
 * 6^2 + 8^2 = 100
 * 1^2 + 0^2 + 0^2 = 1
 *
 */
public class HappyNumber {

    public static void main(String[] args) {

        int input = 19;
        HappyNumber hn = new HappyNumber();
        System.out.println(input+":"+hn.isHappy(input));

        for(int i=0; i<=1000; i++){
            System.out.println(i+":"+hn.isHappy(i));
        }

    }

    public boolean isHappy(int n) {
        HashMap<Integer, Integer> squares = new HashMap<>();
        int x = n;
        while(x != 1){
            if(squares.containsKey(x)){
                break ;
            }else{
                int y = squareOfNumber(x, 0) ;
                squares.put(x,y);
                x = y;
            }
        }
        return x==1 ? true:false;
    }

    public int squareOfNumber(int n, int sum){
        int reminder = n%10;  //0
        int quatient = n/10; //1

        sum += reminder*reminder;
        if(quatient!=0){
            sum = squareOfNumber(quatient, sum);
        }

        return sum;

    }


}
