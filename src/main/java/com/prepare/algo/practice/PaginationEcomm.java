package com.prepare.algo.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class PaginationEcomm {

    /**
     * items = [[item1, 10, 20],[item2, 2, 15],[]]
     * @param items
     * @param operation //0 to 2
     * @param sortby //0 or 1
     * @param maxOnEachPage
     * @param pageNumber
     * @return
     */
    public static void findout(List<List<String>> items, int operation, int sortby, int maxOnEachPage , int pageNumber){


         items.sort(new Comparator<List<String>>() {
             @Override
             public int compare(List<String> o1, List<String> o2) {
                 if(operation == 0){
                     if(sortby == 0)
                         return o1.get(operation).compareTo(o2.get(operation));
                     else
                         return o2.get(operation).compareTo(o1.get(operation));
                 }else{
                     if(sortby == 0)
                         return (int) (Float.parseFloat(o1.get(operation))- Float.parseFloat(o2.get(operation)));
                     else
                         return (int) (Float.parseFloat(o2.get(operation))- Float.parseFloat(o1.get(operation)));
                 }
             }
         });

         items.forEach(
                 System.out::println);

         // totalitems/maxonEachPage + totalitems % maxonEachPage = no of pages
        //  size of array(x)  = items.size()
        // no : of items on each page(y) = maxOnEachPage
        // page (z) = pageNumber
        // (i,j) where i is starting index of page z ; i = ( pageNumber-1) * maxOnEachPage
        //                                             j = (pageNumber) * maxOnEachPage -1

        System.out.println("#####################");
        for(int i = (pageNumber-1) * maxOnEachPage ; i <= ((pageNumber) * maxOnEachPage -1) && i< items.size() ; i++){
            System.out.println( items.get(i));
        }
        System.out.println("#####################");


    }


    public static void main(String[] args){

        List<List<String>> items = new ArrayList<>();
        items.add(Arrays.asList("item1", "10", "20"));
        items.add(Arrays.asList("item2", "2", "10"));
        items.add(Arrays.asList("item3", "1", "15"));
        items.add(Arrays.asList("item4", "3", "5"));
        items.add(Arrays.asList("item5", "6", "4"));
        items.add(Arrays.asList("item6", "8", "8"));
        items.add(Arrays.asList("item7", "4", "1"));

        System.out.println("-----------------------------------------------");

        items.forEach(x-> System.out.println(" x :"+ x));
        System.out.println("-----------------------------------------------");
        findout(items, 1, 1,2, 4);
        System.out.println("-----------------------------------------------");

        items.forEach(x-> System.out.println(" x :"+ x));
        System.out.println("-----------------------------------------------");
        findout(items, 0, 0,3, 1);

    }
}
