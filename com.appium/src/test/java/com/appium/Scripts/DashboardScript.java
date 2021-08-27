package com.appium.Scripts;

import org.testng.annotations.Test;

import com.appium.pages.Dashboard;
import com.appium.pages.SearchProduct;

import Appium.com.appium.BaseTest;

public class DashboardScript extends BaseTest
{
	@Test
	public void DashboardTest() throws InterruptedException
	{
		Dashboard DT= new Dashboard(driver);
		DT.Dashboard();
	}

	

}
