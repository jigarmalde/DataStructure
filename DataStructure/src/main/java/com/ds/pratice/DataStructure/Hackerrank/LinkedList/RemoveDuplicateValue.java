package com.ds.pratice.DataStructure.Hackerrank.LinkedList;

public class RemoveDuplicateValue {
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

        Node temp = head;
        if(head == null)
            return head;

        while (head != null && head.next != null){

            if(head.data == head.next.data){
                head.next = head.next.next;
            }else {
                head = head.next;
            }
        }
        return temp;

    }

    public static void main(String[] agrs) {
        RemoveDuplicateValue list = new RemoveDuplicateValue();
        list.head1 = new Node(3);
        list.head1.next = new Node(3);
        list.head1.next.next = new Node(3);
        list.head1.next.next.next = new Node(4);
        list.head1.next.next.next.next = new Node(5);
        list.head1.next.next.next.next.next = new Node(5);
        //list.head1.next.next = new Node(7);

        Node node = remoceDuplicate(list.head1);
        print(node);

    }

}
