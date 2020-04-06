package com.prepare.algo.practice.crackingcodinginterview.LinkedList;

import java.util.Stack;

/**
 * Given a Double linked list which has next node and child nodes
 * where it needs to be converted to double linked list with no child nodes, moving all children to next and existing node next to end of the children
 *
 *
 *
 *  1 <=> 2<=> 3 <=> 4 <=> 5 <=> 6 <=> null
 *             |           |
 *             |          14 <=> 15 <=> null
 *             7 <=> 8 <=> 9 <=> 10 <=> null
 *                   |
 *                   11 <=> 12 <=> 13 <=> null
 *
 *
 * Current class format
 * class Node{
 *
 *         int data;
 *         Node prev;
 *         Node next;
 *         Node child;
 *  }
 *
 *  Reformat the above to below double linkedlist
 *  solution : 1 <=> 2 <=> 3 <=> 7 <=> 8 <=> 11 <=> 12 <=> 13 <=> 9 <=> 10 <=> 4<=> 5 <=> 14 <=> 15 <=> 6 <=> null
 */

public class DoubleLinkedListManipulation {

    public Node reformatTree(Node node){
       Node head = node;
       Stack<Node> queue = new Stack<>();

        while (node != null ) {

            if(node.child != null){
               queue.add(node.next); //4 - 5
               node.next = node.child; // 3=> 7
               node.next.prev = node; //3<=>7
               node.child = null;
            }
            if(node.next == null){
                if(!queue.isEmpty()){
                    node.next = queue.pop();
                    node.next.prev = node;
                }
            }
          node = node.next;
        }

        return head;
    }

    public void print(Node head){

        while(head != null){
            System.out.println(head.toString());
            head= head.next;
        }
    }

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        Node node8 = new Node(8);
        Node node9 = new Node(9);
        Node node10 = new Node(10);
        Node node11 = new Node(11);
        Node node12 = new Node(12);
        Node node13 = new Node(13);
        Node node14 = new Node(14);
        Node node15 = new Node(15);
        node1.next = node2;
        node2.next = node3;
        node2.prev = node1;
        node3.next = node4;
        node3.prev = node2;
        node3.child = node7;
        node7.next = node8;
        node7.prev = node3;
        node8.next = node9;
        node8.prev = node7;
        node8.child = node11;
        node11.next = node12;
        node11.prev = node8;
        node12.next = node13;
        node12.prev = node11;
        node13.prev = node12;
        node4.next = node5;
        node4.prev = node3;
        node5.next = node6;
        node5.prev = node4;
        node5.child = node14;
        node14.next = node15;
        node14.prev =  node5;
        node15.prev = node14;
        node6.prev = node5;
        node9.next = node10;
        node9.prev = node8;
        node10.prev = node9;
        DoubleLinkedListManipulation dd = new DoubleLinkedListManipulation();
        dd.print(node1);

        Node hh = dd.reformatTree(node1);
        System.out.println("-->"+hh);
        dd.print(hh);
    }

    static class Node{

        int data;
        Node prev;
        Node next;
        Node child;

        Node(int data){
            this.data = data;
            this.prev = null;
            this.child = null;
            this.next = null;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    '}';
        }
    }


}



