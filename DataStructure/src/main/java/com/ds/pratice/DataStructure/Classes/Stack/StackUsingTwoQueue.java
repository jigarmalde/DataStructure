package com.ds.pratice.DataStructure.Classes.Stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingTwoQueue {

    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public void push(int data){
        if(q1.isEmpty()){
            q1.add(data);
        }else {
            while (!q1.isEmpty()){
                q2.add(q1.remove());
            }
            q1.add(data);
            while (!q2.isEmpty()){
                q1.add(q2.remove());
            }
        }
    }

    public int pop(){
        return q1.remove();
    }

    public boolean isEmpty(){
        return q1.isEmpty();
    }

    public static void main(String [] args){
        StackUsingTwoQueue stackUsingTwoQueue = new StackUsingTwoQueue();
        stackUsingTwoQueue.push(10);
        stackUsingTwoQueue.push(20);
        stackUsingTwoQueue.push(30);
        stackUsingTwoQueue.push(40);
        System.out.println(stackUsingTwoQueue.pop());
        System.out.println(stackUsingTwoQueue.pop());
    }
}
