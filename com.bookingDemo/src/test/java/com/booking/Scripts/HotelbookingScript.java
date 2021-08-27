package com.booking.Scripts;

import org.testng.annotations.Test;

import com.booking.lib.BaseTest;
import com.booking.pages.Hotelbooking;

public class HotelbookingScript extends BaseTest{

	@Test
	public void HotelBookingTest() throws InterruptedException
	{
		Hotelbooking hotel=new Hotelbooking(driver);
		hotel.HotelBooking();
	}
}
