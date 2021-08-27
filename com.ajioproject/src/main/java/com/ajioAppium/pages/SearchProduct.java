package com.ajioAppium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Appium.com.ajioproject.BasePage;
import io.appium.java_client.android.AndroidDriver;

public class SearchProduct extends BasePage
   {
	

	

	public SearchProduct(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}



	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout")
	WebElement Search;
	
	public void SearchProduct() throws InterruptedException
	
	 {
		Search.click();
	 }

}
