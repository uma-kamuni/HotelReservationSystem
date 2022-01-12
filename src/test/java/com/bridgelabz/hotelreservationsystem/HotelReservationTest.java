package com.bridgelabz.hotelreservationsystem;

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
}
