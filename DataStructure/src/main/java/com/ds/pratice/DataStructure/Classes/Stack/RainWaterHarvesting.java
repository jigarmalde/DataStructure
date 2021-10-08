package com.ds.pratice.DataStructure.Classes.Stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class RainWaterHarvesting {

    public static void main(String[] args) {
        List<Integer> height = new ArrayList<Integer>(Arrays.asList(9,1,4,0,2,8,6,3,5));
        System.out.println("Water trap " + calculateArea(height));
    }

    private static int calculateArea(List<Integer> height){
        int area =0;
        Stack<Integer> st = new Stack<>();
        int i=0;

        while (i < height.size()){
            if(st.isEmpty() || height.get(i) < height.get(st.peek())){
                st.push(i++);
            }else {
                int top = st.pop();
                if (st.isEmpty())
                    continue;
                int distane = i - st.peek()-1;
                int boundedheight = Math.min(height.get(i), height.get(st.peek())) -height.get(top);
                area = area + (distane * boundedheight);
            }
        }

        return area;
    }
}
