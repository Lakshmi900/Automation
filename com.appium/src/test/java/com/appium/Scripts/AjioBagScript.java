package com.appium.Scripts;



import org.testng.annotations.Test;


import com.appium.pages.AjioBag;
import com.appium.pages.AjioSearchProduct;

import Appium.com.appium.BaseTest;
import io.appium.java_client.android.AndroidDriver;


public class AjioBagScript extends BaseTest
{
	
	@Test
	public void AjioSearchProductTest() throws InterruptedException
	{
	   AjioBag SPA = new AjioBag(driver);
	   SPA.BagCheck();
	  }

}
