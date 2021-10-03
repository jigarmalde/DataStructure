package com.ds.pratice.DataStructure.LeetCode.LinkedList;


import com.ds.pratice.DataStructure.Hackerrank.LinkedList.ReverseLinkedList;

public class SwapNodeInPair {
    private static Node head;

    private static class Node{
        private int data;
        private Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    private void print(Node head){
        Node node =head;
        while (node != null){
            System.out.print(node.data+" ");

            node = node.next;
        }
    }

    private Node reverseLinkedList(Node head){
        if ((head == null)||(head.next == null))
            return head;
        Node n = head.next;
        head.next = reverseLinkedList(head.next.next);
        n.next = head;
        return n;

    }

    public static void main(String[] args) {
        SwapNodeInPair list = new SwapNodeInPair();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);
        //list.head.next.next.next.next = new Node(5);
        //list.head.next.next.next.next.next = new Node(6);
        //list.head.next.next.next.next.next.next = new Node(2);
        //list.head.next.next.next.next.next.next.next = new Node(3);

       Node temp=  list.reverseLinkedList(head);
        list.print(temp);


    }


    // without recurssion
    public Node swapPairs(Node head) {
        Node dummy = new Node(0);
        dummy.next = head;
        Node current = dummy;
        while (current.next != null && current.next.next != null) {
            Node first = current.next;
            Node second = current.next.next;
            first.next = second.next;
            current.next = second;
            current.next.next = first;
            current = current.next.next;
        }
        return dummy.next;
    }
}
