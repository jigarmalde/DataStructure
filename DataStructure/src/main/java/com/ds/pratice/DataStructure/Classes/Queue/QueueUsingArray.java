package com.ds.pratice.DataStructure.Classes.Queue;

public class QueueUsingArray {

    public int front =0;
    public int rear =-1;
    int[] x = new int[100];

    public void enQueue(int data){
        x[++rear] = data;
    }

    public int deQueue(){
        return x[front++];
    }


    public boolean isEmpty(){
        if(rear < 0){
            return true;
        }
        return false;
    }

    public int peek(){
        return x[front];
    }


    public static void main(String [] args){
        QueueUsingArray queueUsingArray = new QueueUsingArray();
        queueUsingArray.enQueue(10);
        queueUsingArray.enQueue(20);
        queueUsingArray.enQueue(30);
        queueUsingArray.enQueue(40);
        System.out.println(queueUsingArray.deQueue());
        System.out.println(queueUsingArray.deQueue());
        System.out.println(queueUsingArray.peek());
        System.out.println(queueUsingArray.peek());
        System.out.println(queueUsingArray.isEmpty());
    }
}
