package com.prepare.algo.practice;

public class FactorialWithOutLoop {

    public static void main(String[] args) {
        FactorialWithOutLoop fb = new FactorialWithOutLoop();

        System.out.println(factorial(1)+ " "+factorialMemorization(1, new long[2])+" "+factorialBU(1));
        System.out.println(factorial(2)+ " "+factorialMemorization(2, new long[3])+" "+factorialBU(2));
        System.out.println(factorial(3)+ " "+factorialMemorization(3, new long[4])+" "+factorialBU(3));
        System.out.println(factorial(5)+ " "+factorialMemorization(5, new long[6])+" "+factorialBU(5));
        System.out.println(factorial(10)+ " "+factorialMemorization(10, new long[11])+" "+factorialBU(10));
        System.out.println(factorial(100)+ " "+factorialMemorization(100, new long[101])+" "+factorialBU(100));
        System.out.println(factorial(200)+ " "+factorialMemorization(200, new long[201])+" "+factorialBU(200));
        System.out.println(factorial(1000)+ " "+factorialMemorization(1000, new long[1001])+" "+factorialBU(1000));

    }

    // recursive way
    public static long factorial(int n){
        if(n ==1 ){
            return 1;
        }
        return n * factorial(n-1);
    }

    //memorization or top to bottom
    public static long factorialMemorization(int n, long[] memo){
        long result =1;

        if(memo[n]!= 0)
            return memo[n];

        if(n==1)
            result = 1;
        else
            result = n * factorialMemorization(n-1, memo);

        memo[n] = result;

        return result;
    }

    //Bottom up approach
    public static long factorialBU(int n){

        int a = 1;

        for (int x=1; x<=n; x++) {
            a *= x;

        }
        return a;
    }
}
