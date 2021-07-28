package com.ds.pratice.DataStructure.Classes.Linkedlist;


public class IntersectionLinkedlist {

    private static Node head1;
    private static Node head2;
    private static  Node head3;

    private class Node{
        private int data;
        private Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    private void print(){
        Node node = head1;
        while (node != null){
            System.out.print(node.data+" ");

            node = node.next;
        }
    }

    private void print2(){
        Node node = head2;
        while (node != null){
            System.out.print(node.data+" ");

            node = node.next;
        }
    }
    private void print3(){
        Node node = head3;
        while (node != null){
            System.out.print(node.data+" ");

            node = node.next;
        }
    }

    private void addNodeToHead(int data){
        Node node = new Node(data);
        if(head1 == null){
            head1 = node;
        }else {
            node.next = head1;
            head1 = node;
        }
    }

    private void findLenghtAndIntersection(){
        Node temp1 = head1;
        int count1 = 0;
        int count2 = 0;
        while (temp1!= null){
            count1++;
            temp1 = temp1.next;
        }
        Node temp2 = head2;
        while (temp2!= null){
            count2++;
            temp2 = temp2.next;
        }
        System.out.println();
        System.out.println("Count of head1 "+ count1);
        System.out.println("Count of head1 "+ count2);
        int diff = count1 - count2;
        System.out.println("Diff "+ diff);
        Node temp3 = head1;
        while (count1-diff-1 > 0){
            count1--;
            temp3 = temp3.next;
        }
        System.out.println(temp3.data);

    }

    private void head2(){
        head2 = new Node(70);
        head2.next = new Node(60);
        head2.next.next = new Node(30);
    }
    private void head3(){
        head3 = new Node(70);
        head3.next = new Node(60);
        head3.next.next = head1.next;
    }

    private int  intersection(){
        Node current1 = head1;
        Node current2 = head3;

        // If one of the head is null
        if (current1 == null || current2 == null )
            return -1;

        // Continue until we find intersection node
        while (current1 != null && current2 != null
                && current1 != current2)
        {
            current1 = current1.next;
            current2 = current2.next;

            // If we get intersection node
            if (current1 == current2) {
                return current1.data;

            }


            // If one of them reaches end
            if (current1 == null )
                current1 = head3;
            if (current2 == null )
                current2 = head1;
        }
        return current1.data;
    }

    public static void main(String[] agrs) {
        IntersectionLinkedlist linkedList = new IntersectionLinkedlist();
        linkedList.addNodeToHead(50);
        linkedList.addNodeToHead(40);
        linkedList.addNodeToHead(30);
        linkedList.addNodeToHead(20);
        linkedList.addNodeToHead(10);
        System.out.println("Printing Linked list");
        linkedList.print();
        //System.out.println();
       // linkedList.head2();
       // linkedList.print2();
        //with length
       // linkedList.findLenghtAndIntersection();
        //without Length
        System.out.println();
        linkedList.head3();
        linkedList.print3();
        System.out.println();
        System.out.println("Intersection" +linkedList.intersection());





    }

}
