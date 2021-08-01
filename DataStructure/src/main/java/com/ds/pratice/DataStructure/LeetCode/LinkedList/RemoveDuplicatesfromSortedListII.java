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

        Node node = new Node(0);
        Node temp = node;
        Node prev = node;
        temp.next = head;
        prev.next = head;
        if(head == null)
            return head;

        while (head != null && head.next != null){

            if(head.data != head.next.data){
                prev =head;
                head = head.next;
            }else {
                while ( (head != null && head.next != null) && (head.data == head.next.data)){
                    head= head.next;
                }
                prev.next = head.next;
            }


        }
        return temp.next;

    }

    public static void main(String[] agrs) {
        RemoveDuplicatesfromSortedListII list = new RemoveDuplicatesfromSortedListII();;
        list.head1 = new Node(1);
        list.head1.next = new Node(2);
        list.head1.next.next = new Node(2);
        list.head1.next.next.next = new Node(4);
        //list.head1.next.next.next.next = new Node(4);
        //list.head1.next.next.next.next.next = new Node(5);
       // list.head1.next.next.next.next.next.next = new Node(5);
        //list.head1.next.next.next.next.next.next.next = new Node(5);
        //list.head1.next.next = new Node(7);

        Node node = remoceDuplicate(list.head1);
        print(node);

    }
}
