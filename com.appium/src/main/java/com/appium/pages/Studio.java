package com.appium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Appium.com.appium.BasePage;
import io.appium.java_client.android.AndroidDriver;

public class Studio extends BasePage  
    {

	public Studio(AndroidDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="//android.widget.Button[@content-desc=\"tabButton_studio\"]/android.widget.ImageView")
	WebElement StudioClick;
	
	@FindBy(xpath="//android.widget.ImageView[@content-desc=\"ic_settings\"]")
	//@FindBy(xpath="//android.widget.ImageView[@content-desc=\"ic_settings\"]")
	WebElement Settings;
	
	public void Studio() throws InterruptedException
	 {
		
		StudioClick.click();
		
		Thread.sleep(3000);
		Settings.click();
		
		Thread.sleep(3000);
		
		
	 }

}
