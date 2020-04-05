package com.prepare.algo.practice.leetcode;

import java.util.Arrays;

/**
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
 *
 * Note:
 *
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 *
 * Example 1:
 *
 * Input: [2,2,1]
 * Output: 1
 *
 * Example 2:
 *
 * Input: [4,1,2,1,2]
 * Output: 4
 */
public class SingleNumber {

    public static void main(String[] args) {

        SingleNumber sn = new SingleNumber();

        int[] nums = {4,1,2,1,2,4};
        System.out.println(sn.singleNumber(nums));
        int[] nums2 = {2,1,2};
        System.out.println(sn.singleNumber(nums2));
        int[] nums3 = {3};
        System.out.println(sn.singleNumber(nums3));
    }

    public int singleNumber(int[] nums) {
        Arrays.sort(nums);

        int temp = 0;
        int i=0; //1 1 2 2 4
        while(i<nums.length){// 2 < 4
            if( i != nums.length-1 && nums[i] == nums[i+1]){ //1 ==1
                i=i+2;       //2
            }else{
                temp = nums[i]; //4
                i++;   //1

            }
        }
        return temp;
    }
}
