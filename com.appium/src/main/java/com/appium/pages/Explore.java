package com.appium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Appium.com.appium.BasePage;
import io.appium.java_client.android.AndroidDriver;

public class Explore extends BasePage
  {
	public Explore(AndroidDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//android.widget.Button[@content-desc=\"tabButton_more\"]/android.widget.ImageView")
	WebElement Explore;		
	
	@FindBy(xpath="*//android.widget.TextView[@text='Myntra Mall']")
	WebElement MyntraMall;
	
	@FindBy(xpath="//android.widget.TextView[@text='Myntra Insider']")
	WebElement Insider;
	
	//@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.widget.Image")
	//WebElement Login;
	
	public void Explore() throws InterruptedException
	 {
		
		Explore.click();
		
		Thread.sleep(2000);
		MyntraMall.click();
		
		Thread.sleep(3000);
		driver.navigate().back();
		
		Thread.sleep(3000);
		Insider.click();
		
		//Thread.sleep(3000);
        //Login.click();
		Thread.sleep(3000);
		
	 }

}
