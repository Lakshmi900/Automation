package com.booking.Scripts;

import org.testng.annotations.Test;

import com.booking.lib.BaseTest;
import com.booking.pages.Taxibooking;

public class TaxibookingScript extends BaseTest{

	@Test
	public void TaxiBookingTest() throws InterruptedException
	{
		Taxibooking taxibooking=new Taxibooking(driver);
		taxibooking.Taxi();
		
	}
}
