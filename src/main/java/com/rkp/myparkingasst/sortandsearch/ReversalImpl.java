package com.rkp.myparkingasst.sortandsearch;

public class ReversalImpl {
	public String getReversedString(String inputString) {
		if (inputString == null) {
			return null;
		}
		
		char [] tempCharArray = new char [inputString.length()];
		for (int i = 0; i < inputString.length(); i ++) {
			tempCharArray[i] = inputString.charAt(inputString.length() - i - 1);
		}
		
	//	System.out.println("Input String: " + inputString + "; Return String: " + new String(tempCharArray));
		return new String(tempCharArray);
	}

	public int [] getReversedArray(int[] inputArray) {
		if (inputArray == null) {
			return null;
		}
		
		int temp = -1;
		
		for (int i = 0; i < inputArray.length/2; i ++) {
			temp = inputArray[inputArray.length - i - 1];
			inputArray[inputArray.length - i - 1] = inputArray[i];
			inputArray[i] = temp;
		}
		
		return inputArray;
	}

}
