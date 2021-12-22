package com.ds.pratice.DataStructure.Classes.Tree;

public class LCA {
    TreeNode root;

    public static void main(String[] args) {
        LCA tree = new LCA();

        tree.root = new TreeNode(1);

        tree.root.leftChild = new TreeNode(2);
        tree.root.rightChild = new TreeNode(6);
        tree.root.rightChild.rightChild = new TreeNode(9);

        tree.root.leftChild.leftChild = new TreeNode(3);
        tree.root.leftChild.rightChild = new TreeNode(4);

        tree.root.leftChild.rightChild.rightChild = new TreeNode(5);
        tree.root.leftChild.rightChild.rightChild.rightChild = new TreeNode(10);

        tree.root.leftChild.leftChild.leftChild = new TreeNode(7);
        tree.root.leftChild.leftChild.leftChild.leftChild = new TreeNode(8);

        TreeNode lCANode = LCA(tree.root, 3, 4);
        if(null!=lCANode) {
            System.out.println("LCA node value is " + lCANode.data);
        }else {
            System.out.println("LCA not found");
        }
    }

    public static TreeNode LCA(TreeNode root, int data1, int data2) {
        if (root == null) {
            return null;
        }
        if (root.data == data1 || root.data == data2) {
            return root;
        }
        TreeNode leftLCA = LCA(root.leftChild, data1, data2);
        TreeNode rightLCA = LCA(root.rightChild, data1, data2);
        if (leftLCA != null && rightLCA != null) {
            return root;
        }
        if (leftLCA != null && rightLCA == null) {
            return leftLCA;
        } else if (leftLCA == null && rightLCA != null) {
            return rightLCA;
        }
        return null;
    }
}
