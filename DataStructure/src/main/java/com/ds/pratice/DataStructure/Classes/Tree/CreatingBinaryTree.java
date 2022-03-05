package com.ds.pratice.DataStructure.Classes.Tree;

import java.util.*;

public class CreatingBinaryTree {
    int val;
    CreatingBinaryTree left;
    CreatingBinaryTree right;
    CreatingBinaryTree(int x) { val = x; }
}

class BinaryTree {
    static Set<CreatingBinaryTree> set = new HashSet<>();
    static Stack<CreatingBinaryTree> stack = new Stack<>();

    // Function to build tree using given traversal
    public static CreatingBinaryTree buildTree(int[] preorder, int[] inorder)
    {

        CreatingBinaryTree root = null;
        for (int pre = 0, in = 0; pre < preorder.length;) {

            CreatingBinaryTree node = null;
            do {
                node = new CreatingBinaryTree(preorder[pre]);
                if (root == null) {
                    root = node;
                }
                if (!stack.isEmpty()) {
                    if (set.contains(stack.peek())) {
                        set.remove(stack.peek());
                        stack.pop().right = node;
                    }
                    else {
                        stack.peek().left = node;
                    }
                }
                stack.push(node);
            } while (preorder[pre++] != inorder[in] && pre < preorder.length);

            node = null;
            while (!stack.isEmpty() && in < inorder.length &&
                    stack.peek().val == inorder[in]) {
                node = stack.pop();
                in++;
            }

            if (node != null) {
                set.add(node);
                stack.push(node);
            }
        }

        return root;
    }

    // Function to print tree in Inorder
    static void printInorder(CreatingBinaryTree node)
    {
        if (node == null)
            return;

        /* first recur on left child */
        printInorder(node.left);

        /* then print the data of node */
        System.out.print(node.val + " ");

        /* now recur on right child */
        printInorder(node.right);
    }

    // driver program to test above functions
    public static void main(String args[])
    {
        BinaryTreeDemo tree = new BinaryTreeDemo();

        int in[] = new int[] { 9, 8, 4, 2, 10, 5, 10, 1, 6, 3, 13, 12, 7 };
        int pre[] = new int[] { 1, 2, 4, 8, 9, 5, 10, 10, 3, 6, 7, 12, 13 };
        int len = in.length;

        CreatingBinaryTree root = buildTree(pre, in);

        printInorder(root);
    }
}