package com.booking.Scripts;

import org.testng.annotations.Test;

import com.booking.lib.BaseTest;
import com.booking.pages.FlightBooking;

public class FlightBookingScript extends BaseTest{
	@Test
	public void FlightBookingTest() throws InterruptedException
	{
		FlightBooking fb=new FlightBooking(driver);
		fb.flightbooking();
	}

}
