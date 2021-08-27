package com.seleniumAjioTests;

import org.testng.annotations.Test;

import com.AjioSelenium.pages.Browser;
import com.AjioSelenium.pages.Indie;
import com.AjioSelenium.pages.NewArrivals;

public class IndiesTest extends Browser 
{
	@Test
	public void indietest() throws Throwable
	{
		Indie II = new Indie(driver);
		II.IndieDisplay();
	} 

}
