package com.bridgelabz.hotelreservationsystem;

import java.util.ArrayList;

public class HotelReservationSystem {
	private ArrayList<Hotel> hotelList = new ArrayList<Hotel>();

	public boolean addHotel(Hotel newHotel) {
              System.out.println("");
              hotelList.add(newHotel);
              return true;
          }

	public static void main(String[] args) {
		System.out.println("Welcome To Hotel Reservation Program");
	}

}
