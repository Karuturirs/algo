package com.prepare.algo.ds;

public class LinkedListTest {

    public static void main(String[] args){
        LinkedList<Integer> x = new LinkedList<>();

        System.out.println("Size::"+x.size());
        x.put(1);
        x.remove(1);
        System.out.println("Size::"+x.size());
        x.put(2);
        System.out.println("Size::"+x.size());
        x.remove(2);
        System.out.println("Size::"+x.size());
        x.put(2);
        x.put(10);
       // x.add(5,1);
        x.put(23);
        System.out.println("Size::"+x.size());
       // x.remove(23);
        //x.add(4,0);
        System.out.println("Size::"+x.size());


        for(int i=0; i<x.size();i++) {
            System.out.println(x.get(i));
        }
    }
}
