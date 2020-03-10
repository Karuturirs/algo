package com.prepare.algo.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * contiguous subarrays where product is less than or equals to k
 *
 * ex: [3,4,5] , k=5
 *  arrays -> [3],[4],[5], [3,4], [4,5],[3,4,5]
 *  total product of subarray should be less than or equal to k
 *  so output is 3
 */
public class SubArrayProduct {

    public static void main(String[] args){
        long sum = countSubarrays(new ArrayList<Integer>(
                Arrays.asList(3,4,5)),5);
        System.out.println(sum);
       System.out.println(countSubarrays(new ArrayList<Integer>(
                Arrays.asList(1,2,3)),4)); //output should be 4
    }

    public static long countSubarrays(List<Integer> numbers, int k) {
        // Write your code here
        Integer[] elem =  numbers.stream().filter(x -> (x<=k)).toArray(Integer[]::new);

        int sum =0;

        // create a nxn matrix where row is number of subarrays colum is elem[j]
        for(int i=0; i<elem.length ; i++){// i means rows of array size
            // 0->1 coulum array, 1->2
            for(int j=0; j<=elem.length-i-1; j++){ // j is index of elem; elem[j]

                if(prodOfAllSubArray(elem,j,j+i,k)){
                    sum++;
                }else{
                    break;
                }
            }
        }
        return sum;

    }

    public static boolean prodOfAllSubArray(Integer[] elem, int i, int j, int k){
        long prod = 1;
        for(int x =i ; x<=j ;x++){
            prod =(long) prod * elem[x];
            if(prod>k){
                break;
            }
        }
        //System.out.println("i:"+i+"j:"+j+" -- "+ prod);
        return (prod<=k )? true:false;
    }
}
