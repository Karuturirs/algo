package com.prepare.algo.practice.crackingcodinginterview.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * Suppose there is no v character on the keyboard then try to reverse the given list
 *
 */
public class ListReverse {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(){{
            add(1);
            add(2);
            add(3);
            add(4);
            add(5);
        }};
        list.add(Integer.valueOf(6));

        Stack<Integer> stack = new Stack<>();

        list.forEach(x -> stack.add(x) );
        list.clear();
        while(!stack.empty()){
            list.add(stack.pop());
        }

        System.out.println(" -------------");
        list.stream().forEach(System.out::println);
        System.out.println(" -------------");

        // Using removehas v character.
           for(int i=list.size()-1 , j=0; i>=0; i-- , j++){
               //System.out.println(j+" " +list.get(list.size()-1));
               Integer x = list.get(list.size()-1);
               list.add(j,x);
               list.remove(list.size()-1);
           }

        list.stream().forEach(System.out::println);
    }

}
