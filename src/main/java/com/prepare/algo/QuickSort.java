package com.prepare.algo;
import java.util.*;
/**
*
**/
public class QuickSort<T extends Comparable<T>>{
  T[] a;
  QuickSort(T[] a){
    this.a = a;
    sortArray(0,a.length);
  }
 public void  sortArray(int l, int h){
    if(l<h){
      int j = partition(l,h);
      sortArray(l,j);
      sortArray(j+1,h);
    }
  }
  public int partition(int l, int h){
    int i =l, j =h; // 0, 9
    T pivot = a[i]; // 10
    System.out.println("pivot is:"+pivot); //10
    while(i<j){ //0<9
      do{
        i++; //1
      }while( i<a.length && a[i].compareTo(pivot) < 0 ); //11 < 10   false
      do{
        j--; // 8
      }while( j<a.length && pivot.compareTo(a[j]) < 0); //10 < 7

      if(i > j){ //8 >1
          a[l] =a[j];
          a[j] =pivot;
      }else{
        T temp =a[i];
        a[i] = a[j];
        a[j] = temp;
      }
    }
    return j;
  }

}
