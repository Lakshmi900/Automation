package com.appium.Scripts;

import org.testng.annotations.Test;

import com.appium.pages.AjioAccount;
import com.appium.pages.AjioKids;

import Appium.com.appium.BaseTest;

public class AjioKidsScript extends BaseTest 
{
	@Test
	public void AjioKidsTest() throws InterruptedException
	{
	   AjioKids AK = new AjioKids(driver);
	   AK.KidsCheck();
}
}
