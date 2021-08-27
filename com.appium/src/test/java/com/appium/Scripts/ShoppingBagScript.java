package com.appium.Scripts;

import org.testng.annotations.Test;


import com.appium.pages.ShoppingBag;

import Appium.com.appium.BaseTest;

public class ShoppingBagScript extends BaseTest
    {

	@Test
	public void ShoppingBagTest() throws InterruptedException
	{
		ShoppingBag SB = new ShoppingBag(driver);
		SB.ShoppingBag();
	}

}
