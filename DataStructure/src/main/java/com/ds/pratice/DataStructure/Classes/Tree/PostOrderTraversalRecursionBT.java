package com.ds.pratice.DataStructure.Classes.Tree;

public class PostOrderTraversalRecursionBT {
    BinaryNode root;

    public static void main(String[] args) {
        PostOrderTraversalRecursionBT tree = new PostOrderTraversalRecursionBT();
        tree.root = new BinaryNode(10);
        tree.root.leftNode = new BinaryNode(20);
        tree.root.rightNode = new BinaryNode(30);
        tree.root.leftNode.leftNode = new BinaryNode(40);
        tree.root.leftNode.leftNode.leftNode = new BinaryNode(70);
        tree.root.leftNode.rightNode = new BinaryNode(50);
        tree.root.rightNode.leftNode = new BinaryNode(60);
        tree.root.leftNode.leftNode.rightNode = new BinaryNode(80);
        tree.postOrderIterativeR();
    }

    private void postOrderIterativeR() {
        postOrderIterativeR(root);
    }

    private void postOrderIterativeR(BinaryNode node){
        if(null == node){
            return;
        }
        postOrderIterativeR(node.leftNode);
        postOrderIterativeR(node.rightNode);
        System.out.println(node.data);
    }

}
