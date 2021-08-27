package com.AjioSelenium.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CommonPage {

	public static WebDriver driver;
	
	public String URL="www.ajio.com";
	public CommonPage(WebDriver driver) throws IOException 
	{
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver,this);
				
		
	}	
}
