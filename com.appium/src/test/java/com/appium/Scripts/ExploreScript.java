package com.appium.Scripts;

import org.testng.annotations.Test;

import com.appium.pages.Categories;
import com.appium.pages.Explore;

import Appium.com.appium.BaseTest;

public class ExploreScript extends BaseTest
     {
	@Test
	public void ExploreTest() throws InterruptedException
	{
		Explore EX=new Explore(driver);
	    EX.Explore();
	}

	
}
