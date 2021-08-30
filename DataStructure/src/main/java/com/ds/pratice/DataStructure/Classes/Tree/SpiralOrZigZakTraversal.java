package com.ds.pratice.DataStructure.Classes.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SpiralOrZigZakTraversal {

    BinaryNode root;

    public static void main(String[] args) {
        SpiralOrZigZakTraversal tree = new SpiralOrZigZakTraversal();
        tree.root = new BinaryNode(10);
        tree.root.leftNode = new BinaryNode(20);
        tree.root.rightNode = new BinaryNode(30);
        tree.root.leftNode.leftNode = new BinaryNode(40);
        tree.root.leftNode.leftNode.leftNode = new BinaryNode(70);
        tree.root.leftNode.rightNode = new BinaryNode(50);
        tree.root.rightNode.leftNode = new BinaryNode(60);
        tree.root.leftNode.leftNode.rightNode = new BinaryNode(80);
        tree.spiralOrZigZakTraversal();
    }

    private void spiralOrZigZakTraversal() {
        Stack<BinaryNode> s1 = new Stack<>();
        Stack<BinaryNode> s2 = new Stack<>();
        List<List<Integer>> ans = new ArrayList<>();

        s1.push(root);

        while (!s1.isEmpty() || !s2.isEmpty()){
            List<Integer> int1 = new ArrayList<>();

            while (!s1.isEmpty()){
                BinaryNode binaryNode = s1.pop();
                int1.add(binaryNode.data);
                if(null != binaryNode.leftNode){
                    s2.push(binaryNode.leftNode);
                }
                if(null != binaryNode.rightNode){
                    s2.push(binaryNode.rightNode);
                }
            }
            if(!int1.isEmpty()){
                ans.add(int1);
            }
            List<Integer> int2 = new ArrayList<>();
            while (!s2.isEmpty()){
                BinaryNode binaryNode2 = s2.pop();
                int2.add(binaryNode2.data);
                if(null != binaryNode2.rightNode){
                    s1.push(binaryNode2.rightNode);
                }
                if(null != binaryNode2.leftNode){
                    s1.push(binaryNode2.leftNode);
                }
            }
            if(!int2.isEmpty()){
                ans.add(int2);
            }
        }

        System.out.println(ans);
    }
}
