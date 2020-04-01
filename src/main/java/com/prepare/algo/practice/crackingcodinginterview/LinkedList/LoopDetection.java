package com.prepare.algo.practice.crackingcodinginterview.LinkedList;

public class LoopDetection {

    /**
     * Given a Head Node of linkedlist find the Node where the loop begins
     * @param head
     * @return
     */
    public Node findBegginingOfLoop(Node head){

        Node fast = head;
        Node slow = head;
        // To identify if its cyclic( in cyclic two pointers would meet at some point)
        while(fast != null  && fast.next!= null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                break;
            }
        }

        Node meet = head;

        if(fast!= null && fast.next !=null){
            while(meet!= slow){
                meet =meet.next;
                slow = slow.next;
            }
            return slow;
        }

        return null;
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.next = new Node(2);
        root.next.next = new Node(3);
        root.next.next.next =  new Node(4);
        root.next.next.next.next = new Node(5);
        root.next.next.next.next.next = new Node(6);
        root.next.next.next.next.next = root.next.next.next;
        LoopDetection ld = new LoopDetection();
        System.out.println(ld.findBegginingOfLoop(root).data);

    }

}
