package com.ds.pratice.DataStructure.Classes.Tree;

import java.util.*;

public class LeftViewTree {

    BinaryNode root;
    Map<Integer, Integer> map =new TreeMap<>();

    public static void main(String[] args) {
        LeftViewTree tree = new LeftViewTree();
        tree.root = new BinaryNode(10);
        tree.root.leftNode = new BinaryNode(20);
        tree.root.rightNode = new BinaryNode(30);
        tree.root.leftNode.leftNode = new BinaryNode(40);
        tree.root.leftNode.leftNode.leftNode = new BinaryNode(70);
        tree.root.leftNode.rightNode = new BinaryNode(50);
        tree.root.rightNode.leftNode = new BinaryNode(60);
        tree.root.leftNode.leftNode.rightNode = new BinaryNode(80);
        tree.root.rightNode.leftNode.rightNode = new BinaryNode(101);
        tree.root.rightNode.leftNode.rightNode.rightNode = new BinaryNode(102);
        //tree.rightViewTree(tree.root);
        tree.leftView(tree.root);
    }

    public void printLeftView(BinaryNode root, int level, Map<Integer, Integer> map)
    {
        if (root == null) {
            return;
        }

        // insert the current node and level information into the map
        if(!map.containsKey(level))
            map.put(level, root.data);

        // recur for the left subtree before the right subtree
        printLeftView(root.leftNode, level + 1, map);
        printLeftView(root.rightNode, level + 1, map);
    }

    // Function to print the right view of a given binary tree
    public void printLeftView(BinaryNode root)
    {
        // create an empty map to store the last node for each level
        Map<Integer, Integer> map = new HashMap<>();

        // traverse the tree and fill the map
        printLeftView(root, 1, map);

        // iterate through the map in sorted order of its keys and print the right view
        for (int i = 1; i <= map.size(); i++) {
            System.out.print(map.get(i) + " ");
        }
    }

    public static void leftView(BinaryNode root) {
        // return if the tree is empty
        if (root == null) {
            return;
        }

        // create an empty queue and enqueue the root node
        Queue<BinaryNode> queue = new ArrayDeque<>();
        queue.add(root);

        // to store the current node
        BinaryNode curr;

        // loop till queue is empty
        while (!queue.isEmpty()) {
            // calculate the total number of nodes at the current level
            int size = queue.size();
            int i = 0;

            // process every node of the current level and enqueue their
            // non-empty left and right child
            while (i++ < size) {
                curr = queue.poll();

                // if this is the first node of the current level, print it
                if (i == 1) {
                    System.out.print(curr.data + " ");
                }

                if (curr.leftNode != null) {
                    queue.add(curr.leftNode);
                }

                if (curr.rightNode != null) {
                    queue.add(curr.rightNode);
                }
            }
        }
    }
}
