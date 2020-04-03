package com.prepare.algo.practice.crackingcodinginterview.LinkedList;


/**
 * Partition: Write code to partition a linked list around a value x, such that all nodes less than x come
 * before all nodes greater than or equal to x. If x is contained within the list, the values of x only need
 * to be after the elements less than x (see below). The partition element x can appear anywhere in the
 * "right partition"; it does not need to appear between the left and right partitions.
 * EXAMPLE
 * Input:
 * Output:
 * 3 -> 5 -> 8 -> 5 -> 10 -> 2 -> 1 [partition= 5]
 * 3 -> 1 -> 2 -> 10 -> 5 -> 5 -> 8
 */
public class PartitionLinkedList {

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();

        Node root = new Node(3);
        root.next = new Node(5);
        root.next.next = new Node(8);
        root.next.next.next = new Node(5);
        root.next.next.next.next = new Node(10);
        root.next.next.next.next.next = new Node(2);
        root.next.next.next.next.next.next = new Node(1);

        ll.head = root;

        ll.print();

        PartitionLinkedList pll = new PartitionLinkedList();

        ll.head = pll.reorderByPartition(root, 5);

        ll.print("After partition");

    }

    /**
     *
     * TimeComplexity :O(n)
     * SpaceComplexity: O(1)
     * @param head
     * @param partition
     */
    public Node reorderByPartition(Node head, int partition){

        //Using before and after list and joining them accordingly.
        Node before_head = new Node(0);
        Node before = before_head;
        Node after_head = new Node(0);
        Node after = after_head;

        while(head != null){
            if( head.data < partition){
                before.next = head;
                before = before.next;
            }else{
                after.next = head;
                after = after.next;
            }
            head = head.next;
        }

        after.next = null;
        before.next = after_head.next;

        return before_head.next;
    }
}
