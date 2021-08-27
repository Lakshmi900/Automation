package com.AppiumAjioScripts;

import org.testng.annotations.Test;

import com.ajioAppium.pages.SearchProduct;

import Appium.com.ajioproject.BaseTest;
import io.appium.java_client.android.AndroidDriver;




public class SearchProductTest extends BaseTest
     {
	  

	private AndroidDriver driver;

	@Test
	  public void SearchProductScript() throws InterruptedException
	   {
		
		SearchProduct Sp = new SearchProduct(driver);
		Sp.SearchProduct();
	    }

}
