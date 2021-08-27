package com.appium.Scripts;

import org.testng.annotations.Test;

import com.appium.pages.Explore;
import com.appium.pages.Studio;

import Appium.com.appium.BaseTest;

public class StudioScript extends BaseTest 
  {

	@Test
	public void StudioTest() throws InterruptedException
	{
		Studio SD=new Studio(driver);
		SD.Studio();
	}
	

}
