package com.seleniumAjioTests;

import org.testng.annotations.Test;

import com.AjioSelenium.pages.Browser;
import com.AjioSelenium.pages.HomeAndKitchen;
import com.AjioSelenium.pages.SearchProduct;

public class HomeandKitchenTest extends Browser
{
	@Test
	public void kitchentest() throws Throwable
	{
		HomeAndKitchen HK = new HomeAndKitchen(driver);
		HK.kitchenDisplay();
	}

}
