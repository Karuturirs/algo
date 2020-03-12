package com.prepare.algo.practice.crackingcodinginterview;

import java.util.HashSet;

public class RemoveDuplicatesLinkedList {

    public static void main(String[] args) {

        Node root = new Node(3);
        root.next = new Node(2);
        root.next.next = new Node(3);
        root.next.next.next =  new Node(4);
        root.next.next.next.next = new Node(6);
        root.next.next.next.next.next = new Node(4);


        LinkedList ll = new LinkedList();
        ll.head = root;

        ll.print();
        RemoveDuplicatesLinkedList rll = new RemoveDuplicatesLinkedList();


        Node n = rll.midOfLinkedList(ll);
        System.out.println("Mid node::"+n.data);

        ll = rll.removeDuplicates(ll);
        ll.print();

    }

    /**
     * removes duplicates from the linkedlist and returns the Linkedlist
     * Time Complexity : O(n)
     * Space Complexity : O(n)
     * @param ll
     * @return
     */
    public LinkedList removeDuplicates(LinkedList ll){

        if(ll.head == null){
            return null;
        }

        HashSet<Integer> hs = new HashSet<>();
        Node n = ll.head;
        Node temp = n;
        while(n!=null){
            if(hs.contains(n.data)){
                temp.next = n.next;
            }else{
                hs.add(n.data);
                temp = n;
            }
            n = n.next;
        }

        return ll;
    }

    public Node midOfLinkedList(LinkedList ll){

        if(ll == null){
            return null;
        }

        Node fst_ptr = ll.head;
        Node slw_ptr = ll.head;

        while(fst_ptr != null && fst_ptr.next != null){
            fst_ptr = fst_ptr.next.next;
            slw_ptr = slw_ptr.next;
        }
        return slw_ptr;
    }

}

class LinkedList{

    Node head;

    public void print(){
        System.out.println("Start::");
        Node head = this.head;
        while(head!=null){
            System.out.println(head.data);
            head =head.next;
        }
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



