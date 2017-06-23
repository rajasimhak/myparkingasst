package com.rkp.myparkingasst.beans;

import com.rkp.myparkingasst.constants.VehicleDetails.VehicleType;

public class Vehicle {
	private String regNumber;
	private String make;
	private String model;
	private int seatingCapacity;
	private VehicleType vehicleType;
	
	public Vehicle(String regNumber, String make, String model, int seatingCapacity,
			VehicleType vehicleType) {
		this.regNumber = regNumber;
		this.make = make;
		this.model = model;
		this.seatingCapacity = seatingCapacity;
		this.vehicleType = vehicleType;
	}
	public String getRegNumber() {
		return regNumber;
	}
	public void setRegNumber(String regNumber) {
		this.regNumber = regNumber;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getSeatingCapacity() {
		return seatingCapacity;
	}
	public void setSeatingCapacity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}
	public VehicleType getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}
}
