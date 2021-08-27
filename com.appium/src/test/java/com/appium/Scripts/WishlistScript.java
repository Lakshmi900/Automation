package com.appium.Scripts;

import org.testng.annotations.Test;

import com.appium.pages.Categories;
import com.appium.pages.Wishlist;

import Appium.com.appium.BaseTest;



	public class WishlistScript extends BaseTest {
		@Test
		public void WishlistTest() throws InterruptedException
		{
			Wishlist WL = new Wishlist(driver);
			WL.Wishlist();
		}

}
