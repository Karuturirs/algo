package com.prepare.algo;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App
{
  public static void main(String[]  args){

        App a =new App();
      int[] x = {0,1,2,3,4,5,6,7,8};

     a. exchange(x , 0, 1);
      System.out.println(" - "+ Arrays.toString(x));

  }

    public  void exchange(int[] data, int p ,  int index){
        int temp = data[p];
        data[p] = data[index];
        data[index] = temp;
    }
}
