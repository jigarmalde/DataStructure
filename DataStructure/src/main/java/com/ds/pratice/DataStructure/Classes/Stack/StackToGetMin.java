package com.ds.pratice.DataStructure.Classes.Stack;

import java.util.Stack;

public class StackToGetMin {
    int min;
    Stack<Integer> integers = new Stack<>();

    public void push(int data){
        if(integers.isEmpty()){
            integers.push(data);
            min = data;
            System.out.println("Number pushed "+ data);
        }
        else {
            if(data < min){
                integers.push(2*data - min);
                min = data;
            }else {
                integers.push(data);
            }
            System.out.println("Number pushed "+ data);
        }
    }

    public void getMin(){
        System.out.println("Minimun is "+ min);
    }

    public void peek(){
        if (integers.isEmpty())
        {
            System.out.println("Stack is empty ");
            return;
        }

        Integer t = integers.peek(); // Top element.

        System.out.print("Top Most Element is: ");

        if (t < min)
            System.out.println(min);
        else
            System.out.println(t);
    }

    public void pop()
    {
        if (integers.isEmpty())
        {
            System.out.println("Stack is empty");
            return;
        }

        System.out.print("Top Most Element Removed: ");
        Integer t = integers.pop();

        // Minimum will change as the minimum element
        // of the stack is being removed.
        if (t < min)
        {
            System.out.println(min);
            min = 2*min - t;
        }

        else
            System.out.println(t);
    }

    public static void main(String [] args){
        StackToGetMin s = new StackToGetMin();
        s.push(3);
        s.push(5);
        s.getMin();
        s.push(2);
        s.push(1);
        s.getMin();
        s.pop();
        s.getMin();
        s.pop();
        s.peek();
        s.getMin();
    }
}
