package com.ds.pratice.DataStructure.GeeksForGeeks.LinkedList;


//Detect loop, lenght of loop, starting point of loop, remove loop.
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

    public void detechLoop(Node head){
        Node slow = head;
        Node fast = head;

        while (slow!= null && slow.next != null &&
        fast!= null && fast.next != null && fast.next!=null){

            slow = slow.next;
            fast = fast.next.next;

            if(slow.data == fast.data){
                System.out.println("Loop Found");
                break;
            }
        }
        if(slow.data == fast.data){
            countNode(slow);
            slow = head;
            Node prev = fast;
            while (slow != fast){
                slow =slow.next;
                prev = fast;
                fast = fast.next;
            }
            System.out.println(slow.data);
            System.out.println(prev.data);
            prev.next = null;
        }

        Node display = head;
        while (display!= null){
            System.out.println(display.data);
            display = display.next;
        }

    }

    public void countNode(Node node){
        int res =1;
        Node temp = node;
        while ( temp.next != node){
            res++;
            temp = temp.next;
        }
        System.out.println(res);

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

        detechLoop.detechLoop(head);

        //detechLoop.display(head);

        /*if(detechLoop.detechLoop(head)){
            System.out.println("Loop Found");
        }else {
            System.out.println("Loop Not Found");
        }*/

    }
}
