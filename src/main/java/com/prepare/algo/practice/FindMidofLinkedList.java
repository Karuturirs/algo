package com.prepare.algo.practice;


import java.util.LinkedList;
import java.util.List;

/**
 * Need to find did of linked list only iterating once
 */
public class FindMidofLinkedList {

   public static void main(String[] args){

      LinkedLists ll = new LinkedLists();

      ll.push(5);
      ll.push(6);
      ll.push(7);
      ll.push(8);
      ll.push(9);
      ll.push(10);

      LinkedLists.Node ss = ll.node;
      while(ss != null ){
         System.out.println(ss.data);
         ss = ss.next;
      }
      ll.printMiddle();
   }

}


class LinkedLists{
   Node node;

   class Node{
      int data;
      Node next;

      Node(int d){
         this.data = d;
         this.next = null;
      }
   }

   public void push(int new_data){
      Node new_node = new Node(new_data);
      new_node.next = node;
      node = new_node;
   }

   public void printMiddle(){
      Node fast_ptr = node;
      Node slow_ptr = node;
      if(node !=null) {
         while (fast_ptr != null && fast_ptr.next != null) {
            fast_ptr = fast_ptr.next.next;
            slow_ptr = slow_ptr.next;
         }
      }
      System.out.println("Middle::::"+slow_ptr.data);
   }
}
