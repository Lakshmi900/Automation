package com.AjioSelenium.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Returns extends CommonPage
{

	public Returns(WebDriver driver) throws IOException {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(linkText="Returns")
	private WebElement Returnlist;
	

	public void ReturnDisplay() throws Throwable
	{
		Returnlist.click();
		driver.navigate().back();
		
	}
	

}
