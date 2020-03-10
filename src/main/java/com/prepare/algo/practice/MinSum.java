package com.prepare.algo.practice;

import java.util.*;

/**
 * num = [2,3]
 * k=1
 *
 * 3/2 = 1.5  so num = [2,2]
 * output is 4
 */
public class MinSum {

    public static void main(String[] args){
       int sum = minSum(new ArrayList<Integer>(
            Arrays.asList(10,20,7)),4);
       System.out.println(sum);
    }


    public static int minSum(List<Integer> num, int k) {
        PriorityQueue<Integer> stack = new PriorityQueue<>(
                new Comparator<Integer>() {
                    public int compare(Integer a, Integer b){
                        if(a<b) return 1;
                        if(a>b) return -1;
                        return 0;
                        // return b.compareTo(a);

                    }
                }
        );

        int sum =0;
        for(int j=0;j<num.size(); j++){
            sum += num.get(j);
            stack.add(num.get(j));
        }

        int i=1;
        while(i<=k){
            Integer elem = stack.remove();
            sum -= elem;
            int a = (int) Math.ceil((double)elem/2);
            stack.add(a);
            sum += a;
            i++;
        }

        return sum;
    }

}
