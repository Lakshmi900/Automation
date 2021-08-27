package com.AjioSelenium.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeAndKitchen extends CommonPage
{


	public HomeAndKitchen(WebDriver driver) throws IOException {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//div[@class='header-right']//div//li[@style='height: 40px;']/a[@title='HOME AND KITCHEN']")
	private WebElement Kitchen;
	
	public void kitchenDisplay() throws Throwable
	{
		Kitchen.click();
		driver.navigate().back();
		
	}

}
