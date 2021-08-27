package com.booking.pages;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.FindBy;

import com.booking.lib.BasePage;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.ElementOption;

public class Taxibooking extends BasePage{

	public Taxibooking(AndroidDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="//android.widget.HorizontalScrollView//android.widget.TextView[@text='Taxi']")
	
	WebElement taxiHeader;
	
   @FindBy(id="com.booking:id/from_location")
	
	WebElement pickUpLocation;
   
   @FindBy(id="com.booking:id/suggestion_title_textview")
	
	WebElement selectDrop;
   
   
   
   @FindBy(id="com.booking:id/to_location")
	
	WebElement dropLocation;
   
   @FindBy(id="com.booking:id/arrival_date")
	
	WebElement selectdate;
   
   
   @FindBy(id="com.booking:id/next_date")
	
	WebElement selectNextdate;
   
   @FindBy(id="com.booking:id/confirm_button")
	
	WebElement confirmDate;
   
   @FindBy(id="com.booking:id/search_taxis_button")
	
	WebElement serchTaxi;
   
   @FindBy(id="com.booking:id/select_button")
	
	WebElement bookStandard;
   
   // clicking on flight number to add
   @FindBy(id="com.booking:id/enter_flight_no_button")
   WebElement clickEnterFlightNumer;
   // typing flight details
   @FindBy(className="android.widget.RelativeLayout")
   WebElement typeFlightdetails;
   
   // clicking on find flights
   @FindBy(className="com.booking:id/search_button")
   WebElement clickFinfFkights;
   
	// clicking on flight adding details
   @FindBy(className="com.booking:id/view")
   WebElement addFlight;
   
   
   
   @FindBy(id="com.booking:id/banner_free_cancellation")
	
	WebElement freeCancelation;
   
   @FindBy(id="com.booking:id/passenger_first_name")
	
	WebElement firstName;
   @FindBy(id="com.booking:id/passenger_last_name")
	
	WebElement lastName;
   
   @FindBy(id="com.booking:id/passenger_email_address")
	
  	WebElement emailAddress;
   @FindBy(id="com.booking:id/national_phone_number_text_input")
	
 	WebElement phoneNumber;
   @FindBy(className="android.widget.EditText")
	
	WebElement sample;
   @FindBy(xpath="*//android.widget.EditText[@text='Last name']")
	
  	WebElement sample1;
   @FindBy(xpath="*//android.widget.EditText[@text='Email']")
	
 	WebElement sample2;
   @FindBy(xpath="*//android.widget.EditText[@text='Cell number']")
	
	WebElement sample3;
   
   @FindBy(id="com.booking:id/book_taxi")
	
	WebElement clickContinue;
   
  
   
  // com.booking:id/enter_flight_no_button DL2234
  // AA1151
  // AA190
	public void Taxi() throws InterruptedException
	{
		taxiHeader.click();
		Thread.sleep(2000);
		pickUpLocation.click();
		Thread.sleep(2000);
		pickUpLocation.sendKeys("Miami Beach");
		//pickUpLocation.sendKeys("Miami International Airport");
		selectDrop.click();
		Thread.sleep(2000);
	  dropLocation.sendKeys("Sheraton Miami Airport Hotel");
	  selectDrop.click();
	  
	//driver.hideKeyboard();
		Thread.sleep(3000);
		selectdate.click();
		Thread.sleep(3000);
		selectNextdate.click();
		selectNextdate.click();
		confirmDate.click();
		Thread.sleep(2000);
		serchTaxi.click();
		Thread.sleep(3000);
		bookStandard.click();
		/*Thread.sleep(3000);
		clickEnterFlightNumer.click();
		Thread.sleep(3000);
		typeFlightdetails.click();
		typeFlightdetails.sendKeys("AA1151");
		Thread.sleep(3000);
		clickFinfFkights.click();
		Thread.sleep(3000);
		addFlight.click();
		Thread.sleep(3000);*/
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);
		TouchAction ta= new TouchAction(driver);
		
		//driver.findElementByAndroidUIAutomator(new UiScrollable(new UiSelector().))
		
		/* MobileElement element = (MobileElement) driver.findElementByAndroidUIAutomator(
                 "new UiScrollable(new UiSelector().class(\"android.widget.ImageView\")).getChildByText("
                 + "new UiSelector().resourceId(\"com.spotify.music:id/title\"), \"UnderCover\")");	
		
		// new UiScrollable(new UiSelector().className("android.widget.ImageView"));
		
		
	/*	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()."
				+ "resourceId(\"com.booking:id/driver_comments_button\"))"
				+ ".scrollIntoView(new UiSelector().text(\"Leave a note for your driver\"))");*/
	//	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollIntoView(new UiSelector().text(\"Leave a note for your driver\"))");
		
		
		int x = size.width / 2;
		int starty = (int) (size.height * 0.5);
		int endy = (int) (size.height * 0.1);
		
		ta.press(ElementOption.point(x,starty)).moveTo(ElementOption.point(x,endy)).release().perform();
		ta.press(ElementOption.point(x,starty)).moveTo(ElementOption.point(x,endy)).release().perform();
		
		ta.press(ElementOption.point(x,starty)).moveTo(ElementOption.point(x,endy)).release().perform();
		firstName.click();
		sample.sendKeys("smith");
		driver.hideKeyboard();
		lastName.click();
		sample1.sendKeys("Robert");
		driver.hideKeyboard();
		emailAddress.click();
		sample2.sendKeys("abc@abc.com");
		driver.hideKeyboard();
		phoneNumber.click();
		sample3.sendKeys("7569701284");
		driver.hideKeyboard();
		clickContinue.click();
		Thread.sleep(3000);
		//driver.swipe(x, starty, x, endy);
		
		
		
		
		
	/*	MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
		        "new UiScrollable(new UiSelector().resourceId(\"com.booking:id/free_cancellation_banner_title\")).getChildByText("
		        + "new UiSelector().className(\"android.widget.LinearLayout\"))"));
		
		
		
		/*MobileElement element1 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
		        "new UiScrollable(new UiSelector().resourceId(\"com.booking:id/title\")).getChildByText("
		        + "new UiSelector().className(\"android.widget.TextView\"), \"Standard\")"));*/
		
		/*MobileElement element2 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
		        "new UiScrollable(new UiSelector().Id(\"com.booking:id/driver_comments_button\")).getChildByText("
		        + "new UiSelector().className(\"android.widget.TextView\"), \"Leave a note for your driver\")"));
	/*	TouchActions action = new TouchActions(driver);
	action.scroll(freeCancelation, 10, 100);
	action.perform();*/
		
		
		
	}
}
