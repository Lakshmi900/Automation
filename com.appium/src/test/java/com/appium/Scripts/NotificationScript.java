package com.appium.Scripts;

import org.testng.annotations.Test;

import com.appium.pages.Notification;
import com.appium.pages.SearchProduct;

import Appium.com.appium.BaseTest;

public class NotificationScript extends BaseTest
{   
	@Test
	public void NotificationTest() throws InterruptedException
	{
		Notification NC= new Notification(driver);
		NC.Notification();
	}

	

}
