package com.ds.pratice.DataStructure.Classes.Stack;

import java.util.Stack;

public class SortStack {

    public static void main(String[] args) {
        Stack<Integer> st1 = new Stack<>();
        st1.push(2);
        st1.push(3);
        st1.push(10);
        st1.push(8);
        st1.push(5);
        st1.push(17);

        Stack<Integer> st2 = new Stack<>();

        if(st2.isEmpty()){
            st2.push(st1.pop());
        }
        while (!st1.isEmpty()){
            if(st2.peek() > st1.peek()){
                st2.push(st1.pop());
            }else {
                int data = st1.pop();
                while (st2.peek() < data) {
                    int data2 = st2.pop();
                    st1.push(data2);
                }
                st2.push(data);
            }
        }

        while (!st2.isEmpty()){
            System.out.println(st2.pop());
        }


    }
}
