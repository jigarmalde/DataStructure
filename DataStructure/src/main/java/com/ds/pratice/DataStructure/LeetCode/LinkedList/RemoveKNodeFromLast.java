package com.ds.pratice.DataStructure.LeetCode.LinkedList;

public class RemoveKNodeFromLast {

    private static Node head;

    private static class Node{
        private int data;
        private Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    private static Node kNode(Node head, int k){
        Node dummyNode = new Node(0);
        dummyNode.next = head;
        Node ktemp = dummyNode;
        Node temp = dummyNode;

       /* if(k==1){
            return null;
        }*/

        k++;
        while (k>0 && ktemp!= null){
            ktemp = ktemp.next;
            k--;
        }
        while (ktemp != null){
            ktemp = ktemp.next;
            temp = temp.next;
        }
        if(temp.next != null)
            temp.next = temp.next.next;

        return dummyNode.next;
        
    }

    private static void print(Node head){
        Node node =head;
        while (node != null){
            System.out.print(node.data+" ");

            node = node.next;
        }
    }

    public static void main(String[] args) {
        RemoveKNodeFromLast list = new RemoveKNodeFromLast();
        list.head = new Node(12);
        list.head.next = new Node(15);
        list.head.next.next = new Node(10);
        list.head.next.next.next = new Node(11);
        list.head.next.next.next.next = new Node(5);
        list.head.next.next.next.next.next = new Node(6);
        list.head.next.next.next.next.next.next = new Node(2);
        list.head.next.next.next.next.next.next.next = new Node(3);

        Node node = kNode(head, 2);

        print(node);
    }


}
