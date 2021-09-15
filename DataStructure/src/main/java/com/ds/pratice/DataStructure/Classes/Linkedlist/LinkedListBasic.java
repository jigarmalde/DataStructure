package com.ds.pratice.DataStructure.Classes.Linkedlist;

import com.ds.pratice.DataStructure.GeeksForGeeks.LinkedList.LinkedList;

public class LinkedListBasic {

    Node head;
    Node tail;

    private void print(){
        Node node =head;
        while (node != null){
            System.out.println(node.data);
            node = node.next;
        }
    }


    public static void main(String[] agrs) {
        LinkedListBasic linkedList = new LinkedListBasic();
        linkedList.addNodeToTail(10);
        linkedList.addNodeToTail(20);
        linkedList.addNodeToTail(30);
        linkedList.addNodeToTail(40);
        linkedList.addNodeToTail(50);
        System.out.println("Printing Linked list");
        linkedList.print();
    }

    private void addNodeToTail(int i) {
        Node temp = new Node(i);

        if(head == null){
            head = temp;
            tail = temp;
        }else {
            tail.next = temp;
            tail = temp;

        }
    }
}
