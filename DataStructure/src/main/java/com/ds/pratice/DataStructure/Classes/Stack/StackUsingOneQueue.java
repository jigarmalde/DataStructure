package com.ds.pratice.DataStructure.Classes.Stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingOneQueue {
    Queue<Integer> queue = new LinkedList<>();

    public void push(int data){
        int size = queue.size();

        // Add current element
        queue.add(data);

        // Pop (or Dequeue) all previous
        // elements and put them after current
        // element
        for (int i = 0; i < size; i++)
        {
            // this will add front element into
            // rear of queue
            int x = queue.remove();
            queue.add(x);
        }
    }

    public int pop(){
        return queue.remove();
    }




    public static void main(String [] args){
        StackUsingOneQueue stackUsingOneQueue = new StackUsingOneQueue();
        stackUsingOneQueue.push(10);
        stackUsingOneQueue.push(20);
        stackUsingOneQueue.push(30);
        stackUsingOneQueue.push(40);
        System.out.println(stackUsingOneQueue.pop());
        System.out.println(stackUsingOneQueue.pop());
    }
}
