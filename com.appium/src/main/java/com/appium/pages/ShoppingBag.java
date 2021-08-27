package com.appium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Appium.com.appium.BasePage;
import io.appium.java_client.android.AndroidDriver;

public class ShoppingBag extends BasePage 
     {

	public ShoppingBag(AndroidDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"bag\"]/android.view.ViewGroup")
	WebElement SBag;
	
	
	 public void ShoppingBag() throws InterruptedException
	 {
	
         Thread.sleep(3000);
         SBag.click();
         
         Thread.sleep(3000);
    
    
    
	 }

}
