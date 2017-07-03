package com.rkp.myparkingasst.sortandsearch;

import java.util.ArrayList;
import java.util.Iterator;

public class MergeSorter implements DataSorter {
	
	public static int stepCounter = 0;

	public Object[] sort(Object [] inputArray) {
		stepCounter ++;
		if (inputArray == null || inputArray.length == 0) {
			return null;
		}
		
		if (inputArray.length == 1) {
			return inputArray;
		}
		
		Object [] leftArray = new Object [inputArray.length/2];
		Object [] rightArray = new Object [inputArray.length - inputArray.length/2];
		
		for (int i = 0; i < inputArray.length/2; i++) {
			leftArray[i] = inputArray[i];
		}
		
		if (inputArray.length % 2 == 0) {
			for (int i = 0; i < inputArray.length/2; i++) {
				rightArray[i] = inputArray[(inputArray.length/2) + i];
			}
		} else {
			for (int i = 0; i < inputArray.length/2 + 1; i++) {
				rightArray[i] = inputArray[(inputArray.length/2) + i];
			}
		}
			
		leftArray = sort(leftArray);
		rightArray = sort(rightArray);
		
		return merge(leftArray, rightArray);

	}

	public Object[] merge(Object[] leftArray, Object [] rightArray) {
		
		if (leftArray == null || rightArray == null) {
			return null;
		}
		
		printArray("LeftArray...", leftArray);
		printArray("RightArray...", rightArray);
		
		ArrayList<Object> leftArrayList = new ArrayList<Object>();
		ArrayList<Object> rightArrayList = new ArrayList<Object>();
		
		for (int i = 0; i < leftArray.length; i ++) {
			leftArrayList.add(leftArray[i]);
		}
		
		for (int i = 0; i < rightArray.length; i ++) {
			rightArrayList.add(rightArray[i]);
		}
		
		ArrayList<Object> mergedArrayList = new ArrayList<Object>();
		Iterator leftIterator = leftArrayList.iterator();
		Iterator rightIterator = rightArrayList.iterator();
		
		while (true) {
					
			leftIterator = leftArrayList.iterator();
			rightIterator = rightArrayList.iterator();
			
			if (!leftIterator.hasNext() || !rightIterator.hasNext()) {
				break;
			}
			
			if (leftIterator.next().toString().compareTo(rightIterator.next().toString()) > 0) {
				mergedArrayList.add(rightArrayList.get(0));
				rightArrayList.remove(0);
			} else {
				mergedArrayList.add(leftArrayList.get(0));
				leftArrayList.remove(0);
			}
		}
		
		leftIterator = leftArrayList.iterator();
		rightIterator = rightArrayList.iterator();
		
		while (leftIterator.hasNext()) {
			mergedArrayList.add(leftIterator.next());
		}
		
		while (rightIterator.hasNext()) {
			mergedArrayList.add(rightIterator.next());
		}
		
		return mergedArrayList.toArray();
	}
	

	public String printArray(String message, Object [] array) {
		if (array == null || array.length == 0) { return message; }
		
		StringBuffer sbuffer = new StringBuffer();
		
		sbuffer = sbuffer.append(message);
		sbuffer = sbuffer.append(": ");
		
		for (int i = 0; i < array.length - 1; i ++) {
			sbuffer = sbuffer.append (array[i].toString() + ", ");
		}
		sbuffer = sbuffer.append(array[array.length-1].toString());
		
	//	System.out.println("StepCounter: " + stepCounter + ": " + sbuffer.toString());
		return sbuffer.toString();
	}
	

}
