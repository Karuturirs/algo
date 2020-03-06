package com.prepare.algo;

import java.util.Arrays;
/*

a[] = {5,2,4,6,1,3}

for a[i] , i=2 i++ {
  key =a[i]; // 2
  j = i-1;  // 1
  while(j>0 && a[j] > key){ // 5 > 2
    a[j+1] = a[j]; // a[2] = 5
    j--;  // 0
  }
  a[j+1] = key;

}

*/

public class InsertionSort{

  public static void main(String[] args){
      int[] a = {31, 41, 59, 26, 41, 58};
      for(int i=1; i < a.length; i++){
        int key = a[i];
        int j = i-1;
        while(j>=0 && a[j] > key){
          a[j+1] =a[j];
          j--;
        }
        a[j+1]=key;
      }
      Arrays.stream(a)
      .forEach(i ->{
          System.out.print(i);
          System.out.print("\t");
      });

  }


}
