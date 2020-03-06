package com.prepare.algo;
/*

a = [5,4,2,6,1,3]
 output = [6,5,4,3,2,1]

for(int i=1,i<a.length; i++){  //5
 int key = a[i], j = i-1; // key =3 , j = 4

  while(j>=0 & a[j]<key){ // 2 < 3
      a[j+1] = a[j];  //a[5] = 1  [6,5,4,2,2,1]
      a[j] = key;     //a[4] = 3  [6,5,4,3,2,1]
      j = j-1;   // j=3
  }

}


*/
import java.util.Arrays;

public class InsertionSortReverse{

  public static void main(String[] args){
    int[] a = {2, 31, 41, 59, 26, 41, 58};

    for(int i=1; i <a.length; i++){
      int key = a[i];
      int j=i-1;
      while(j>=0 && a[j]<key){
        a[j+1] = a[j];
        a[j] = key;
        j = j-1;
      }

    }

    Arrays.stream(a)
          .forEach(x ->{
            System.out.print(x +" ");
          });

  }

}
