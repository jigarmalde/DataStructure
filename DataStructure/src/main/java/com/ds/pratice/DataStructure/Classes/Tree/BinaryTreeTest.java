package com.ds.pratice.DataStructure.Classes.Tree;

public class BinaryTreeTest {
    TreeNode root;

    public BinaryTreeTest() {
        // TODO Auto-generated constructor stub
        this.root = null;
    }

    public static boolean isIdentical(TreeNode root1,TreeNode root2) {
        if(root1 == null && root2 == null) {
            return true;
        }
        if(root1!=null && root2!=null) {
            return ( root1.data == root2 .data
                    && (isIdentical(root1.leftChild, root2.leftChild))
                    && (isIdentical(root1.rightChild, root2.rightChild)) );
        }
        return false;
    }

    public static boolean isMirrorImage(TreeNode root1,TreeNode root2) {
        if(root1 == null && root2 == null) {
            return true;
        }
        if(root1!=null && root2!=null) {
            return ( root1.data == root2 .data
                    && (isMirrorImage(root1.leftChild, root2.rightChild))
                    && (isMirrorImage(root1.rightChild, root2.leftChild)) );
        }
        return false;
    }

    public static void main(String[] args) {
        BinaryTreeTest tree = new BinaryTreeTest();
        tree.root = new TreeNode('A');
        tree.root.leftChild = new TreeNode('B');
        tree.root.rightChild = new TreeNode('C');

        tree.root.leftChild.leftChild = new TreeNode('D');
        tree.root.leftChild.rightChild = new TreeNode('E');

        tree.root.rightChild.rightChild= new TreeNode('F');

        BinaryTreeTest tree2 = new BinaryTreeTest();
        tree2.root = new TreeNode('A');
        tree2.root.leftChild = new TreeNode('B');
        tree2.root.rightChild = new TreeNode('C');

        tree2.root.leftChild.leftChild = new TreeNode('D');
        tree2.root.leftChild.rightChild = new TreeNode('E');

        tree2.root.rightChild.rightChild= new TreeNode('F');


        BinaryTreeTest tree3 = new BinaryTreeTest();
        tree3.root = new TreeNode('A');
        tree3.root.leftChild = new TreeNode('C');
        tree3.root.rightChild = new TreeNode('B');

        tree3.root.rightChild.leftChild = new TreeNode('E');
        tree3.root.rightChild.rightChild = new TreeNode('D');

        tree3.root.leftChild.leftChild= new TreeNode('F');


        //System.out.println(isIdentical( tree.root, tree2.root));
        System.out.println(isMirrorImage( tree.root, tree3.root));

    }
}
