package com.AppiumAjioScripts;

import org.testng.annotations.Test;

import com.ajioAppium.pages.Account;
import com.ajioAppium.pages.Wishlist;

import Appium.com.ajioproject.BaseTest;
import io.appium.java_client.android.AndroidDriver;

public class AccountTest extends BaseTest
{
	private AndroidDriver driver;
	@Test
	  public void Accountscript() throws InterruptedException 
	  {
		Account al= new Account(driver);
		al.Accountcheck();

}
}
