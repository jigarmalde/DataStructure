package com.ds.pratice.DataStructure.Classes.Recursion;

public class SortedOrder {

    private static Node head;

    public boolean isSortedOrder(Node head){
        if(head == null || head.next == null){
            return true;
        }
        return (head.data < head.next.data && isSortedOrder(head.next));
    }

    public static void main(String[] args) {
        SortedOrder list = new SortedOrder();
        list.head = new Node(10);
        list.head.next = new Node(50);
        list.head.next.next = new Node(30);
        //list.head.next.next.next = new Node(40);
        //list.head.next.next.next.next = new Node(50);
        // list.head.next.next.next.next.next = new Node(60);

        if(list.isSortedOrder(head) == true)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
