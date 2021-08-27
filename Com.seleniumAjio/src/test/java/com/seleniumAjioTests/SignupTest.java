package com.seleniumAjioTests;

import org.testng.annotations.Test;

import com.AjioSelenium.pages.Browser;
import com.AjioSelenium.pages.SignupPage;



public class SignupTest extends Browser
{
	@Test
	public void searchtest() throws Throwable
	{
		SignupPage SP = new SignupPage(driver);
		SP.SignupDisplay();
	}
		
	

}
