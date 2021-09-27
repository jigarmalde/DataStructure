package com.ds.pratice.DataStructure.Classes.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueUsingStack {

    Stack<Integer> q1 = new Stack<>();
    Stack<Integer> q2 = new Stack<>();
    public void enQueue(int data){
        if(q1.isEmpty()){
            q1.add(data);
        }else {
            while (!q1.isEmpty()){
                q2.add(q1.pop());
            }
            q1.add(data);
            while (!q2.isEmpty()){
                q1.add(q2.pop());
            }
        }
    }

    public int deQueue(){
        return q1.pop();
    }

    public static void main(String[] args) {
        QueueUsingStack queueUsingStack = new QueueUsingStack();
        queueUsingStack.enQueue(10);
        queueUsingStack.enQueue(20);
        queueUsingStack.enQueue(30);
        queueUsingStack.enQueue(40);
        System.out.println(queueUsingStack.deQueue());
        System.out.println(queueUsingStack.deQueue());

    }
}
