package com.ds.pratice.DataStructure.Classes.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

    BinaryNode root;

    public static void main(String[] args) {
        LevelOrderTraversal tree = new LevelOrderTraversal();
        tree.root = new BinaryNode(10);
        tree.root.leftNode = new BinaryNode(20);
        tree.root.rightNode = new BinaryNode(30);
        tree.root.leftNode.leftNode = new BinaryNode(40);
        tree.root.leftNode.leftNode.leftNode = new BinaryNode(70);
        tree.root.leftNode.rightNode = new BinaryNode(50);
        tree.root.rightNode.leftNode = new BinaryNode(60);
        tree.root.leftNode.leftNode.rightNode = new BinaryNode(80);
        tree.levelOrderIterative();
    }

    private void levelOrderIterative() {
        Queue<BinaryNode> q = new LinkedList<>();

        q.add(root);

        while (!q.isEmpty()){
            BinaryNode tempNode = q.poll();
            if(tempNode != null){
                System.out.println(tempNode.data);

                if(tempNode.leftNode != null){
                    q.add(tempNode.leftNode);
                }
                if(tempNode.rightNode != null){
                    q.add(tempNode.rightNode);
                }
            }
        }

    }
}
