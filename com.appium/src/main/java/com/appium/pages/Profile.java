package com.appium.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Appium.com.appium.BasePage;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Profile extends BasePage {
	
	public Profile(AndroidDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//android.widget.Button[@content-desc=\"tabButton_profile\"]/android.widget.ImageView")
	WebElement Prof;
	
	@FindBy(xpath="//android.widget.TextView[@text='LOG IN/SIGN UP']")
	WebElement Signup;
	
	@FindBy(xpath="//android.widget.EditText[@content-desc=\"mobile\"]")
	 WebElement PhoneNum;
	 
	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"form-button\"]/android.view.ViewGroup/android.widget.TextView")
	WebElement Continue;
	 
	//@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"password_login\"]")
	//WebElement LoginPassword;
	
	// @FindBy(xpath="//android.view.ViewGroup[@content-desc=\"LOG OUT\"]")
	// WebElement Logout;
	
	/*@FindBy(xpath="//android.widget.TextView[@text='Orders']")
	WebElement orders;
	
	@FindBy(xpath="//android.widget.TextView[@text='Help Center']")
	WebElement Help;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Help Center\"]")
	WebElement Center;
	*/
	
	 public void Profile() throws InterruptedException
	 {
		  
	      Prof.click();
	      
	      
	      Thread.sleep(3000);
	      Signup.click();
	      
	      Thread.sleep(3000);
			PhoneNum.sendKeys("6303524107");
			
			
			//Thread.sleep(3000);
			//LoginPassword.click();
			
			Thread.sleep(3000);
			 Continue.click();
			 
			 //Thread.sleep(3000);
			 //Logout.click();
	     /* Thread.sleep(2000);
	      orders.click();
	      
	     Thread.sleep(3000);
	      driver.navigate().back();
	      
	      Thread.sleep(3000);
	      Help.click();
	      
	      Thread.sleep(3000);
	      Center.click();
	      */
	     
	
	 }
	
	 
}
