package com.ds.pratice.DataStructure.Classes.Tree;

public class BinarySearchTree {
    BSTNode root;

    public void insert(int data) {

        if(root == null){
            root = new BSTNode(data);
        }else {
            BSTNode current = root;
            BSTNode present = null;

            while (null != current){
                present = current;
                if(data < current.data){
                    current = current.leftNode;
                }
                else {
                    current = current.rightNode;
                }
            }
            if(data < present.data){
                present.leftNode = new BSTNode(data);
            }else {
                present.rightNode = new BSTNode(data);
            }
        }
    }

    public BSTNode insertrec(BSTNode root ,int data){
        if(root == null){
            root = new BSTNode(data);
        }else if(data < root.data){
            root.leftNode = insertrec(root.leftNode, data);
        }else {
            root.rightNode = insertrec(root.rightNode, data);
        }
        return root;
    }

    public  void add(int data){
        root = insertrec(root, data);
    }

    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
       /* binarySearchTree.insert(10);
        binarySearchTree.insert(20);
        binarySearchTree.insert(8);
        binarySearchTree.insert(150);
        System.out.println(binarySearchTree);*/
        binarySearchTree.add(10);
        binarySearchTree.add(20);
        binarySearchTree.add(8);
        binarySearchTree.add(150);
        /*binarySearchTree.root = binarySearchTree.insertrec(binarySearchTree.root, 10);
        binarySearchTree.root = binarySearchTree.insertrec(binarySearchTree.root,20);
        binarySearchTree.root = binarySearchTree.insertrec(binarySearchTree.root,8);
        binarySearchTree.root = binarySearchTree.insertrec(binarySearchTree.root,150);*/
        System.out.println(binarySearchTree);
    }
}
