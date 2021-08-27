package com.appium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Appium.com.appium.BasePage;
import io.appium.java_client.android.AndroidDriver;

public class Wishlist extends BasePage
   {

	public Wishlist(AndroidDriver driver) {
		super(driver);
		
	}
	 
		 
		 @FindBy(xpath="//android.widget.ImageView[@content-desc=\"wishlist\"]")
		 WebElement Wishlist;
		 
		 @FindBy(xpath="//android.widget.EditText[@content-desc=\"mobile\"]")
		 WebElement PhoneNum;
		 
		 @FindBy(xpath="//android.view.ViewGroup[@content-desc=\"form-button\"]/android.view.ViewGroup/android.widget.TextView")
		 WebElement Continue;
	
		
		 
		 public void Wishlist() throws InterruptedException
		 {
			Thread.sleep(1000);
			 Wishlist.click();
			 
			 Thread.sleep(3000);
			 PhoneNum.sendKeys("6303524107");
			 
			 Thread.sleep(3000);
			 Continue.click();
			 
			 Thread.sleep(3000);
			 
		/*	 Thread.sleep(2000);
			 Help.click(); */
			 
			 
			 
	 }
	
}
