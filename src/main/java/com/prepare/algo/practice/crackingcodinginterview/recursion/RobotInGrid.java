package com.prepare.algo.practice.crackingcodinginterview.recursion;

import java.util.Arrays;

/**
 * Robot in a Grid: Imagine a robot sitting on the upper left corner of grid with r rows and c columns.
 * The robot can only move in two directions, right and down, but certain cells are "off limits" such that
 * the robot cannot step on them. Design an algorithm to find a path for the robot from the top left to
 * the bottom right.
 */
public class RobotInGrid {

    public static void main(String[] args) {

        RobotInGrid rg = new RobotInGrid();

        int[][] grid1 = {{0,1,0},{0,0,0},{1,0,0},{0,1,0},{0,0,0},{1,0,0}};
        System.out.println(" + "+rg.checking2(grid1, 0,0 ));
        int[][] memo = new int[grid1.length][grid1[0].length];
        Arrays.stream(memo).forEach(x ->  Arrays.fill(x, -1));
        System.out.println(" - "+rg.checking1(grid1, 0,0 , memo));


        int[][] grid2 = {{0,0,0},{0,1,0},{0,0,0}};
        System.out.println(" + "+rg.checking2(grid2, 0,0 ));
        int[][] memo2 = new int[grid2.length][grid2[0].length];
        Arrays.stream(memo2).forEach(x ->  Arrays.fill(x, -1));
        System.out.println(" - "+rg.checking1(grid2, 0,0 , memo2));


        int[][] grid3 = {{0,0,0},{0,0,0},{0,0,0}};
        System.out.println(" + "+rg.checking2(grid3, 0,0 ));
        int[][] memo3 = new int[grid3.length][grid3[0].length];
        Arrays.stream(memo3).forEach(x ->  Arrays.fill(x, -1));
        System.out.println(" - "+rg.checking1(grid3, 0,0, memo3 ));
    }

    /**
     * Recursive function to determine the total no:of paths
     * Time complexity is 2^(row*column)
     * @param grid : Matrix array with 0 and 1's
     * @param row : current location of the row
     * @param column : current location of the column
     * @return count of total paths
     */
    public int checking2(int[][] grid, int row, int column){
        int count = 0;
        if(grid == null){
            return 0;
        }

        int rowlen = grid.length;
        int columnlen = grid[0].length;

        if(row == rowlen-1 && column == columnlen-1){
           return 1;
        }

        if(row+1 < rowlen && grid[row+1][column] != 1){
            count += checking2(grid,row+1, column);
        }

        if(column+1 < columnlen && grid[row][column+1] != 1){
            count += checking2(grid,row, column+1);
        }
        return count;
    }

    /**
     * Memorization method for top to bottom approach, to determine no:of paths
     * Time complexity is (row*column)
     * @param grid
     * @param row
     * @param column
     * @return
     */
    public int checking1(int[][] grid, int row, int column, int[][] memo){
        int count = 0;
        if(grid == null){
            return 0;
        }

        int rowlen = grid.length;
        int columnlen = grid[0].length;

        if(row == rowlen-1 && column == columnlen-1){
          return 1;
        }

        if(memo[row][column] != -1){
            return memo[row][column];
        }else{
            if(row+1 < rowlen && grid[row+1][column] != 1){
                memo[row+1][column] = checking1(grid,row+1, column, memo);
                count += memo[row+1][column];
            }

            if(column+1 < columnlen && grid[row][column+1] != 1){
                memo[row][column+1] = checking1(grid,row, column+1, memo);
                count += memo[row][column+1];
            }
        }
        memo[row][column] = count;
        System.out.print("************************************");
        Arrays.stream(memo)
                .forEach(x-> {
                    System.out.println("");
                    Arrays.stream(x)
                        .forEach(y -> {
                             System.out.print( y+"  ");
                        });
                });
        System.out.println("\n----------------------------------");

        return count;
    }




}
