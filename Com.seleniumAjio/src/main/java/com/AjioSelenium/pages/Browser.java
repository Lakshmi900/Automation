package com.AjioSelenium.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Browser {

public static WebDriver driver;
	
	
	@BeforeClass
	public void openbrowser() throws InterruptedException, IOException 
	{
		
			System.setProperty("webdrier.chrome.driver","C:\\Users\\Lakshmi\\Downloads\\chromedriver.exe");	
			
			ChromeOptions options = new ChromeOptions();
			
			//ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			
			driver = new ChromeDriver(options);
				
			driver.get("https://www.ajio.com/");
					
		    driver.manage().window().maximize();
		    Thread.sleep(300);
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    Thread.sleep(2000);
		   
	}		
	
			@AfterClass
			public void closebrowser()
			{
			driver.quit();
			}
	
     }




