package com.rkp.myparkingasst.beans;

import java.util.Date;

import com.rkp.myparkingasst.constants.ParkingAreaDetails.ParkingType;

public class ParkingSlot {
	private String slotNumber;
	private boolean occupied;
	private int duration;
	private double parkingCostPerDuration;
	
	
	public boolean isOccupied() {
		return occupied;
	}
	public void setOccupied(boolean occupied) {
		this.occupied = occupied;
	}
	public String getSlotNumber() {
		return slotNumber;
	}
	public void setSlotNumber(String slotNumber) {
		this.slotNumber = slotNumber;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public double getParkingCostPerDuration() {
		return parkingCostPerDuration;
	}
	public void setParkingCostPerDuration(double parkingCostPerDuration) {
		this.parkingCostPerDuration = parkingCostPerDuration;
	}
	
	

}
