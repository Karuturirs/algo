package com.prepare.algo;

import java.util.Arrays;
/***

given array A,B of n elements containing binary numbers. Create an array C of n+1 elements with sum of A and B elements.

**/

public class BinarySum{

  public static void main(String[] args){
      int[] A ={1,0,1,1};
      int[] B ={1,1,0,1};
      int[] C = new int[A.length+1];
      int carry = 0;
      for(int i=(A.length-1); i>=0; i--){
          C[i+1] = (A[i]+B[i]+carry)%2;
          carry = (A[i]+B[i]+carry)/2;
      }
      C[0] = carry;
      Arrays.stream(C)
      .forEach(i ->{
          System.out.print(i);
          System.out.print("\t");
      });
  }
}
