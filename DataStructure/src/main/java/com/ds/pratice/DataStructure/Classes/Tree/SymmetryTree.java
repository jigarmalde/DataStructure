package com.ds.pratice.DataStructure.Classes.Tree;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class SymmetryTree {

    BinaryNode root;
    public static void main(String[] args) {
        SymmetryTree tree = new SymmetryTree();
        tree.root = new BinaryNode(10);
        //tree.root.leftNode = new BinaryNode(20);
       //tree.root.rightNode = new BinaryNode(20);
        //tree.root.leftNode.leftNode = new BinaryNode(30);
        //tree.root.rightNode.rightNode = new BinaryNode(30);
        //tree.root.leftNode.rightNode = new BinaryNode(40);
       // tree.root.rightNode.leftNode = new BinaryNode(40);
        //tree.root.leftNode.leftNode = new BinaryNode(40);
       // tree.root.leftNode.leftNode.leftNode = new BinaryNode(70);
        //tree.root.leftNode.rightNode = new BinaryNode(50);
        //tree.root.rightNode.leftNode = new BinaryNode(60);
        //tree.root.leftNode.leftNode.rightNode = new BinaryNode(80);
        //tree.root.rightNode.leftNode.rightNode = new BinaryNode(101);
        //tree.root.rightNode.leftNode.rightNode.rightNode = new BinaryNode(102);
        //tree.rightViewTree(tree.root);
        System.out.println(tree.isSymmetric(tree.root));
    }

    public boolean isSymmetric(BinaryNode root) {
        if(null == root){
            return true;
        }
        Queue<BinaryNode> q = new ArrayDeque<>();
        BinaryNode left,right;

        if(root.leftNode != null){
            if(root.rightNode ==null)
                return false;
            q.add(root.leftNode);
            q.add(root.rightNode);
        }else if(root.rightNode != null)
            return false;

        while (!q.isEmpty()){
            if(q.size()%2 !=0)
                return false;

            left = q.poll();
            right = q.poll();

            if(left.data != right.data)
                return false;

            if(left.leftNode != null){
                if(right.rightNode == null)
                    return false;
                q.add(left.leftNode);
                q.add(right.rightNode);
            }else if(right.rightNode != null){
                return false;
            }

            if(left.rightNode != null){
                if(right.leftNode == null)
                    return false;
                q.add(left.rightNode);
                q.add(right.leftNode);
            }else if(right.leftNode != null){
                return false;
            }
        }



        return true;

    }


}
