package com.appium.Scripts;
import org.testng.annotations.Test;

import Appium.com.appium.BaseTest;
import com.appium.pages.Profile;



public class ProfileScript extends BaseTest {
	@Test
	public void ProfileTest() throws InterruptedException
	{
		Profile PF=new Profile(driver);
	    PF.Profile();
	}

	

}
