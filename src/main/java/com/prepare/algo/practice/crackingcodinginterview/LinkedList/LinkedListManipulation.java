package com.prepare.algo.practice.crackingcodinginterview.LinkedList;

import java.util.HashSet;

public class LinkedListManipulation {

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

        ll.reverse();
        System.out.print("Reversed Linked List::");
        ll.print();
        ll.reverse();
        System.out.print("Reversed Linked List::");
        ll.print();

        LinkedListManipulation rll = new LinkedListManipulation();

        Node kthnode = rll.kthToLast(ll,3);
        System.out.println("Kth node data::"+kthnode.data);

        Node n = rll.midOfLinkedList(ll);
        System.out.println("Mid node value::"+n.data);
        System.out.print("Remove duplicates::");
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

    /**
     * removes duplicates from the linkedlist and returns the Linkedlist
     * Time Complexity : O(n^2)
     * Space Complexity : O(1)
     * @param ll
     * @return
     */
    public LinkedList removeDuplicates2(LinkedList ll) {

        //TODO: using two for loops

        return null;

    }


    public Node kthToLast(LinkedList ll, int k){

        Node node = ll.head;

        int i =0;

        while(i < k){
            if(node == null){
                return null;
            }
            node = node.next;
            i++;

        }
        return node;
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



