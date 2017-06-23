package com.rkp.myparkingasst.constants;

public class ParkingAreaDetails {
	public enum ParkingAreaTypes {
		PRIVATELY_OWNED, 
		PUBLIC_PRIVATE_PARTNERSHIP, 
		PUBLIC_PARKING_AREA, 
		MALL, 
		OFFICE_SPACE,
		APARTMENT_COMPLEX
	}
	
	public enum ParkingType {
		HOURLY, 
		BI_HOURLY, 
		PER_FOUR_HOURS,	
		PER_DAY, 
		PER_MONTH, 
		MEMBERSHIP_BASED,
	}
	
	public enum ParkingPaymentTypes {
		PREPAID,
		PAY_AND_USE,
		PAY_AFTER_USE,
		SUBSCRIPTION,
		
	}


}
