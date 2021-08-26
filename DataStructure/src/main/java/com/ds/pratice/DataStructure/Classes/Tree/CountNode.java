package com.ds.pratice.DataStructure.Classes.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class CountNode {
    BinaryNode root;

    private void countAllNode(){
        Queue<BinaryNode> q = new LinkedList<>();
        int count =0;
        q.add(root);

        while (!q.isEmpty()){
            BinaryNode tempNode = q.poll();
            if(tempNode != null){
                count++;

                if(tempNode.leftNode != null){
                    q.add(tempNode.leftNode);
                }
                if(tempNode.rightNode != null){
                    q.add(tempNode.rightNode);
                }
            }
        }

        System.out.println("Count of all node " + count);
    }

    private void countLeafNode(){
        Queue<BinaryNode> q = new LinkedList<>();
        int count =0;
        q.add(root);

        while (!q.isEmpty()){
            BinaryNode tempNode = q.poll();
            if(tempNode != null){

                if(tempNode.leftNode == null && tempNode.rightNode == null){
                    count++;
                }

                if(tempNode.leftNode != null){
                    q.add(tempNode.leftNode);
                }
                if(tempNode.rightNode != null){
                    q.add(tempNode.rightNode);
                }
            }
        }

        System.out.println("Count leaf node " + count);
    }

    private void countFullNode(){
        Queue<BinaryNode> q = new LinkedList<>();
        int count =0;
        q.add(root);

        while (!q.isEmpty()){
            BinaryNode tempNode = q.poll();
            if(tempNode != null){

                if(tempNode.leftNode != null && tempNode.rightNode != null){
                    count++;
                }

                if(tempNode.leftNode != null){
                    q.add(tempNode.leftNode);
                }
                if(tempNode.rightNode != null){
                    q.add(tempNode.rightNode);
                }
            }
        }

        System.out.println("Count Full node " + count);
    }

    private void countHalfNode(){
        Queue<BinaryNode> q = new LinkedList<>();
        int count =0;
        q.add(root);

        while (!q.isEmpty()){
            BinaryNode tempNode = q.poll();
            if(tempNode != null){

                if((tempNode.leftNode == null && tempNode.rightNode != null)
                || (tempNode.leftNode != null && tempNode.rightNode == null)){
                    count++;
                }

                if(tempNode.leftNode != null){
                    q.add(tempNode.leftNode);
                }
                if(tempNode.rightNode != null){
                    q.add(tempNode.rightNode);
                }
            }
        }

        System.out.println("Count Half node " + count);
    }
    public static void main(String[] args) {
        CountNode tree = new CountNode();
        tree.root = new BinaryNode(10);
        tree.root.leftNode = new BinaryNode(20);
        tree.root.rightNode = new BinaryNode(30);
        tree.root.leftNode.leftNode = new BinaryNode(40);
        tree.root.leftNode.leftNode.leftNode = new BinaryNode(70);
        tree.root.leftNode.rightNode = new BinaryNode(50);
        tree.root.rightNode.leftNode = new BinaryNode(60);
        tree.root.leftNode.leftNode.rightNode = new BinaryNode(80);
        //tree.root.leftNode.rightNode.leftNode= new BinaryNode(100);
        tree.countAllNode();
        tree.countLeafNode();
        tree.countFullNode();
        tree.countHalfNode();
    }
}
