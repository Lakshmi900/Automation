package com.appium.Scripts;

import org.testng.annotations.Test;

import com.appium.pages.AjioStores;
import com.appium.pages.AjioWishlist;

import Appium.com.appium.BaseTest;

public class AjioWishlistScript extends BaseTest
{
	@Test
	public void AjioWishlistTest() throws InterruptedException
	{
	   AjioWishlist AWS = new AjioWishlist(driver);
	   AWS.WishlistCheck();

}
}
