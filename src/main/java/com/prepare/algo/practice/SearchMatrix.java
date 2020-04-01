package com.prepare.algo.practice;

import java.util.*;

/**
 * Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:
 *
 *     Integers in each row are sorted from left to right.
 *     The first integer of each row is greater than the last integer of the previous row.
 *
 * Example 1:
 *
 * Input:
 * matrix = [
 *   [1,   3,  5,  7],
 *   [10, 11, 16, 20],
 *   [23, 30, 34, 50]
 * ]
 * target = 3
 * Output: true
 *
 * Example 2:
 *
 * Input:
 * matrix = [
 *   [1,   3,  5,  7],
 *   [10, 11, 16, 20],
 *   [23, 30, 34, 50]
 * ]
 * target = 13
 * Output: false
 */

public class SearchMatrix {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 50}
                };

        //int[][] negative =
        int target =3;
        SearchMatrix sm = new SearchMatrix();
        System.out.println("->3::"+sm.searchMatrix(matrix,target));
        System.out.println("->1::"+sm.searchMatrix(matrix,1));
        System.out.println("->7::"+sm.searchMatrix(matrix,7));
        System.out.println("->6::"+sm.searchMatrix(matrix,6));
        System.out.println("->50::"+sm.searchMatrix(matrix,50));
        System.out.println("->0::"+sm.searchMatrix(matrix,0));
        System.out.println("->22::"+sm.searchMatrix(matrix,22));
        System.out.println("->100::"+sm.searchMatrix(matrix,100));
        System.out.println("->21::"+sm.searchMatrix(matrix,21));
        System.out.println("->24::"+sm.searchMatrix(matrix,24));
        System.out.println("->24::"+sm.searchMatrix(new int[][]{{-9,-7,-7,-5,-3},{-1,0,1,3,3},{5,7,9,11,12},{13,14,15,16,18},{19,21,22,22,22}},
        -4));
    }

    public boolean searchMatrix(int[][] matrix, int target) {

        int m = matrix.length;
        int n =  (matrix.length >0)? matrix[0].length : 0;

        if( m==0 || n==0 || target<matrix[0][0] || target > matrix[m-1][n-1]){
            return false;
        }

        int midrow = m/2;

        while(midrow >=0 && midrow < m) {
            if (target >= matrix[midrow][0] && target <= matrix[midrow][n-1]) {
                break;
            }else if( target< matrix[midrow][0] && target > matrix[midrow-1][n-1] ){
                break;
            }

            if (target <= matrix[midrow][0]) {
                midrow = midrow / 2;
            } else {
                midrow = (midrow + 1 + m) / 2;
            }
        }
        //System.out.println(" Row::"+midrow);
        return searchInARow2(matrix[midrow], target);

    }
    public boolean searchInARow(int[] rowarray,int target){
        int mid = (rowarray.length)/2;
        if(rowarray[mid]== target){
            return true;
        }else if(rowarray[mid]<target){
            return searchInARow(Arrays.copyOfRange(rowarray,mid+1,rowarray.length),target);
        }else{
            return searchInARow(Arrays.copyOfRange(rowarray,0,mid),target);
        }

    }
    // O(logN)
    public boolean searchInARow2(int[] rowarray,int target){

        int i =0, n = rowarray.length-1;
        while(i<= n){
            int mid = i+(n-1)/2;

            if(rowarray[mid] == target){
                return true;
            }

            if(rowarray[mid] < target)
                i = mid+1;
            else
                n = mid-1;
        }
        return false;

    }
}
