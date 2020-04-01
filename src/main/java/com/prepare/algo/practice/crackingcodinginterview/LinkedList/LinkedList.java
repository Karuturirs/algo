package com.prepare.algo.practice.crackingcodinginterview.LinkedList;

public class LinkedList{

    Node head;

    /**
     * Print all the elements in the linkedlist
     */
    public void print(){
        System.out.print("[");
        Node head = this.head;
        while(head!=null){
            System.out.print(head.data+ " " );
            head =head.next;
        }
        System.out.println("]");
    }

    /**
     * Reverse all the linked list
     */
    public void reverse(){

        Node newhead = null;

        while(head != null){

            Node next = head.next;
            head.next = newhead;
            newhead = head;
            head = next;

        }

        this.head = newhead;
    }
}

class Node{
    int data;
    Node next;

    Node(int x){
        this.data = x;
        this.next = null;
    }
}

