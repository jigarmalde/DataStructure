package com.ds.pratice.DataStructure.Classes.Queue;


public class QueueUsingLinkedList {
   Node rear;
   Node front;

    class Node{
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void push(int data) {

        Node temp = new Node(data);
        if(rear == null){
            rear = front = temp;
        }else {
            rear.next = temp;
            rear = temp;
        }


    }

    public int pop(){
        if(front != null) {
            int temp = front.data;

            front = front.next;
            return temp;
        }
        return -1;
    }

    public int peek(){
        if(front != null) {
            return front.data;
        }
        return -1;
    }


    public boolean isEmpty(){
        if(rear.data < 0){
            return true;
        }
        return false;
    }


    public static void main(String [] args){
        QueueUsingLinkedList  queueUsingLinkedList = new QueueUsingLinkedList();
        queueUsingLinkedList.push(10);
        queueUsingLinkedList.push(20);
        queueUsingLinkedList.push(30);
        queueUsingLinkedList.push(40);
        System.out.println(queueUsingLinkedList.peek());
        System.out.println(queueUsingLinkedList.pop());
        System.out.println(queueUsingLinkedList.pop());
        System.out.println(queueUsingLinkedList.peek());
        System.out.println(queueUsingLinkedList.isEmpty());
    }
}
