package com.prepare.algo.practice.crackingcodinginterview.LinkedList;

public class SumLists {

    public static void main(String[] args) {

        Node n1 = new Node(9);
        n1.next = new Node(7);
        n1.next.next = new Node(8);

        Node n2 = new Node(6);
        n2.next = new Node(8);
        n2.next.next = new Node(5);

        SumLists sl = new SumLists();
        LinkedList ll = new LinkedList();
        ll.head = sl.sumOfReverseLinkedList(n1,n2);

        ll.print("Sum of two Reverse LinkedList");

    }

    public Node sumOfReverseLinkedList(Node n1, Node n2){
        Node n3_head = new Node(0);
        Node n3 = n3_head;
        int carry =0;
        while(n1 != null && n2!= null){

            int number = n1.data+n2.data+carry;
            carry = number/10;
            n3.next = new Node(number%10);
            n1 = n1.next;
            n2 = n2.next;
            n3 = n3.next;
        }

        while(n1== null && n2 !=null){
            int number = n2.data+carry;
            carry = number/10;
            n3.next = new Node(number%10);
            n2 = n2.next;
            n3 = n3.next;
        }

        while(n2== null && n1 !=null){
            int number = n1.data+carry;
            carry = number/10;
            n3.next = new Node(number%10);
            n1 = n1.next;
            n3 = n3.next;
        }

        // Dont forget this
        if(carry >0){
            n3.next = new Node(carry);
        }

        return n3_head.next;
    }
}
