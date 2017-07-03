package com.rkp.myparkingasst.pscalc;

public class ParkingSpaceUpdator implements Runnable {
	
	private Thread thread;
	private String threadName;
	
	public ParkingSpaceUpdator(String threadName) {
		this.threadName = threadName;
	//	System.out.println("Creating Thread: " + threadName);
	}

	@Override
	public void run() {
	//	System.out.println ("Running Thread: " + threadName);
		
		synchronized (this) {
			try {
				for (int i = 0; i < 5; i ++) {
	//				System.out.println("Thread: " + threadName + "LoopCounter: " + i);
					Thread.sleep(1);
				} 
			} catch (InterruptedException ie) {
	//			System.out.println(ie.toString());
			}
		}
	}
	
	public void start() {
	//	System.out.println("Starting Thread: " + threadName);
		
		if (thread == null) {
			thread = new Thread(this, threadName);
			thread.start();
			thread.setPriority(10);
		}
	}
}
