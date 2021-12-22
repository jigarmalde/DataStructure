package com.ds.pratice.DataStructure.Classes.Tree;

public class DiameterOfTree {
    TreeNode root;

    public static void main(String[] args) {

        DiameterOfTree tree = new DiameterOfTree();

        tree.root = new TreeNode(1);

        tree.root.leftChild = new TreeNode(2);
        tree.root.rightChild = new TreeNode(6);

        tree.root.leftChild.leftChild = new TreeNode(3);
        tree.root.leftChild.rightChild = new TreeNode(4);

        //tree.root.leftChild.rightChild.rightChild = new TreeNode(5);
        //tree.root.leftChild.rightChild.rightChild.rightChild=new TreeNode(10);

        tree.root.leftChild.leftChild.leftChild=new TreeNode(7);
        tree.root.leftChild.leftChild.leftChild.leftChild=new TreeNode(8);

        System.out.println(diameter(tree.root));

    }

    /*
     * public static int diameter(TreeNode root) { if (null == root) { return 0; }
     * int leftHeight = findHeight(root.leftChild); int rightHeight =
     * findHeight(root.rightChild); int leftDiameter = diameter(root.leftChild); int
     * rightDiameter = diameter(root.rightChild);
     *
     * return Math.max((leftHeight + rightHeight + 1), (Math.max(leftDiameter,
     * rightDiameter)));
     *
     * }
     */

    public static int diameter(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int leftH= findHeight(root.leftChild);
        int rightH= findHeight(root.rightChild);
        int leftD= diameter(root.leftChild);
        int rightD= diameter(root.rightChild);

        int heightD=1+leftH+rightH;   // when diameter pass via root
        int diam= Math.max(leftD, rightD); // when diamter not pass via root
        return Math.max(heightD, diam);

        //return Math.max((1+leftH+rightH),Math.max(leftD,rightD);

    }


    private static int findHeight(TreeNode root) {

        if (null == root) {
            return 0;
        } else {
            int leftHeight = 1 + findHeight(root.leftChild);
            int rightHeight = 1 + findHeight(root.rightChild);
            if (leftHeight > rightHeight) {
                return leftHeight;
            } else {
                return rightHeight;
            }
        }

    }
}
