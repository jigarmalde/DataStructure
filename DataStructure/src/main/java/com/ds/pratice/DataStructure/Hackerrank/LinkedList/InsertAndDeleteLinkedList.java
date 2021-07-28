package com.ds.pratice.DataStructure.Hackerrank.LinkedList;


import com.ds.pratice.DataStructure.GeeksForGeeks.LinkedList.LinkedList;

public class InsertAndDeleteLinkedList {
    private Node head;

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

    public void insertNodeAtPosition( int data, int position) {
        // Write your code here
        Node node = new Node(data);
        if(position < 0){
            System.out.println("Position is incorrect");
        }
        if(position == 0){
            node.next = head;
            head = node;
        }
        else {
            Node node1 = head;
            while (node1!= null){
                if(position==1) {
                    node.next = node1.next;
                    node1.next = node;
                    break;
                }
                position--;
                node1 = node1.next;
            }
        }
    }

    /*public  Node deleteNode(Node head,int position) {

        if (position == 0){ head= head.next; }
        head.next = deleteNode(head.next, position-1);*/

        // Write your code here
        /*if(position == 1){
            head = head.next;
        }else {
            Node node = head;
            position--;
            while (node!= null && node.next!= null){
                if(position==1) {
                    node.next = node.next.next;
                    break;
                }
                position--;
                node = node.next;
            }
            if (node == null) {
                System.out.println("position is more than number of nodes");
            }*/
           /* Node node = head;
            //Node prev = node;
           position --;
           while (position != 1 && node.next!= null) {
               node = node.next;
               position--;

           }
            if (node == null || node.next == null){
                System.out.println("position is more than number of nodes");
            }else {

                Node next = node.next.next;
                node.next = next;
            }*/

       // }
    //}

    public static void main(String[] agrs) {
        InsertAndDeleteLinkedList linkedList = new InsertAndDeleteLinkedList();
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
        linkedList.print();
    }
}
