package com.prepare.algo.practice.crackingcodinginterview.recursion;

import java.math.BigInteger;

/**
 * Triple Step: A child is running up a staircase with n steps and can hop either 1 step, 2 steps, or 3
 * steps at a time. Implement a method to count how many possible ways the child can run up the
 * stairs.
 *
 * can be solved with Tribonacci Sequence
 */
public class BabySteps {

    public static void main(String[] args) {


        System.out.println("1:"+leafCountMemorization(1));
        System.out.println("2:"+leafCountMemorization(2));
        System.out.println("3:"+leafCountMemorization(3));
        System.out.println("4:"+leafCountMemorization(4));
        System.out.println("5:"+leafCountMemorization(5));
        System.out.println("6:"+leafCountMemorization(6));
        System.out.println("10:"+leafCountMemorization(10));
        System.out.println("100:"+leafCountMemorization(100));
        System.out.println("1000:"+leafCountMemorization(1000));
        System.out.println("10000:"+leafCountMemorization(10000));
        System.out.println("100000:"+leafCountMemorization(100000));

        System.out.println(leafCount(1,new BigInteger("0")));
        System.out.println(leafCount(2,new BigInteger("0")));
        System.out.println(leafCount(3,new BigInteger("0")));
        System.out.println(leafCount(4,new BigInteger("0")));
        System.out.println(leafCount(5,new BigInteger("0")));
        System.out.println(leafCount(6,new BigInteger("0")));
        System.out.println(leafCount(10 ,new BigInteger("0")));
        System.out.println(leafCount(100 ,new BigInteger("0")));
        System.out.println(leafCount(1000 ,new BigInteger("0")));
        System.out.println(leafCount(10000 ,new BigInteger("0")));
        System.out.println(leafCount(100000 ,new BigInteger("0")));
    }

    /**
     * using recursion method to find the leafs (Not good approach for big values of N)
     * @param n
     * @param count
     * @return
     */
    public static BigInteger leafCount(int n, BigInteger count){
        if(n<0){
            return count;
        }
        if(n==0){
           count =  count.add(new BigInteger("1"));
        }else{
            count = leafCount(n-1, count).add(
                    leafCount(n-2, count) ).add(
                    leafCount(n-3, count));
        }
        return count;
    }

    /**
     * Memorization bottom up approach
     * @param n
     * @return
     */
    public static BigInteger leafCountMemorization(int n){


        if(n<=0)
            return new BigInteger("0");

        BigInteger[] memo = new BigInteger[n+1];

        for(int i=0; i<n+1; i++){
            if(i==0) {
                memo[0] = new BigInteger("1");
            }else if(i==1){
                memo[1] = new BigInteger("1");

            }else if(i==2){
                memo[2] = new BigInteger("2");
            }else {
                memo[i] = memo[i - 1].add(memo[i - 2]).add(memo[i - 3]);
            }
        }

        return memo[n];
    }

}


