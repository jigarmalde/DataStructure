package com.ds.pratice.DataStructure.Classes.Linkedlist;

public class FindKNodeFromLast {

    private static Node head;

    private static class Node{
        private int data;
        private Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    private static void kNode(Node head, int k){
        Node ktemp = head;
        Node temp = head;
        
        while (k>0){
            ktemp = ktemp.next;
            k--;
        }
        while (ktemp != null){
            ktemp = ktemp.next;
            temp = temp.next;
        }
        System.out.println(temp.data);
        
    }

    public static void main(String[] args) {
        FindKNodeFromLast list = new FindKNodeFromLast();
        list.head = new Node(12);
        list.head.next = new Node(15);
        list.head.next.next = new Node(10);
        list.head.next.next.next = new Node(11);
        list.head.next.next.next.next = new Node(5);
        list.head.next.next.next.next.next = new Node(6);
        list.head.next.next.next.next.next.next = new Node(2);
        list.head.next.next.next.next.next.next.next = new Node(3);

        kNode(head, 4);
    }


}
