package com.ds.pratice.DataStructure.Classes.Tree;

import java.util.*;


public class TopView {
    BinaryNode root;
    Map<Integer, Integer> map =new TreeMap<>();

    public static void main(String[] args) {
        TopView tree = new TopView();
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
        tree.topView(tree.root);
    }

    private void topView(BinaryNode root) {

        if (root == null) {
            return;
        }

        // create a `TreeMap` to store the vertical order of binary tree nodes
        // Map<Integer, List<Integer>> map = new TreeMap<>();

        // create an empty queue for level order traversal.
        // `It` stores binary tree nodes and their horizontal distance from the root.
        Queue<Pair<BinaryNode, Integer>> q = new ArrayDeque<>();

        // enqueue root node with horizontal distance as 0
        q.add(Pair.of(root, 0));

        // loop till queue is empty
        while (!q.isEmpty())
        {
            // dequeue front node
            BinaryNode node = q.peek().first;
            int dist = q.peek().second;
            q.poll();

            if(!map.containsKey(dist)){
                map.put(dist, node.data);
            }

            // enqueue non-empty left and right child of the front node
            // with their corresponding horizontal distance
            if (node.leftNode != null) {
                q.add(Pair.of(node.leftNode, dist - 1));
            }

            if (node.rightNode != null) {
                q.add(Pair.of(node.rightNode, dist + 1));
            }
        }

        // print the `TreeMap`
        map.values().stream().forEach(System.out::println);
    }
}
