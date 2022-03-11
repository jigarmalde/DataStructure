package com.ds.pratice.DataStructure.Classes.Tree;

public class Tree {
        int data;
    Tree leftChild;
    Tree rightChild;

    public Tree(){
        this.leftChild = null;
        this.rightChild = null;
    }

        public Tree(int data){
            this.data = data;
            this.leftChild = null;
            this.rightChild = null;
        }

    public int getData() {
        return data;
    }

    public Tree getLeftChild() {
        return leftChild;
    }

    public Tree getRightChild() {
        return rightChild;
    }
}
