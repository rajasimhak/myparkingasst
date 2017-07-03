package com.rkp.myparkingasst.sortandsearch;

import java.util.ArrayList;

public class MyBinaryTree {
	public MyBinaryTree() {
	}
	
	private MyTreeNode rootNode = null;
	private MyTreeNode parentNode = null;
	private MyTreeNode currentTreeNode = null;
	
	public MyBinaryTree insert(int data) {
		return null;
	}
	
	public boolean contains(int data) {
		return false;
	}
	
	public ArrayList leftTraversal(MyTreeNode rootNode) {
		ArrayList <Integer> arrayList = new ArrayList<Integer>();
		if (rootNode == null) {
			return null;
		}
		
		MyTreeNode currentNode = rootNode;
		
		if (currentNode.getLeftTreeNode() != null) {
			arrayList.add(currentNode.getData());
			currentNode = currentNode.getLeftTreeNode();				
			arrayList.addAll(leftTraversal(currentNode));
		} else if (currentNode.getRightTreeNode() != null) {
			currentNode = currentNode.getRightTreeNode();
			arrayList.addAll(leftTraversal(currentNode));
		} else {
			arrayList.add(currentNode.getData());
		}
		
		return arrayList;
	}
	
	public int[] rightTraversal() {
		return new int[] {};
	}
	

}
