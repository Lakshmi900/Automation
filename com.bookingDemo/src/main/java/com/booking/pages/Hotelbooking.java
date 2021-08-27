package com.booking.pages;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.collections.Lists;

import com.booking.lib.BasePage;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.ElementOption;

public class Hotelbooking extends BasePage {

	public Hotelbooking(AndroidDriver driver) {
		super(driver);
		
	}
@FindBy(id="com.booking:id/search_details_text")
	
	WebElement destinationDetailsClick;
@FindBy(id="com.booking:id/disambiguation_search_edittext")

WebElement TypedestinationDetails;
@FindBy(id="com.booking:id/disam_list_region")

WebElement selectDestination;

@FindBy(xpath="//android.view.View[@content-desc='19 February  2021]")

WebElement selectDate1;
@FindBy(xpath="//android.view.View[@content-desc='20 March 2021']")

WebElement selectDate2;

@FindBy(id="com.booking:id/calendar_confirm")

WebElement selectDatesConfirm;

@FindBy(id="com.booking:id/search_search")

WebElement serchavailability;

@FindBy(id="com.booking:id/sr_hotel_card_hotel_image")

WebElement selectHotel;

@FindBy(id="com.booking:id/hotel_action_select")

WebElement seeYourPtions;

@FindBy(id="com.booking:id/rooms_item_select_text_view")

WebElement selectHotel1;

@FindBy(id="com.booking:id/listitem_info_icon")

WebElement infoClick;

@FindBy(id="com.booking:id/action_button")

WebElement clickReseve;

public void HotelBooking() throws InterruptedException
{
	destinationDetailsClick.click();
	Thread.sleep(2000);
	//TypedestinationDetails.sendKeys("Kimpton EPIC Hotel");
	TypedestinationDetails.sendKeys("EASTMiami");
	selectDestination.click();
	Thread.sleep(2000);
	
	
//	WebElement fromElement=driver.findElement(By.xpath("//android.view.View[@content-desc=\"12 February 2021\"]"));
///	WebElement toElement= driver.findElement(By.xpath("//android.view.View[@content-desc=\"20 March 2021\"]"));
	TouchAction tAction=new TouchAction(driver);
	tAction.press(ElementOption.point(1080,2016)).moveTo(ElementOption.point(1080,50000));
//	tAction.press(ElementOption.element(fromElement)).moveTo(ElementOption.element(toElement)).release().perform();
	/*Dimension windowSize = driver.manage().window().getSize();
	Map<String, Object> args = new HashMap<>();
	args.put("command", "input");
	args.put("args", Lists.newArrayList("swipe", windowSize.width / 2,
	        windowSize.height / 2, windowSize.width / 2, windowSize.height));
	while (driver.findElements(By.xpath("@content-desc=\\\"19 March 2021\\\"]")).size() == 0) {
	    driver.executeScript("mobile: shell", args);
	}
	driver.findElement(By.xpath("@content-desc=\\\"19 March 2021\\\"]")).click();
	
	
	
	
	
	//selectDate1.click();
	//selectDate2.click();*/
	selectDatesConfirm.click();
	Thread.sleep(2000);
	serchavailability.click();
	Thread.sleep(2000);
	selectHotel.click();
	Thread.sleep(2000);
	seeYourPtions.click();
	Thread.sleep(2000);
	
	//Thread.sleep(10000);
	
	
	
	/*driver.findElementByAndroidUIAutomator("newUiScrollable(newUiSelector()"
			+ ".scrollable(true).scrollIntoview("
			+ "newUiSelector().text(\"Room Selected at Check In\"))");
	
	
/*	MobileElement element2 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
    "new UiScrollable(new UiSelector().Id(\"com.booking:id/rooms_item_title\")).getChildByText("
    + "new UiSelector().className(\"android.widget.TextView\"), \"Room Selected at Check In\")"));*/

	
/*	Dimension size = driver.manage().window().getSize();
	System.out.println(size);
	TouchAction ta= new TouchAction(driver);
	int x = size.width / 2;
	int starty = (int) (size.height * 0.5);
	int endy = (int) (size.height * 0.1);
	ta.press(ElementOption.point(x,starty)).moveTo(ElementOption.point(x,endy)).release().perform();
	ta.press(ElementOption.point(x,starty)).moveTo(ElementOption.point(x,endy)).release().perform();
	/*	ta.press(ElementOption.point(x,starty)).moveTo(ElementOption.point(x,endy)).release().perform();
	ta.press(ElementOption.point(x,starty)).moveTo(ElementOption.point(x,endy)).release().perform();
	ta.press(ElementOption.point(x,starty)).moveTo(ElementOption.point(x,endy)).release().perform();
	ta.press(ElementOption.point(x,starty)).moveTo(ElementOption.point(x,endy)).release().perform();
	ta.press(ElementOption.point(x,starty)).moveTo(ElementOption.point(x,endy)).release().perform();
	ta.press(ElementOption.point(x,starty)).moveTo(ElementOption.point(x,endy)).release().perform();
	ta.press(ElementOption.point(x,starty)).moveTo(ElementOption.point(x,endy)).release().perform();
	ta.press(ElementOption.point(x,starty)).moveTo(ElementOption.point(x,endy)).release().perform();
	ta.press(ElementOption.point(x,starty)).moveTo(ElementOption.point(x,endy)).release().perform();*/
	Thread.sleep(2000);
	//selectHotel1.click();
	infoClick.click();
	Thread.sleep(2000);
	clickReseve.click();
	Thread.sleep(4000);
	//ta.press(ElementOption.point(x,starty)).moveTo(ElementOption.point(x,endy)).release().perform();
	
/*	try {
	    String scrollableList="com.booking:id/rooms_item_title";
	    String elementClassName="android.widget.TextView";
	    String anyText="Room Selected at Check In";

	    driver.findElement(MobileBy.AndroidUIAutomator(
	                    "new UiScrollable(new UiSelector().resourceId(\"" + scrollableList + "\")).getChildByText("
	                            + "new UiSelector().className(\"" + elementClassName + "\"), \"" + anyText + "\")"));
	 }catch (Exception e){
	            System.out.println("Cannot scroll further");
	}	*/
	
	/*try {
	    String scrollableList="com.booking:id/rl_unit_size_label";
	    String elementClassName="android.widget.TextView";
	    String anyText="Size:";

	    driver.findElement(MobileBy.AndroidUIAutomator(
	                    "new UiScrollable(new UiSelector().resourceId(\"" + scrollableList + "\")).getChildByText("
	                            + "new UiSelector().className(\"" + elementClassName + "\"), \"" + anyText + "\")"));
	 }catch (Exception e){
	            System.out.println("2Cannot scroll further");
	}	*/
	
	
}


}
