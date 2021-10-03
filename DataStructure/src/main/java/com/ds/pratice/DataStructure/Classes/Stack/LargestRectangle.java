package com.ds.pratice.DataStructure.Classes.Stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class LargestRectangle {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        int maxArea =0;
        int i=0;
        List<Integer> height = new ArrayList<Integer>(Arrays.asList(2,1,3,6,2,3));

        while (i<height.size()) {
            if (st.isEmpty() || height.get(i) > height.get(st.peek())) {
                st.push(i);
                i++;
            } else maxArea = calculateArea(st, height, i, maxArea);
        }

        while (!st.isEmpty())
            maxArea = calculateArea(st, height, i, maxArea);

        System.out.println("Max area " + maxArea);
    }

    private static int calculateArea(Stack<Integer> st, List<Integer> height, int i, int maxArea) {
    int area =0;
    int top = st.pop();
    if(st.isEmpty()){
        area = height.get(top) *i;
    }else {
        area = height.get(top) * (i - st.peek() -1);
    }
    if(area > maxArea)
        maxArea = area;

    return maxArea;
    }
}
