package com.AppiumAjioScripts;

import org.testng.annotations.Test;

import com.ajioAppium.pages.Stores;
import com.ajioAppium.pages.Wishlist;

import Appium.com.ajioproject.BaseTest;
import io.appium.java_client.android.AndroidDriver;

public class WishlstTest extends BaseTest
 
{
	private AndroidDriver driver;
	@Test
	  public void wishlistscript() throws InterruptedException 
	  {
		Wishlist wt = new Wishlist(driver);
		wt.WishlistCheck();
	  }
}


