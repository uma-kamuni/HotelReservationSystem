package com.bridgelabz.hotelreservationsystem;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

public class HotelReservationTest {
	@Test
	public void toAddHotelHotel_Should_returnTrue() {
		HotelReservationSystem hotelReservationSystem = new HotelReservationSystem();
		Hotel hotelCheck = new Hotel("Bridgewood", 160);
		Hotel hotelCheck1 = new Hotel("Lakewood", 110);
		Hotel hotelCheck2 = new Hotel("Ridgewood", 220);
		try {
			boolean checkIfAdded = hotelReservationSystem.addHotel(hotelCheck);
			Assert.assertEquals(checkIfAdded, true);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	 @Test
	    public void testForcheapestHotelWithinADateRange() {
	        HotelReservationSystem service = new HotelReservationSystem();
	        Hotel hotel1 = new Hotel("Lakewood", 110);
	        Hotel hotel2 = new Hotel("Bridgewood", 150);
	        Hotel hotel3 = new Hotel("Ridgewood", 220);
	        service.addHotel(hotel1);
	        service.addHotel(hotel2);
	        service.addHotel(hotel3);
	        Date start = null;
	        Date end = null;
	        try {
	            start = (Date) new SimpleDateFormat("ddMMMyyyy").parse("10Sep2020");
	            end = (Date) new SimpleDateFormat("ddMMMyyyy").parse("11Sep2020");
	            Hotel hotel = service.findCheapestHotel(start, end);
	            Assert.assertEquals("Lakewood", hotel.getHotelName());
	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }
	    }

	}
