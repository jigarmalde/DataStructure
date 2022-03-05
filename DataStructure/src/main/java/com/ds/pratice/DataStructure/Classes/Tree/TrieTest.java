package com.ds.pratice.DataStructure.Classes.Tree;

public class TrieTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String keys[] = { "Ankit","amit","anil","dhruv"};

		String output[] = { "Not present in trie", "Present in trie" };

		Trie root = new Trie();

		// Construct trie
		int i;
		for (i = 0; i < keys.length; i++)
			root.insert(keys[i]);

		// Search for different keys
		if (root.search("Ankit") == true)
			System.out.println("Answer -- " + output[1]);
		else
			System.out.println("Not present");
	}
}
