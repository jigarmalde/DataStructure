package com.ds.pratice.DataStructure.Classes.Tree;

public class SerializeDeserializeTree {
	TreeNode root;
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		SerializeDeserializeTree tree = new SerializeDeserializeTree();
		        tree.root = new TreeNode(1);
		        tree.root.leftChild = new TreeNode(2);
		        tree.root.rightChild = new TreeNode(3);
		        tree.root.leftChild.leftChild = new TreeNode(4);
		        tree.root.leftChild.rightChild = new TreeNode(5);
		        
		        String string=serialize(tree.root);
		        System.out.println(string);
		        TreeNode rootNode=deserializeBinaryTree(string);
		        System.out.println(rootNode);

		}
	
	public static String serialize(TreeNode rootNode) {
		 if (rootNode == null) {
	            return "null,";
	        }
		 	StringBuilder sb = new StringBuilder();
	        sb.append(rootNode.getData());
	        sb.append(",");
	 
	        sb.append(serialize(rootNode.getLeftChild()));
	        sb.append(serialize(rootNode.getRightChild()));
	        return sb.toString();
	}
	
	 public static TreeNode deserializeBinaryTree(String data) {
	        String[] temp = data.split(",");
	        return deserialize(temp, new int[] {0});
	      
	    }
	 
	    private static TreeNode deserialize(String[] data, int[] index) {
	        if (index[0] > data.length || data[index[0]].equals("null")) {   // for end of node Array or null b
	        																								//values
	            index[0]++;
	            return null;
	        }
	        TreeNode node = new TreeNode(Integer.parseInt(data[index[0]++]));
	        node.setLeftChild(deserialize(data, index));
	        node.setRightChild(deserialize(data, index));
	 
	        return node;
	    }
}
