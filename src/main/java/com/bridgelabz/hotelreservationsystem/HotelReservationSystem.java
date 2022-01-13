package com.bridgelabz.hotelreservationsystem;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;

public class HotelReservationSystem {
	private ArrayList<Hotel> hotelList = new ArrayList<Hotel>();

	public boolean addHotel(Hotel newHotel) {
		System.out.println("Added Hotel Successfully");
		hotelList.add(newHotel);
		return true;
	}
	public Hotel findCheapestHotel(Date start, Date end) {
		long noOfDays = (1 + (end.getTime() - start.getTime())) / (1000 * 60 * 60 * 24) + 1;
		System.out.println("num of days " + noOfDays);
		Hotel cheapestHotel = hotelList.stream()
				.sorted(Comparator.comparing(Hotel::getRegularCustomerRate))
				.findFirst()
				.orElse(null);
		int totalCostOfStay = (int) (noOfDays * cheapestHotel.getRegularCustomerRate());
		cheapestHotel.setTotalRate(totalCostOfStay);
 		System.out.println("the cheapest hotel among three is " + cheapestHotel);
		return cheapestHotel;
	}



	public static void main(String[] args) {
		System.out.println("Welcome To Hotel Reservation Program");
	}
}
