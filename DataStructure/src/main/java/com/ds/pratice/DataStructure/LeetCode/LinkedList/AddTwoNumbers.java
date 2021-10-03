package com.ds.pratice.DataStructure.LeetCode.LinkedList;

import com.ds.pratice.DataStructure.Hackerrank.LinkedList.InsertAndDeleteLinkedList;
import com.ds.pratice.DataStructure.Hackerrank.LinkedList.ReverseLinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddTwoNumbers {
    private Node head1;
    private Node head2;
    private Node head3;

    private static class Node{
        private int data;
        private Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    private static Node reverseLinkedList(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    private static String getString(Node head){
        StringBuilder stringBuilder = new StringBuilder();

        while (head != null){
            stringBuilder.append(head.data);
            head= head.next;
        }
        return stringBuilder.toString();
    }

    private void addNodeToHead(int data){
        Node node = new Node(data);
        if(head3 == null){
            head3 = node;
        }else {
            node.next = head3;
            head3 = node;
        }
    }

    private void print(Node head){
        Node node =head;
        while (node != null){
            System.out.print(node.data+" ");

            node = node.next;
        }
    }

    public static void main(String[] agrs) {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        addTwoNumbers.head1 = new Node(2);
        addTwoNumbers.head1.next = new Node(4);
        addTwoNumbers.head1.next.next = new Node(3);

        //Node temp1 = reverseLinkedList(addTwoNumbers.head1);

        addTwoNumbers.head2 = new Node(5);
        addTwoNumbers.head2.next = new Node(6);
        addTwoNumbers.head2.next.next = new Node(4);
       // addTwoNumbers.head2.next.next.next = new Node(4);

        /*Node temp2 = reverseLinkedList(addTwoNumbers.head2);

        String s1 = getString(temp1);
       // System.out.println(s1);

        String s2 = getString(temp2);
       // System.out.println(s2);

        Integer integer = Integer.valueOf(s1) + Integer.valueOf(s2);
       // System.out.println(integer);

        int temp = integer;
        List<Integer> array = new ArrayList<>();
        do{
            array.add(temp % 10);
            temp /= 10;
        } while  (temp > 0);

       // System.out.println(array.toString());

        for(int i : array){
            addTwoNumbers.addNodeToHead(i);
        }
        //addTwoNumbers.print(addTwoNumbers.head3);


        Node temp3 = reverseLinkedList(addTwoNumbers.head3);*/

       // addTwoNumbers.print(temp3);

        //Second way

        Node temp4 = addTwoNumbers.addTwoNumbers(addTwoNumbers.head1, addTwoNumbers.head2);
        addTwoNumbers.print(temp4);
    }

    public Node addTwoNumbers(Node l1, Node l2) {
        Node prev = new Node(0);
        Node head = prev;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            Node cur = new Node(0);
            int sum = ((l2 == null) ? 0 : l2.data) + ((l1 == null) ? 0 : l1.data) + carry;
            cur.data = sum % 10;
            carry = sum / 10;
            prev.next = cur;
            prev = cur;

            l1 = (l1 == null) ? l1 : l1.next;
            l2 = (l2 == null) ? l2 : l2.next;
        }
        return head.next;
    }

}
