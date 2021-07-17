package com.ds.pratice.DataStructure.GeeksForGeeks.LinkedList;

public class LinkedList {

    private Node head;

    private class Node{
        private int data;
        private Node next;
        Node(int data){
            this.data = data;
            this.next = null;
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

    private void print(){
        Node node =head;
        while (node != null){
            System.out.println(node.data);
            node = node.next;
        }
    }

    private void deleteFromHead(){
        Node node = head;
        if(node!= null){
            head = node.next;
            node = null;

        }
    }

    private void addInMiddle(int data , int after){
        Node node = head;
        while (node!= null){
            if(node.data == after){
                Node newNode = new Node(data);
                newNode.next = node.next;
                node.next = newNode;
                break;
            }
            node = node.next;
        }
    }

    private void deleteFromPos(int data){
        Node node = head;
        while (node!= null || node.next != null){
            if(node.next.data == data){
                node.next = node.next.next;
                break;
            }
            node = node.next;
        }
    }

    private void addingElementInTail(int data){
        Node node = head;
        Node newNode = new Node(data);
        while (node.next!= null){
            node = node.next;
        }
        node.next = newNode;
    }

    private void deleteElementInTail(){
        Node node = head;
        while (node.next.next != null){
            node = node.next;
        }
        node.next = null;
    }

    public static void main(String[] agrs){
        LinkedList linkedList = new LinkedList();
        linkedList.addNodeToHead(10);
        linkedList.addNodeToHead(20);
        linkedList.addNodeToHead(30);
        linkedList.addNodeToHead(40);
        linkedList.addNodeToHead(50);
        System.out.println("Printing Linked list");
        linkedList.print();
        System.out.println("Deleting from header node");
        linkedList.deleteFromHead();
        linkedList.print();
        System.out.println("Adding an element at certain node");
        linkedList.addInMiddle(15, 20);
        linkedList.print();
        System.out.println("Deleting element");
        linkedList.deleteFromPos(15);
        linkedList.print();
        System.out.println("Adding element in tail");
        linkedList.addingElementInTail(5);
        linkedList.print();
        System.out.println("Delete element in tail");
        linkedList.deleteElementInTail();
        linkedList.print();

    }
}
