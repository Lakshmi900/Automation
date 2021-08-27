package com.appium.Scripts;

import org.testng.annotations.Test;

import com.appium.pages.AjioSearchProduct;

import Appium.com.appium.BaseTest;

public class AjioSearchProductScript extends BaseTest
{
   @Test
   public void AjioSearchProductTest() throws InterruptedException
	{
	   AjioSearchProduct SPA = new AjioSearchProduct(driver);
	   SPA.AjioSearchProduct();
	   
	}
	
	

}
