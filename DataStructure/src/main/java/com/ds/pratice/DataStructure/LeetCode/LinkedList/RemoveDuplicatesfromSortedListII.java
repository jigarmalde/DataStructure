package com.ds.pratice.DataStructure.LeetCode.LinkedList;

import com.ds.pratice.DataStructure.Hackerrank.LinkedList.RemoveDuplicateValue;

public class RemoveDuplicatesfromSortedListII {

    private Node head1;

    private static class Node{
        private int data;
        private Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    private static void print(Node head){
        Node node =head;
        while (node != null){
            System.out.println(node.data);
            node = node.next;
        }
    }

    private static Node remoceDuplicate(Node head){

        Node dummy = new Node(0);

        // Dummy node points to the original head
        dummy.next = head;
        Node prev = dummy;
        Node current = head;

        while (current != null) {

            while (current.next != null &&
                    prev.next.data == current.next.data)
                current = current.next;

            if (prev.next == current)
                prev = prev.next;

            else
                prev.next = current.next;

            current = current.next;
        }
        return dummy.next;

    }

    public static void main(String[] agrs) {
        RemoveDuplicatesfromSortedListII list = new RemoveDuplicatesfromSortedListII();;
        list.head1 = new Node(1);
        list.head1.next = new Node(1);
        list.head1.next.next = new Node(1);
        list.head1.next.next.next = new Node(3);
        list.head1.next.next.next.next = new Node(4);
        //list.head1.next.next.next.next = new Node(4);
        //list.head1.next.next.next.next.next = new Node(4);
        //list.head1.next.next.next.next.next.next = new Node(5);
       // list.head1.next.next.next.next.next.next.next = new Node(5);
        //list.head1.next.next = new Node(7);

        Node node = remoceDuplicate(list.head1);
        print(node);

    }
}
