package com.ds.pratice.DataStructure.Stack;



public class StackCreationWithLinkedList {

    Node root;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }

    }

    boolean isEmpty()
    {
        if(root == null){
            return true;
        }
        else {
            return false;
        }
    }

    void push(int x)
    {
        Node node = new Node(x);
        if(root == null){
            root = node;
        }
        else {
            Node temp = root;
            root = node;
            node.next = temp;
        }

    }

    int pop()
    {
       int popped = Integer.MIN_VALUE;
       if(root == null){
           System.out.println("Stack is empty");
           return popped;

       }else {
           popped = root.data;
           root = root.next;
       }

       return popped;
    }

    int peek()
    {
        int peak = Integer.MIN_VALUE;
        if(root == null){
            System.out.println("Stack is empty");
            return peak;

        }else {
            peak = root.data;
        }
        return peak;
    }

    public static void main(String args[])
    {
        StackCreationWithLinkedList s = new StackCreationWithLinkedList();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.peek() + " Top from stack");
    }
}
