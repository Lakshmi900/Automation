package com.seleniumAjioTests;

import org.testng.annotations.Test;

import com.AjioSelenium.pages.Browser;
import com.AjioSelenium.pages.Returns;


public class ReturnTest extends Browser
{
	@Test
	public void returntest() throws Throwable
	{
		Returns RT = new Returns(driver);
		RT.ReturnDisplay();
	}

}
