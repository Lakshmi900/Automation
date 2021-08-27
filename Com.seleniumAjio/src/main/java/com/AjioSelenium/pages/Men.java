package com.AjioSelenium.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Men extends CommonPage
{

	public Men(WebDriver driver) throws IOException {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//div[@class='header-right']//div//li[@style='height: 40px;']/a[@title='MEN']")
	private WebElement Mens;
	
	
	public void MenDisplay() throws Throwable
	{
		Mens.click();
		driver.navigate().back();
		
	}

}
