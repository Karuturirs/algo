package com.prepare.algo.practice.crackingcodinginterview.recursion;

public class RobotInGrid {

    public static void main(String[] args) {

        RobotInGrid rg = new RobotInGrid();

        int[][] grid1 = {{0,1,0},{0,0,0},{1,0,0},{0,1,0},{0,0,0},{1,0,0}};
        System.out.println(" - "+rg.checking2(grid1, 0,0 ));
        int[][] grid2 = {{0,0,0},{0,1,0},{0,0,0}};
        System.out.println(" - "+rg.checking2(grid2, 0,0 ));
        int[][] grid3 = {{0,0,0},{0,0,0},{0,0,0}};
        System.out.println(" - "+rg.checking2(grid3, 0,0 ));
    }

    /**
     * Recursive function to determine the total no:of paths
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

}
