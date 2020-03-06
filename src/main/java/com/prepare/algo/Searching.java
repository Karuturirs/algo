package com.prepare.algo;

/**
 given A ={a1,a2,a3,a4,a5} find v , given index i such that v = a[i] and Nil if v doesnot exists in A.
*/

public class Searching{
  public static void main(String[] args){
     int[] a = {5, 7, 8, 1,3, 2, 10, 9, 11 };
     int v = Integer.parseInt(args[0]);
     boolean flag = true;
     for(int i=0; i<a.length; i++){
       if(a[i] == v){
         flag= false;
         System.out.println(v +" is present at index "+i+" in  a");
         break;
       }
     }
     if(flag){
       System.out.println("NIL");
     }

  }



}
