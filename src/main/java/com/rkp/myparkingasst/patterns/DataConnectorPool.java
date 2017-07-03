package com.rkp.myparkingasst.patterns;

public class DataConnectorPool {
	
	private static DataConnectorPool [] dataConnectorPool;
	private static int dataConnectorPoolLimit = 0;
	
	private DataConnectorPool() {
		
	}
	
	public DataConnectorPool getInstance() {
		if (dataConnectorPoolLimit < 10) {
			DataConnectorPool dcp = new DataConnectorPool();
			dataConnectorPool[dataConnectorPoolLimit ++] = dcp;
			return dcp;
		} else {
			return null;
		}
		
	}

}
