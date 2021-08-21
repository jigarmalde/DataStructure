package com.ds.pratice.DataStructure.Classes.Tree;

import java.util.Stack;

public class PreOrderTraversalBT {

    BinaryNode root;

    public void preOrderIterative(){
        preOrderIterative(root);
    }

    public void preOrderIterative(BinaryNode node){
        Stack<BinaryNode> st = new Stack<>();
        BinaryNode current = node;

        while (null != current || !st.empty()){

            while (null != current){
                System.out.println(current.data + " ");

                if(current.rightNode != null){
                    st.push(current.rightNode);
                }

                current = current.leftNode;
            }

            if (!st.empty()){
                current = st.pop();
            }
        }
    }

    public static void main(String[] args) {
        PreOrderTraversalBT preOrderTraversalBT = new PreOrderTraversalBT();
        preOrderTraversalBT.root = new BinaryNode(10);
        preOrderTraversalBT.root.leftNode = new BinaryNode(20);
        preOrderTraversalBT.root.rightNode = new BinaryNode(30);
        preOrderTraversalBT.root.leftNode.leftNode = new BinaryNode(40);
        preOrderTraversalBT.root.leftNode.leftNode.leftNode = new BinaryNode(70);
        preOrderTraversalBT.root.leftNode.rightNode = new BinaryNode(50);
        preOrderTraversalBT.root.rightNode.leftNode = new BinaryNode(60);
        preOrderTraversalBT.root.leftNode.leftNode.rightNode = new BinaryNode(80);
        preOrderTraversalBT.preOrderIterative();
    }
}
