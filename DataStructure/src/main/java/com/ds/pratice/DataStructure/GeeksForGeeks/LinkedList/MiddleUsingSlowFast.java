package com.ds.pratice.DataStructure.GeeksForGeeks.LinkedList;

public class MiddleUsingSlowFast {

    static Node head;

    class Node{
        int data;
        Node next;

        public Node(Node next, int data){
            this.next = next;
            this.data = data;
        }
    }

     public  void push(Node next, int data){

        Node node = new Node(next, data);

        //node.next = head;
        head = node;
       // head = node.next;

    }

    public void display(Node node){

        while (node!= null){
            System.out.println(node.data);
            node = node.next;
        }
    }

    public void findMiddle(Node head){
        Node slow = head;
        Node fast = head;

        while ( fast != null && fast.next !=null){

            slow = slow.next;
            fast= fast.next.next;
        }
        System.out.println(slow.next.data);
    }

    public static void main(String[] args){
        MiddleUsingSlowFast middleUsingSlowFast = new MiddleUsingSlowFast();
        middleUsingSlowFast.push(head, 10);

        middleUsingSlowFast.push(head, 15);
        middleUsingSlowFast.push(head, 20);
        middleUsingSlowFast.push(head, 25);
        middleUsingSlowFast.push(head, 30);
        middleUsingSlowFast.push(head, 35);

        //middleUsingSlowFast.display(head);

        middleUsingSlowFast.findMiddle(head);

    }
}
