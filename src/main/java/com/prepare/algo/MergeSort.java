package com.prepare.algo;

import java.util.Arrays;
/***
Merge sort :- Two set of sorted cards piled up facing with smallest number on top facing.
Pick the smallest of both piles and face it down on new output pile, continue this as long as one pile gets empty
and fill the remaining pile on top of output pile facing down

a[m] = {}
b[n] = {}

c[m+n]
int i =0; j=0;
int k=0;
while(k<m+n){
  if( j<n && a[i]>b[j]){
    c[k] =b[j];
    j++;
  }else if(i<m && a[i]<=b[j]){
    c[k] = a[i];
    i++;
  }else{
    if(j>=n){
      c[k] = a[i] ; i++;
    }else{
      c[k] = a[j]; j++;
    }
  }
  k++;
}

***/

public class MergeSort{
  public static void main(String[] args){
    int[] a ={8,10,11,50,77,199,201,2000,5000};
    int[] b ={5,9,15,21,33,45,200,300};
    int[] c = new int[a.length+b.length];
    int x=0, y=0;

    Arrays.stream(c)
    .forEach(i ->{
        System.out.print(i);
        System.out.print("\t");
    });
  }



}
