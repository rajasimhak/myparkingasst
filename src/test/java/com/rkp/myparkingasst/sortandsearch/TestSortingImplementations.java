package com.rkp.myparkingasst.sortandsearch;

import junit.framework.TestCase;

import org.junit.Test;

public class TestSortingImplementations extends TestCase {

	@Test
	public void testMergeSort() {
		DataSorter dataSorter = DataSortFactory.getDataSorter("MERGE_SORT");
	//	int [] inputNumbers = {14, 33, 27, 10, 35, 19, 44, 20};
	//	int [] sortedNumbers = dataSorter.sort(inputNumbers);
	//	assertTrue(assertEquals(sortedNumbers, new int []{10, 14, 19, 20, 27, 33, 35, 44}));
		
	}
	
	@Test
	public void testPrintMessageNullArray() {
		DataSorter dataSorter = DataSortFactory.getDataSorter("MERGE_SORT");
		String message = dataSorter.printArray("Null Message", null);
		assertEquals("Null Message", message);
	}
	
	@Test
	public void testPrintMessageSingleLengthArray() {
		DataSorter dataSorter = DataSortFactory.getDataSorter("MERGE_SORT");
		String message = dataSorter.printArray("Array", new Integer[]{1});
		assertEquals("Array: 1", message);
	}
	
	@Test
	public void testPrintMessageMultiLengthArray() {
		DataSorter dataSorter = DataSortFactory.getDataSorter("MERGE_SORT");
		String message = dataSorter.printArray("Array", new Integer[]{1, 2, 3});
		assertEquals("Array: 1, 2, 3", message);
	}
	
	@Test
	public void testPrintMessageMultiLengthStringArray() {
		DataSorter dataSorter = DataSortFactory.getDataSorter("MERGE_SORT");
		String message = dataSorter.printArray("Array", new String[]{"A", "B", "C"});
		assertEquals("Array: A, B, C", message);
	}
	
	@Test
	public void testMergeNull() {
		MergeSorter dataSorter = (MergeSorter) DataSortFactory.getDataSorter("MERGE_SORT");
		Object [] returnArray = dataSorter.merge(null, null);
		assertNull(returnArray);
	}

	@Test
	public void testMergeSingleLeftArrayLesserThanRightArray() {
		MergeSorter dataSorter = (MergeSorter) DataSortFactory.getDataSorter("MERGE_SORT");
		Object [] returnArray = dataSorter.merge(new Object[] {100}, new Object [] {200});
		assertEquals(returnArray[0], 100);
		assertEquals(returnArray[1], 200);
	}
	
	@Test
	public void testMergeSingleRightArrayLesserThanLeftArray() {
		MergeSorter dataSorter = (MergeSorter) DataSortFactory.getDataSorter("MERGE_SORT");
		Object [] returnArray = dataSorter.merge(new Object[] {200}, new Object [] {100});
		assertEquals(returnArray[0], 100);
		assertEquals(returnArray[1], 200);
	}
	

	@Test
	public void testMergeSingleLeftArrayHavingMoreElements() {
		MergeSorter dataSorter = (MergeSorter) DataSortFactory.getDataSorter("MERGE_SORT");
		Object [] returnArray = dataSorter.merge(new Object[] {200, 95}, new Object [] {100});
		assertEquals(returnArray[0], 100);
		assertEquals(returnArray[1], 200);
		assertEquals(returnArray[2], 95);
	}
	
	@Test
	public void testMergeSingleRightArrayHavingMoreElements() {
		MergeSorter dataSorter = (MergeSorter) DataSortFactory.getDataSorter("MERGE_SORT");
		Object [] returnArray = dataSorter.merge(new Object[] {200, 95}, new Object [] {100, 1000, 3234});
		assertEquals(returnArray[0], 100);
		assertEquals(returnArray[1], 1000);
		assertEquals(returnArray[2], 200);
		assertEquals(returnArray[3], 3234);
		assertEquals(returnArray[4], 95);
	}
	
	@Test
	public void testMergeSortNull() {
		MergeSorter dataSorter = (MergeSorter) DataSortFactory.getDataSorter("MERGE_SORT");
		Object [] returnArray = dataSorter.sort(null);
		assertNull(returnArray);
	}

	@Test
	public void testMergeSortEmpty() {
		MergeSorter dataSorter = (MergeSorter) DataSortFactory.getDataSorter("MERGE_SORT");
		Object [] returnArray = dataSorter.sort(new Object[]{});
		assertNull(returnArray);
	}
	
	@Test
	public void testMergeSortSingleElementArray() {
		MergeSorter dataSorter = (MergeSorter) DataSortFactory.getDataSorter("MERGE_SORT");
		Object [] returnArray = dataSorter.sort(new Object[]{100});
		assertEquals(returnArray[0], 100);
	}
	
	@Test
	public void testMergeSortTwoElementSortedArray() {
		MergeSorter dataSorter = (MergeSorter) DataSortFactory.getDataSorter("MERGE_SORT");
		Object [] returnArray = dataSorter.sort(new Object[]{100, 200});
		assertEquals(returnArray[0], 100);
		assertEquals(returnArray[1], 200);
	}
	
	@Test
	public void testMergeSortTwoElementUnSortedArray() {
		MergeSorter dataSorter = (MergeSorter) DataSortFactory.getDataSorter("MERGE_SORT");
		Object [] returnArray = dataSorter.sort(new Object[]{800, 200});
		assertEquals(returnArray[0], 200);
		assertEquals(returnArray[1], 800);
	}
	
	@Test
	public void testMergeSortTwoElementUnSortedEvenLengthArray() {
		MergeSorter dataSorter = (MergeSorter) DataSortFactory.getDataSorter("MERGE_SORT");
		Object [] returnArray = dataSorter.sort(new Object[]{800, 200, 700, 300, 500, 400});
		assertEquals("SortedArray: 200, 300, 400, 500, 700, 800", dataSorter.printArray("SortedArray", returnArray));
		assertEquals(returnArray[0], 200);
		assertEquals(returnArray[1], 300);
		assertEquals(returnArray[2], 400);
		assertEquals(returnArray[3], 500);
		assertEquals(returnArray[4], 700);
		assertEquals(returnArray[5], 800);
	}
	
	@Test
	public void testNumbers() {
		assertEquals(3, 7/2);
		assertEquals(3, 6/2);
	}
	
	
	private boolean assertEquals(Object[] array1, Object[] array2) {
		if (array1.length != array2.length) {
			return false;
		}
		
		for (int i = 0; i < array1.length; i ++) {
			if (array1[i] != array2[i]) {
				return false;
			}
		}
		
		return true;
		
	}
}
