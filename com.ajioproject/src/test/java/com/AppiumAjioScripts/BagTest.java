package com.AppiumAjioScripts;

import org.testng.annotations.Test;

import com.ajioAppium.pages.Bag;
import com.ajioAppium.pages.Stores;

import Appium.com.ajioproject.BaseTest;
import io.appium.java_client.android.AndroidDriver;

public class BagTest extends BaseTest
{
	private AndroidDriver driver;
	@Test
	  public void Bagscripts() throws InterruptedException 
	  {
		Bag bg= new Bag(driver);
		bg.BagCheck();
	  }

}
