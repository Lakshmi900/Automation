package com.ajioAppium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Appium.com.ajioproject.BasePage;
import io.appium.java_client.android.AndroidDriver;

public class Account extends BasePage {

	public Account(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


   @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[5]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ImageView")
   WebElement Accountlist;
   	
	
	public void Accountcheck() throws InterruptedException
	
	 {
		Accountlist.click();
	 }

}
