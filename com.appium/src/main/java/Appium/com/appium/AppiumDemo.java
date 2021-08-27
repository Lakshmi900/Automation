package Appium.com.appium;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class AppiumDemo extends BasePage{

	public AppiumDemo(AndroidDriver driver) throws IOException {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	@FindBy(xpath="//android.widget.Button[@content-desc=\"tabButton_profile\"]/android.widget.ImageView")
	 private AndroidElement Profile;

   public  void test() throws InterruptedException, MalformedURLException
	{
	DesiredCapabilities dc= new DesiredCapabilities();
    
   
	dc.setCapability("deviceName","OPPO A5s");
	dc.setCapability("platformVersion","8.1.0");
	dc.setCapability("platformName","android");
	dc.setCapability( "automationName","uiautomator2");
	dc.setCapability("appPackage","com.myntra.android");
	dc.setCapability("appActivity",".SplashActivity");
	
	AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),dc);
	Thread.sleep(10000);
	Profile.click();
	}
  
	/*@FindBy(xpath="//android.widget.ImageView[@content-desc=\"search\"]")
	private AndroidElement Product;
	
	*/
	
	
	/*@FindBy(xpath="//android.widget.Button[@content-desc=\"tabButton_categories\"]")
	private AndroidElement Product;
	*/
	
	
	/*@FindBy(xpath="//android.widget.ImageView[@content-desc=\"search\"]")
	   private AndroidElement Product;
	@FindBy(xpath="//android.widget.ImageView[@content-desc=\"search\"]")
	  private AndroidElement SProduct;
	
	*/
	
	
	
	
	
	
}
