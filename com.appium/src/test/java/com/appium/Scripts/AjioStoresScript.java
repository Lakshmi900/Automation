package com.appium.Scripts;

import org.testng.annotations.Test;

import com.appium.pages.AjioBag;
import com.appium.pages.AjioStores;

import Appium.com.appium.BaseTest;

public class AjioStoresScript extends BaseTest
{
	@Test
	public void AjioStoresTest() throws InterruptedException
	{
	   AjioStores SPA = new AjioStores(driver);
	   SPA.Storecheck();

}
}
