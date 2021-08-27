package com.seleniumAjioTests;

import org.testng.annotations.Test;

import com.AjioSelenium.pages.Browser;
import com.AjioSelenium.pages.Men;
import com.AjioSelenium.pages.Returns;

public class MenTest extends Browser
{
	@Test
	public void mentest() throws Throwable
	{
		Men MM = new Men(driver);
		MM.MenDisplay();
	}


}
