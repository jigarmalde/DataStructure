package com.ds.pratice.DataStructure.Classes.Graph;

public class GraphTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Graph gp=new Graph();
		gp.addVertex('A');
		gp.addVertex('B');
		gp.addVertex('C');
		gp.addVertex('D');
		//gp.addVertx('D');
		//gp.addVertx('E');
		gp.addEdge(1,3);   // bd
		gp.addEdge(1,0);   //BA
		
		gp.addEdge(0,2); //AC
		
		gp.addEdge(0,3);  //AD
		//gp.addEdge(2,1);  //AD


		
	
		
		/*
		 * //gp.addEdge(0, 1); //AB gp.addEdge(0, 2); gp.addEdge(1, 1); // BC
		 * gp.addEdge(2, 0); gp.addEdge(2, 3); gp.addEdge(3, 3); //gp.addEdge(2, 0); //
		 * CA //gp.addEdge(3, 4); // DE
		 */		
		gp.DFS();
		//gp.BFS();
		//System.out.println(gp.findPathExist('D'));

	}

}
