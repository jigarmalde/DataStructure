package com.ds.pratice.DataStructure.Classes.Stack;


public class StackUsingLinkedList {
    Node head;

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
        if(head == null){
            head = temp;
        }else {
            temp.next = head;
            head = temp;
        }


    }

    public int pop(){
        if(head != null) {
            int temp = head.data;

            head = head.next;
            return temp;
        }
        return -1;
    }

    public int peek(){
        if(head != null) {
            return head.data;
        }
        return -1;
    }


    public boolean isEmpty(){
        if(head.data < 0){
            return true;
        }
        return false;
    }

    public static void main(String [] args){
        StackUsingLinkedList stackUsingLinkedList = new StackUsingLinkedList();
        stackUsingLinkedList.push(10);
        stackUsingLinkedList.push(20);
        stackUsingLinkedList.push(30);
        stackUsingLinkedList.push(40);
        System.out.println(stackUsingLinkedList.pop());
        System.out.println(stackUsingLinkedList.pop());
        System.out.println(stackUsingLinkedList.peek());
        System.out.println(stackUsingLinkedList.peek());
        System.out.println(stackUsingLinkedList.isEmpty());

    }
}
