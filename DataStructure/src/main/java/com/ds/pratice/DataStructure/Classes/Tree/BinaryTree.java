package com.ds.pratice.DataStructure.Classes.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    BinaryNode root;
    Queue<BinaryNode> binaryNodes = new LinkedList<>();

    public void insert(int data) {

        if (root == null) {
            root = new BinaryNode(data);
        } else {
            BinaryNode current = root;
            BinaryNode present = null;

            while (null != current){
                present = current;
                if(null != current.leftNode){
                    current = current.leftNode;
                }
                else {
                    current = current.rightNode;
                }
            }
            if(null == present.leftNode){
                present.leftNode = new BinaryNode(data);
            }else {
                present.rightNode = new BinaryNode(data);
            }
           /*binaryNodes.add(new BinaryNode(data));
            BinaryNode current = root;
            while(!binaryNodes.isEmpty()){
                if(current.leftNode != null && current.rightNode != null){
                    current = current.leftNode;

                }else if(null == current.leftNode){
                    current.leftNode = binaryNodes.remove();
                }else if(null == current.rightNode){
                    current.rightNode = binaryNodes.remove();
                }
            }*/
        }





    }
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insert(10);
        binaryTree.insert(20);
        binaryTree.insert(30);
        binaryTree.insert(40);
        binaryTree.insert(50);
        binaryTree.insert(60);
        binaryTree.insert(70);
        System.out.println(binaryTree);


    }
}
