package com.prepare.algo;

import java.util.ArrayList;
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


      ArrayList<String> al=new ArrayList<String>();
      al.add("Viru");
      al.add("Saurav");
      al.add("Mukesh");
      al.add("Tahir");

      al.forEach( System.out::println);


      long m0 = Runtime.getRuntime().freeMemory();
      String s = new String("canvadsfdsfsdfs");
      long m1 = Runtime.getRuntime().freeMemory();
      System.out.println( "----");
      System.out.println( m0 - m1);

  }

    public  void exchange(int[] data, int p ,  int index){
        int temp = data[p];
        data[p] = data[index];
        data[index] = temp;
    }
}
