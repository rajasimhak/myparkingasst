package com.rkp.myparkingasst.sortandsearch;

public class MyTreeNode {
	
	private Integer data;
	private MyTreeNode leftTreeNode;
	private MyTreeNode rightTreeNode;
	
	public MyTreeNode() {
		
	}
	
	public MyTreeNode(int data, MyTreeNode leftTreeNode, MyTreeNode rightTreeNode) {
		this.data = data;
		this.leftTreeNode = leftTreeNode;
		this.rightTreeNode = rightTreeNode;
	}
	
	public Integer getData() {
		return data;
	}
	public void setData(Integer data) {
		this.data = data;
	}
	public MyTreeNode getLeftTreeNode() {
		return leftTreeNode;
	}
	public void setLeftTreeNode(MyTreeNode leftTreeNode) {
		this.leftTreeNode = leftTreeNode;
	}
	public MyTreeNode getRightTreeNode() {
		return rightTreeNode;
	}
	public void setRightTreeNode(MyTreeNode rightTreeNode) {
		this.rightTreeNode = rightTreeNode;
	}
	
	

}
