package com.appium.Scripts;

import org.testng.annotations.Test;

import com.appium.pages.SearchProduct;

import Appium.com.appium.BaseTest;



	public class SearchProductScript extends BaseTest
	{

		@Test
		public void SearchProductTest() throws InterruptedException
		{
			SearchProduct SP = new SearchProduct(driver);
			SP.SearchProduct();
		}

	}


