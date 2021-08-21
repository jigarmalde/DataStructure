package com.ds.pratice.DataStructure.Classes.Tree;

public class PreOrderRecursionTraversalBT {
    BinaryNode root;

    public void preOrderIterative(){
        preOrderIterative(root);
    }

    public void preOrderIterative(BinaryNode node){

        if(null == node){
            return;
        }

        System.out.println(node.data);
        preOrderIterative(node.leftNode);
        preOrderIterative(node.rightNode);
    }


    public static void main(String[] args) {
        PreOrderRecursionTraversalBT tree = new PreOrderRecursionTraversalBT();
        tree.root = new BinaryNode(10);
        tree.root.leftNode = new BinaryNode(20);
        tree.root.rightNode = new BinaryNode(30);
        tree.root.leftNode.leftNode = new BinaryNode(40);
        tree.root.leftNode.leftNode.leftNode = new BinaryNode(70);
        tree.root.leftNode.rightNode = new BinaryNode(50);
        tree.root.rightNode.leftNode = new BinaryNode(60);
        tree.root.leftNode.leftNode.rightNode = new BinaryNode(80);
        tree.preOrderIterative();
    }
}
