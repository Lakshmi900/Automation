package com.appium.Scripts;

import org.testng.annotations.Test;

import com.appium.pages.AjioAccount;

import Appium.com.appium.BaseTest;

public class AjioAccountScript extends BaseTest
{
	@Test
	public void AjioAccountTest() throws InterruptedException
	{
	   AjioAccount AAS = new AjioAccount(driver);
	   AAS.Accountcheck();
		
}
}