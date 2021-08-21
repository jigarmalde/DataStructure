package com.ds.pratice.DataStructure.Classes.Tree;

import java.util.Stack;

public class InOrderTraversalBT {

    BinaryNode root;


    public static void main(String[] args) {
        InOrderTraversalBT tree = new InOrderTraversalBT();
        tree.root = new BinaryNode(10);
        tree.root.leftNode = new BinaryNode(20);
        tree.root.rightNode = new BinaryNode(30);
        tree.root.leftNode.leftNode = new BinaryNode(40);
        tree.root.leftNode.leftNode.leftNode = new BinaryNode(70);
        tree.root.leftNode.rightNode = new BinaryNode(50);
        tree.root.rightNode.leftNode = new BinaryNode(60);
        tree.root.leftNode.leftNode.rightNode = new BinaryNode(80);
        tree.inOrderIterative();
    }


    private void inOrderIterative(){

        Stack<BinaryNode> st =  new Stack<>();
        BinaryNode current = root;

        while (null != current || !st.empty()){

            while (null != current){
                st.push(current);
                current = current.leftNode;
            }

            current = st.pop();

            System.out.println(current.data);
            current = current.rightNode;
        }

    }
}
