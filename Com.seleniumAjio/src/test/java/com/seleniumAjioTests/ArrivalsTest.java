package com.seleniumAjioTests;

import org.testng.annotations.Test;

import com.AjioSelenium.pages.Browser;
import com.AjioSelenium.pages.Men;
import com.AjioSelenium.pages.NewArrivals;

public class ArrivalsTest extends Browser 
{
	@Test
	public void arrivaltest() throws Throwable
	{
		NewArrivals NA = new NewArrivals(driver);
		NA.ArrivalDisplay();
	}

}
