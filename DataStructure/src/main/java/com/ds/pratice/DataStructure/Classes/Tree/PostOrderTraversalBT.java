package com.ds.pratice.DataStructure.Classes.Tree;

import java.util.Stack;

public class PostOrderTraversalBT {
    BinaryNode root;



    public static void main(String[] args) {
        PostOrderTraversalBT tree = new PostOrderTraversalBT();
        tree.root = new BinaryNode(10);
        tree.root.leftNode = new BinaryNode(20);
        tree.root.rightNode = new BinaryNode(30);
        tree.root.leftNode.leftNode = new BinaryNode(40);
        tree.root.leftNode.leftNode.leftNode = new BinaryNode(70);
        tree.root.leftNode.rightNode = new BinaryNode(50);
        tree.root.rightNode.leftNode = new BinaryNode(60);
        tree.root.leftNode.leftNode.rightNode = new BinaryNode(80);
        tree.postOrderIterative();
    }

    private void postOrderIterative() {
        postOrderIterative(root);
    }

    private void postOrderIterative(BinaryNode node){
        Stack<BinaryNode> stack = new Stack<>();
        while(true) {
            while(node != null) {
                stack.push(node);
                stack.push(node);
                node = node.leftNode;
            }

            // Check for empty stack
            if(stack.empty()) return;
            node = stack.pop();

            if(!stack.empty() && stack.peek() == node) {
                node = node.rightNode;
            }

            else {

                System.out.print(node.data + " "); node = null;
            }
        }
    }
}
