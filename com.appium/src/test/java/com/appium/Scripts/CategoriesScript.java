package com.appium.Scripts;

import org.testng.annotations.Test;

import com.appium.pages.Categories;


import Appium.com.appium.BaseTest;

public class CategoriesScript extends BaseTest {
	@Test
	public void CategoriesTest() throws InterruptedException
	{
		Categories CG=new Categories(driver);
	    CG.Categories();
	}

	
}
