package com.ds.pratice.DataStructure.Hackerrank.LinkedList;

public class ReverseLinkedList {

    private static Node head;

    private class Node{
        private int data;
        private Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    private void print(){
        Node node =head;
        while (node != null){
            System.out.print(node.data+" ");

            node = node.next;
        }
    }

    private void addNodeToHead(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
        }else {
            node.next = head;
            head = node;
        }
    }

    private void reverseLinkedList(){
        Node prev =null;
        Node current = head;
        Node next = null;
        while (current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head =prev;

        Node display =head;
        while (display != null){
            System.out.print(display.data + " ");
            display = display.next;
        }
        
    }

    public static void main(String[] agrs) {
        ReverseLinkedList linkedList = new ReverseLinkedList();
        linkedList.addNodeToHead(10);
        linkedList.addNodeToHead(20);
        linkedList.addNodeToHead(30);
        linkedList.addNodeToHead(40);
        linkedList.addNodeToHead(50);
        System.out.println("Printing Linked list");
        linkedList.print();
        System.out.println();
        System.out.println("reverse Linked list");
        linkedList.reverseLinkedList();

    }

}
