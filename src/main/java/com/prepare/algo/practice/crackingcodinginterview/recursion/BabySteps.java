package com.prepare.algo.practice.crackingcodinginterview.recursion;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * Triple Step: A child is running up a staircase with n steps and can hop either 1 step, 2 steps, or 3
 * steps at a time. Implement a method to count how many possible ways the child can run up the
 * stairs.
 *
 * can be solved with Tribonacci Sequence : Dynamic programming recursion or Bottom up approach
 *  Other way is using matrix
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
        System.out.println("31:"+leafCountMemorization(31));
        System.out.println("1000:"+leafCountMemorization(1000));
        System.out.println("10000:"+leafCountMemorization(10000));
        System.out.println("100000:"+leafCountMemorization(100000));

       leafCountMemorizationTB(1);
       leafCountMemorizationTB(2);
       leafCountMemorizationTB(3);
       leafCountMemorizationTB(4);
       leafCountMemorizationTB(5);
       leafCountMemorizationTB(6);
       leafCountMemorizationTB(10 );
       leafCountMemorizationTB(100 );
       leafCountMemorizationTB(1000 );
       //Causes stack overflow too many recursive
       /*leafCountMemorizationTB(10000 );
       leafCountMemorizationTB(100000 );*/

        System.out.println(leafCount(1));
        System.out.println(leafCount(2));
        System.out.println(leafCount(3));
        System.out.println(leafCount(4));
        System.out.println(leafCount(5));
        System.out.println(leafCount(6));
        System.out.println(leafCount(10 ));
        // too many recursive
        /*System.out.println(leafCount(100 ));
        System.out.println(leafCount(1000 ));
        System.out.println(leafCount(10000 ));
        System.out.println(leafCount(100000 ));*/
    }

    /**
     * using recursion method to find the leafs (Not good approach for big values of N)
     * @param n
     * @return
     */
    public static BigInteger leafCount(int n){
        if(n<0){
            return new BigInteger("0");
        }
        else if(n==0){
          return new BigInteger("1");
        }else{
           return leafCount(n-1).add(
                    leafCount(n-2) ).add(
                    leafCount(n-3));
        }

    }

    /**
     * Memorization top to bottom approach with recursive too
     * @param n
     * @return
     */
    public static void leafCountMemorizationTB(int n){

       BigInteger[] memo = new BigInteger[n+1];
       Arrays.fill(memo, new BigInteger("-1"));
       System.out.println( n+":"+leafCountTB( n, memo));

    }

    /**
     *
     * @param n
     * @param memo
     * @return
     */
    public static BigInteger leafCountTB(int n, BigInteger[] memo){
        if(n<0){
            return new BigInteger("0");
        }else if(n==0){
            return new BigInteger("1");
        }else if(memo[n].equals(new BigInteger("-1"))){
            memo[n] =  leafCountTB(n-1, memo).add(leafCountTB(n-2, memo)).add(leafCountTB(n-3,memo));
            return memo[n];
        }else{
            return memo[n];
        }
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


