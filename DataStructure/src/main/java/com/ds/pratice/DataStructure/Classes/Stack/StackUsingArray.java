package com.ds.pratice.DataStructure.Classes.Stack;


//drawback is size constraint to overcome this use linkedlist
public class StackUsingArray {
    public int top =-1;
    int[] x = new int[100];

    public void push(int data){
        x[++top] = data;
    }

    public int pop(){
        return x[top--];
    }

    public boolean isEmpty(){
        if(top < 0){
            return true;
        }
        return false;
    }

    public int peek(){
        return x[top];
    }






    public static void main(String [] args){
        StackUsingArray stackUsingArray = new StackUsingArray();
        stackUsingArray.push(10);
        stackUsingArray.push(20);
        stackUsingArray.push(30);
        stackUsingArray.push(40);

        System.out.println(stackUsingArray.pop());
        System.out.println(stackUsingArray.peek());
        System.out.println(stackUsingArray.peek());
    }
}
