package com.booking.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.booking.lib.BasePage;

import io.appium.java_client.android.AndroidDriver;

public class FlightBooking extends BasePage{

	public FlightBooking(AndroidDriver driver) {
		super(driver);
		
	}
   @FindBy(id="com.expedia.bookings:id/button_next")
   WebElement startScrennNext;
   @FindBy(id="com.expedia.bookings:id/button_final")
   WebElement clickLetsGo;
   @FindBy(id="com.android.permissioncontroller:id/permission_allow_always_button")
   WebElement allowPermision;
   @FindBy(id="com.expedia.bookings:id/uds_toolbar_navigation_icon")
   WebElement closeLogin;
   @FindBy(xpath="//android.widget.TextView[@content-desc=\"Flights Button\"]")
   WebElement clickingOnFlight;
   // flight from
   @FindBy(xpath="*//android.widget.TextView[@text='Flying from']")
   WebElement flightFrom;
   @FindBy(xpath="com.expedia.bookings:id/search_src_text")
   WebElement flightFromText;
   
   @FindBy(xpath="com.expedia.bookings:id/title_textview")
   WebElement flightFromTextclick;
  
   
   // Flight To
   @FindBy(xpath="*//android.widget.TextView[@text='Flying to']")
   WebElement flightTo;
   //month next click
   @FindBy(xpath="com.expedia.bookings:id/next_month")
   WebElement monthNextClick;
   
   
   
   
   public void flightbooking() throws InterruptedException
   { Thread.sleep(5000);
	   startScrennNext.click();
	   Thread.sleep(3000);
	   startScrennNext.click();
	   Thread.sleep(3000);
	   clickLetsGo.click();
	   Thread.sleep(3000);
	   allowPermision.click();
	   Thread.sleep(3000);
	   closeLogin.click();
	   Thread.sleep(3000);
	   clickingOnFlight.click();
	   Thread.sleep(3000);
	   flightFrom.click();
	   Thread.sleep(4000);
	   flightFromText.sendKeys("sfo");
	   Thread.sleep(3000);
	   flightFromTextclick.click();
	   Thread.sleep(3000);
	   //flightTo.click();
	   flightFromText.sendKeys("mia");
	   flightFromTextclick.click();
	   Thread.sleep(3000);
	   
	   
   }
   

}
