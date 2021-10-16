package com.ds.pratice.DataStructure.Classes.Linkedlist;

public class CircularLinkList2 {

    Node tail;

    public CircularLinkList2() {
        // TODO Auto-generated constructor stub
        this.tail = null;
    }

    public void insertAtBegin(int data){
        if(null == tail){
            Node node = new Node(data);
            tail = node;
            tail.next=tail;
        }else{
            Node node = new Node(data);
            node.next = tail.next;
            tail.next = node;

        }
    }

    public void insertAtLast(int data){
        insertAtBegin(data);
        tail = tail.next;
    }

    public void printList(){
        Node current = tail.next;
        while(current!=tail){
            System.out.println(current.data);
            current=current.next;
        }
        System.out.println(current.data);
    }

    public void removeFromStart(){
        if(null == tail){
            System.out.println("List is empty");
        }
        Node head = tail.next;

        tail.next=head.next;
    }

    public static void main(String[] args) {
        CircularLinkList2 list = new CircularLinkList2();
        list.insertAtBegin(30);
        list.insertAtBegin(20);
        list.insertAtBegin(15);
        list.insertAtBegin(10);
        list.removeFromStart();
        list.printList();
    }
}