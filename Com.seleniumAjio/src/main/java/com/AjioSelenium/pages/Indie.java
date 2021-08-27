package com.AjioSelenium.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Indie extends CommonPage
{

	public Indie(WebDriver driver) throws IOException {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//div[@class='header-right']//div//li[@style='height: 40px;']/a[@title='INDIE']")
	private WebElement Indies;
	
	
	public void IndieDisplay() throws Throwable
	{
		Indies.click();
		driver.navigate().back();
		
	}


}
