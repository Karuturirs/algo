package com.prepare.algo.ds;

import java.util.Arrays;

public class HeapDataStrucure {

    HeapDataStrucure(){

    }

    HeapDataStrucure(int[] a){
        super();
    }

    public static void main(String[] args){

        HeapDataStrucure h = new HeapDataStrucure();
        int[] data = {7,4,8,2,4,5,6,1};
        System.out.println(Arrays.toString(data));
        h.bottomUp(data);
        System.out.println(" - "+Arrays.toString(data));
    }
    //Min heap
    public void bottomUp(int[] data){

        int lastIndex = data.length-1;
        int i = lastIndex;
        while( i>=0 ){
            int p = (i-1)/2;
            int ls = (2*p+1 <=lastIndex) ? 2*p+1 : p;
            int rs = (2*p+2 <= lastIndex) ? 2*p+2 : p;

            findSmallestOfTree(data, p, ls, rs);
            i= i-1;
        }

    }

    private void findSmallestOfTree(int[] data, int p, int ls, int rs) {

        int smallestindex = data[ls] < data[rs] ? ls : rs;

        if(data[smallestindex] < data[p]) {
            exchange(data, p, smallestindex);
        }


    }

    public void exchange(int[] data, int p ,  int index){
        int temp = data[p];
        data[p] = data[index];
        data[index] = temp;
    }

}
