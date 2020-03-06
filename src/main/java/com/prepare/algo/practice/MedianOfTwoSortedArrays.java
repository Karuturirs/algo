package com.prepare.algo.practice;

public class MedianOfTwoSortedArrays {


    public static void main(String[] args){

        // merging to sorted array and finding the median Big O(m+n)
        int[] a = {1,2};
        int[] b = {3};

        System.out.println(findMedianSortedArrays(a,b));

        int[] c = {1,4,6};
        int[] d = {5,7};

        System.out.println(findMedianSortedArrays(c,d));

        int[] e = {1,3};
        int[] f = {2,4};

        System.out.println(findMedianSortedArrays(e,f));

        int[] g = {1,3};
        int[] h = {};

        System.out.println(findMedianSortedArrays(h,g));
    }

    //O(m+n)
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int total = nums1.length+nums2.length;


        int[] merged = new int[total];

        int i=0,j=0,k=0;

        while(i< nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j])
                merged[k++] = nums1[i++];
            else
                merged[k++] = nums2[j++];
        }

        while(i<nums1.length){
            merged[k++]= nums1[i++];
        }
        while(j<nums2.length){
            merged[k++]= nums2[j++];
        }

        int mid = total/2;
        if(total%2 == 0){
            //System.out.println(mid+" "+merged[mid-1]+" "+merged[mid]);
            return (double)(merged[mid-1]+merged[mid])/2.0;
        }else{
            //System.out.println(merged[mid]);
            return  (double)(merged[mid]);
        }

    }
}
