package com.ds.pratice.DataStructure.Classes.Recursion;


public class ReverseLinkedList {
    private static Node head;

    public Node reverse(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node temp =reverse(head.next);
        head.next.next = head;
        head.next=null;
        return temp;
    }

    public static void main(String[] args) {
        ReverseLinkedList list = new ReverseLinkedList();
        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.next = new Node(30);
        //list.head.next.next.next = new Node(40);
        //list.head.next.next.next.next = new Node(50);
       // list.head.next.next.next.next.next = new Node(60);

        Node temp = list.reverse(head);

        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
