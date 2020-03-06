package com.prepare.algo;

import java.lang.Math;

/**
8n^2 <= 64nlgn
n <= 8logn
n/8 <= logn
2^(n/8) <= n
**/

/**
100n^2 <= 2^n

**/
public class Test{

  public static void main(String[] args){
     int n =0;

     while( (100*Math.pow(n,2)) <= Math.pow(2,n)){
       n++;
       System.out.println("---->"+n);
     }
     System.out.println("Final value :"+(n-1));
  }

}
