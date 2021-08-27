package com.booking.lib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeSuite;



import io.appium.java_client.android.AndroidDriver;

public class BaseTest {
	public static Properties prop;
	public AndroidDriver driver;
	public static DesiredCapabilities cap;	
	@BeforeSuite()
	public void LaunchApp() throws MalformedURLException
	{
		try {
			prop=new Properties();
			FileInputStream fis=new FileInputStream(GenericLib.configPath);
			prop.load(fis);
			
		}catch(FileNotFoundException e)
		{
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cap=new DesiredCapabilities();
		cap.setCapability(prop.getProperty("devicename"), prop.getProperty("devicenamevalue"));
		cap.setCapability(prop.getProperty("platformVersion"), prop.getProperty("platformVersionvalue"));
		cap.setCapability(prop.getProperty("platformName"), prop.getProperty("platformNamevalue"));
		cap.setCapability(prop.getProperty("automationName"), prop.getProperty("automationNamevalue"));
		cap.setCapability(prop.getProperty("appPackage"),prop.getProperty("appPackagevalue"));
		cap.setCapability(prop.getProperty("appActivity"),prop.getProperty("cappActivityvalue"));
		driver=new AndroidDriver(new URL(prop.getProperty("url")), cap);
		
		/*
		 * Driver Actions
		 * 1. Tap 
		 * 
		 * TouchAction action =new TouchAction(driver);
		 * action.tap(element).perform();
		 * action.tap(int fingure, WebElement element,int duration);
		 * sction.tap(1,element,10)
		 * 
		 * 2. Running app in background
		 * driver.runAppInTheBackground(20);
		 * 
		 * 3. hiding the keyboard
		 * 
		 * driver.hideKeyboard();
		 * 
		 * 4. driver.setConnection(connection.AIRPLANE)
		 * 
		 * 5.opening notification
		 * 
		 * driver.openNotification();
		 * 
		 * 6. Drag and Drop
		 * 
		 * WebElement source=driver.findElemt....
		 * WenElement destination=drvier.fins......
		 * 
		 * action.longPress(ElementOption.element(source).moveTo(ElementOption.element(destination)).release().perform();
		 * 
		 *7. orinetation
		 *
		 *driver.rotate(ScrennOrientation.LANDSCAPE)
		 *
		 *8. swipe
		 *
		 *Dimmensions dim=driver.manage().window().getSize();
		 *int heihgt=dim.height;
		 *int width= dim.width;
		 *
		 *int startinx= width/2
		 *
		 *int starty=(int)(heihgt*0.80);
		 *
		 *int end x= width/2;
		 *
		 *int end y=(int)(heihgt*0.20);
		 *driver.swipe(startinx,starty,end x,end y);
		 *
		 *
		 *how to scroll perticular element
		 *
		 *driver.findElementByAndroidUIAutomator("newUiScrollable(newUiSelector()"
			+ ".scrollable(true).scrollIntoview("
			+ "newUiSelector().text(\"Room Selected at Check In\"))");
		 *
		 *
		 *how to set all alerts to true
		 *
		 *
		 *cap.setCapability(MobilecapabilityType.autoAcceptAlert,"True")
		 *
		 *
		 *
		 *
		 *
		 *
		 */
	}

}
