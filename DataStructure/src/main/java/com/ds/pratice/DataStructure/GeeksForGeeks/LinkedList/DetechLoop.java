package com.ds.pratice.DataStructure.GeeksForGeeks.LinkedList;

public class DetechLoop {

    static Node head;

    // Link list node
    class Node
    {
        int data;
        Node next;

        // Constructor
        public Node(Node next, int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public  void push(Node next, int data){

        Node node = new Node(next, data);

        node.next = head;
        head = node;
        // head = node.next;

    }

    public void display(Node node){

        while (node!= null){
            System.out.println(node.data);
            node = node.next;
        }
    }

    public boolean detechLoop(Node head){
        Node slow = head;
        Node fast = head;

        while (slow!= null && slow.next != null &&
        fast!= null && fast.next != null && fast.next.next!=null){

            slow = slow.next;
            fast = fast.next.next;

            if(slow.data == fast.data){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        DetechLoop detechLoop = new DetechLoop();
        detechLoop.push(head, 10);

        detechLoop.push(head, 15);
        detechLoop.push(head, 20);
        detechLoop.push(head, 25);
        detechLoop.push(head, 30);
        detechLoop.push(head, 35);

        /*Create loop for testing */
        detechLoop.head.next.next.next.next.next.next = detechLoop.head.next.next;

        //detechLoop.display(head);

        if(detechLoop.detechLoop(head)){
            System.out.println("Loop Found");
        }else {
            System.out.println("Loop Not Found");
        }

    }
}
