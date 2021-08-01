package com.ds.pratice.DataStructure.Hackerrank.LinkedList;



public class MergeTwoSortedArray {

    private Node head1;
    private Node head2;

    private static class Node{
        private int data;
        private Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    private static Node mergeSort(Node head1, Node head2){
        Node node = new Node(0);
        Node dummyNode = node;
        Node tail = dummyNode;

        while(true){

            if(head1 == null) {
                tail.next = head2;
                break;
            }
            if(head2 == null) {
                tail.next = head1;
                break;
            }

            if(head1.data < head2.data){
                tail.next = head1;
                head1 = head1.next;
            }else {
                tail.next = head2;
                head2 = head2.next;
            }
            tail = tail.next;

        }

        return dummyNode.next;


          /*if(head1 == null)
              return head2;

          if(head2 == null)
              return head1;

          if(head1.data <  head2.data){
              head1.next = mergeSort(head1.next, head2);
              return head1;
          }else {
              head2.next = mergeSort(head1, head2.next);
              return head2;
          }*/

    }

    private static void print(Node head){
        Node node =head;
        while (node != null){
            System.out.println(node.data);
            node = node.next;
        }
    }

    public static void main(String[] agrs) {
        MergeTwoSortedArray list = new MergeTwoSortedArray();
        list.head1 = new Node(1);
        list.head1.next = new Node(3);
        list.head1.next.next = new Node(7);
        //list.head1.next.next.next = new Node(11);
       // list.head1.next.next.next.next = new Node(5);

        list.head2 = new Node(1);
        list.head2.next = new Node(2);
        //list.head2.next.next = new Node(10);
       // list.head2.next.next.next = new Node(11);
        //list.head2.next.next.next.next = new Node(5);
        Node node = mergeSort(list.head1, list.head2);
        print(node);

    }

}
