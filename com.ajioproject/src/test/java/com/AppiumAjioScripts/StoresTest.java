package com.AppiumAjioScripts;

import org.testng.annotations.Test;

import com.ajioAppium.pages.Stores;

import Appium.com.ajioproject.BaseTest;
import io.appium.java_client.android.AndroidDriver;

public class StoresTest extends BaseTest

{

	
	
	private AndroidDriver driver;
	@Test
	  public void storetests() throws InterruptedException 
	  {
		Stores ST = new Stores(driver);
		ST.Storecheck();
	  }
}
