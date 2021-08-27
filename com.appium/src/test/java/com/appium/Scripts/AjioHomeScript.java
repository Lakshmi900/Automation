package com.appium.Scripts;

import org.testng.annotations.Test;

import com.appium.pages.AjioAccount;
import com.appium.pages.AjioHome;

import Appium.com.appium.BaseTest;

public class AjioHomeScript extends BaseTest
{
	@Test
	public void AjioHomeTest() throws InterruptedException
	{
	   AjioHome AH = new AjioHome(driver);
	   AH.Homecheck();
}
}
