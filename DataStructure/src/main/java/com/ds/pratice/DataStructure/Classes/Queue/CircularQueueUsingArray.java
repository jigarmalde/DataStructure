package com.ds.pratice.DataStructure.Classes.Queue;

public class CircularQueueUsingArray {
    public int front =0;
    public int rear =-1;
    public  int size =4;
    int[] x = new int[size];

    public void enQueue(int data){

        rear = (rear+1) % size;
        if(rear == size){
            System.out.println("Queue is full");
            return;
        }else {
            x[rear] = data;
        }
    }

    public int deQueue(){
        int data = x[front];
        front = (front+1) %size;
        return data;

    }


    /*public boolean isEmpty(){
        if(front > rear){
            return true;
        }
        return false;
    }*/

    public int peek(){
        return x[front];
    }

    public static void main(String [] args){
        CircularQueueUsingArray queueUsingArray = new CircularQueueUsingArray();
        queueUsingArray.enQueue(10);
        queueUsingArray.enQueue(20);
        queueUsingArray.enQueue(30);
        queueUsingArray.enQueue(40);
        queueUsingArray.enQueue(50);
        //queueUsingArray.enQueue(50);
        System.out.println(queueUsingArray.deQueue());
        System.out.println(queueUsingArray.deQueue());
        System.out.println(queueUsingArray.deQueue());
        System.out.println(queueUsingArray.deQueue());
        //System.out.println(queueUsingArray.deQueue());
        //System.out.println(queueUsingArray.deQueue());
        //System.out.println(queueUsingArray.peek());
        //System.out.println(queueUsingArray.deQueue());
        //System.out.println(queueUsingArray.isEmpty());
    }

}
