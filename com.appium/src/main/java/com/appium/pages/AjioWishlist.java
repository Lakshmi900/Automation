package com.appium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Appium.com.appium.BasePage;
import io.appium.java_client.android.AndroidDriver;

public class AjioWishlist extends BasePage
{
	public AjioWishlist(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ImageView")
	WebElement Wishlist;
	
	public void WishlistCheck() throws InterruptedException
	
	 {
		Thread.sleep(3000);
		Wishlist.click();
		Thread.sleep(3000);
	 }

}
