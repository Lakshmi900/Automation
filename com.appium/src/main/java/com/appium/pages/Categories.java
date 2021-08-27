package com.appium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Appium.com.appium.BasePage;
import io.appium.java_client.android.AndroidDriver;

public class Categories extends BasePage 
{

	public Categories(AndroidDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//android.widget.Button[@content-desc=\"tabButton_categories\"]/android.widget.ImageView")
	 WebElement Category;
	
	
	@FindBy(xpath="//android.widget.TextView[@text='HOME & LIVING']")
	WebElement Home;
	
	@FindBy(xpath="//android.widget.TextView[@text='Explore Home Store']")
	WebElement Store;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")
	WebElement Explore;
	
	/*@FindBy(xpath="//android.widget.TextView[@text='Women']")
	WebElement Women;
	
	@FindBy(xpath="//android.widget.TextView[@text='Trends for Kids']")
	WebElement kids;
	
	@FindBy(xpath="//android.widget.TextView[@text='Trends for Him']")
	WebElement Trends;
	
	
	//@FindBy(xpath="///hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView\r\n" + 
		//	"")
	
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView")
	WebElement Addto;
	*/
	public void Categories() throws InterruptedException
	 {
		Thread.sleep(3000);
	    Category.click();
	    
	    Thread.sleep(3000);
	    Home.click();
	    
	    Thread.sleep(3000);
	    Store.click();
	    
	   
	   Thread.sleep(3000);
	    Explore.click();
	    
	  /*  Thread.sleep(3000);
	    Trends.click();
	    
	    Thread.sleep(3000);
	    Addto.click();
	    */
	    Thread.sleep(3000);
	    
	   
	    
	 }

}
