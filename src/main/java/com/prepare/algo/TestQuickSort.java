package com.prepare.algo;
import java.util.*;

public class TestQuickSort{
  public static void main(String[] args){
    Integer[] a = {10,11,9,8,16,24,35,2,7};
    Integer[] b = {1,2,3,4,5,6,7,8,9};
    Integer[] c = {10,9,8,7,6,5,4,3,2};
    QuickSort<Integer> q = new QuickSort<>(a);

    System.out.println(Arrays.toString(q.a));
    QuickSort<Integer> d = new QuickSort<>(b);
    System.out.println(Arrays.toString(d.a));
    QuickSort<Integer> m = new QuickSort<>(c);
    System.out.println(Arrays.toString(m.a));
  }
}
