package com.ds.pratice.DataStructure.Classes.Tree;

import java.util.ArrayDeque;
import java.util.Queue;

public class HeightCal {
    BinaryNode root;
    public static void main(String[] args) {
        HeightCal tree = new HeightCal();
        tree.root = new BinaryNode(10);
        tree.root.leftNode = new BinaryNode(20);
        tree.root.rightNode = new BinaryNode(30);
        tree.root.leftNode.leftNode = new BinaryNode(40);
        tree.root.leftNode.leftNode.leftNode = new BinaryNode(70);
        //tree.root.leftNode.rightNode = new BinaryNode(50);
        //tree.root.rightNode.leftNode = new BinaryNode(60);
        //tree.root.leftNode.leftNode.rightNode = new BinaryNode(80);
        //tree.root.rightNode.leftNode.rightNode = new BinaryNode(101);
        //tree.root.rightNode.leftNode.rightNode.rightNode = new BinaryNode(102);
        //tree.rightViewTree(tree.root);
        System.out.println(tree.height(tree.root));
    }

    private int heightCal(BinaryNode root) {

        if(null == root){
            return 0;
        }

        return 1 + Math.max(heightCal(root.leftNode), heightCal(root.rightNode));


    }
    public int height(BinaryNode root)
    {
        // empty tree has a height of 0
        if (root == null) {
            return 0;
        }

        // create an empty queue and enqueue the root node
        Queue<BinaryNode> queue = new ArrayDeque<>();
        queue.add(root);

        BinaryNode front = null;
        int height = 0;

        // loop till queue is empty
        while (!queue.isEmpty())
        {
            // calculate the total number of nodes at the current level
            int size = queue.size();

            // process each node of the current level and enqueue their
            // non-empty left and right child
            while (size-- > 0)
            {
                front = queue.poll();

                if (front.leftNode != null) {
                    queue.add(front.leftNode);
                }

                if (front.rightNode != null) {
                    queue.add(front.rightNode);
                }
            }

            // increment height by 1 for each level
            height++;
        }

        return height;
    }
}
