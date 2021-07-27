package com.ds.pratice.DataStructure.Hackerrank.LinkedList;

public class DeleteLinkedList {

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
            System.out.println(node.data);
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

    public  Node deleteNode(Node head,int position) {

        if (position == 1) {
            head = head.next;
            return head;
        }
        if(head != null)
            head.next = deleteNode(head.next, position - 1);
        else {
            System.out.println("Postion is not present in linked list");
            return head;
        }

        return head;

    }


    public static void main(String[] agrs) {
        DeleteLinkedList linkedList = new DeleteLinkedList();
        linkedList.addNodeToHead(10);
        linkedList.addNodeToHead(20);
        linkedList.addNodeToHead(30);
        linkedList.addNodeToHead(40);
        linkedList.addNodeToHead(50);
        System.out.println("Printing Linked list");
        // linkedList.print();
        //linkedList.insertNodeAtPosition(25, 3);
        // linkedList.print();
        // linkedList.insertNodeAtPosition(60, 0);
        // linkedList.print();
        //linkedList.deleteNode( head, 5);
       // linkedList.print();
        linkedList.deleteNode(head, 7 );
        linkedList.print();
    }
}
