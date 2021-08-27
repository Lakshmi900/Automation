package com.seleniumAjioTests;

import org.testng.annotations.Test;

import com.AjioSelenium.pages.Browser;
import com.AjioSelenium.pages.SearchProduct;


public class SearchTest extends Browser
{
	@Test
	public void shoestest() throws Throwable
	{
		SearchProduct SP = new SearchProduct(driver);
		SP.ProductDisplay();
	}

}
