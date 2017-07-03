package com.rkp.myparkingasst.sortandsearch;

public class DataSortFactory {
	public static DataSorter getDataSorter(String input) {
		if (input.equals("MERGE_SORT")) {
			return new MergeSorter();
		}
		return null;
	}

}
