package com.ds.pratice.DataStructure.Classes.Linkedlist;

public class EvenOddLength {
    private static Node head;

    private static class Node{
        private int data;
        private Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    private void evenOddlength(){
        Node temp = head;

        while (temp != null && temp.next!=null){
            temp = temp.next.next;
        }
        if(temp == null){
            System.out.println("Even Length");
        }else{
            System.out.println("Odd Length");
        }

    }

    public static void main(String[] agrs) {
        EvenOddLength evenOddLength = new EvenOddLength();
        head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
       // head.next.next.next = new Node(40);
        evenOddLength.evenOddlength();


    }

}
