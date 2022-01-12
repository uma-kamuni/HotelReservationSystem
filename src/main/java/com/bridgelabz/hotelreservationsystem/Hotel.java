package com.bridgelabz.hotelreservationsystem;

public class Hotel {
	private String hotelName;
	private int regularCustomerRate;
	private int totalRate;

	public Hotel(String hotelName, int regularCustomerRate) {
		this.hotelName = hotelName;
		this.regularCustomerRate = regularCustomerRate;
	}
}
