package com.prepare.algo;

import org.junit.*;
import com.prepare.algo.QuickSort;

import java.util.Arrays;

public class QuickSortTest
{
  @Test
  public void quickSortAssert()
  {
      Integer[] input = {5,7,8,1,9,3,2};
      QuickSort qs = new QuickSort(input);
      Arrays.stream(input).forEach(n-> System.out.print(n+ " "));
      //assertEquals(input,{1,2,3,5,7,8,9} );
  }


}
