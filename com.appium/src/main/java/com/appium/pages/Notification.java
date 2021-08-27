package com.appium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Appium.com.appium.BasePage;
import io.appium.java_client.android.AndroidDriver;

public class Notification extends BasePage 
    {
	public Notification(AndroidDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="//android.widget.ImageView[@content-desc=\"notification\"]")
	WebElement Notify;
	
	
	public void Notification() throws InterruptedException
	 {
	       Thread.sleep(3000);
           Notify.click();
           
           Thread.sleep(3000);
	
	 }
}
