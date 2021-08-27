package com.AjioSelenium.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class SignupPage extends CommonPage {

	//private static final String WebActionUtil = null;


	public SignupPage(WebDriver driver) throws IOException {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//div[@id='app']//header//div[@class='header-right']/div[@class='scb']//div[@class='popup-blk wishlist-blk']//div[@style='color: rgb(255, 255, 255); background-color: rgb(44, 65, 82);']")
//	@FindBy(xpath="//div[@id='app']//div[@class='scb']/div[@class='popup-blk wishlist-blk']/div[@class='ic-wishlist']")
	private WebElement Signup;
 
	 @FindBy(xpath="//div[@id='app']//div//label/input[@type='text']")
	 private WebElement Phno;
	
	 @FindBy(xpath="//div[@id='app']//div[@class='modal-login-container']//div/div//input[@data-ga-event-label='Continue button click - ']")
	 private WebElement Continue;
	 
	 /*@FindBy(xpath="//div[@id='app']//div//form//div//label//input[@value='Female']")
	 private WebElement Gender;
	 */
	 @FindBy(xpath="//div[@id='app']//div//form//div//input[@name='user-name']")
	 private WebElement Name;
	 
	 @FindBy(xpath="//div[@id='app']//div//form//div//input[@type='email']")
	 private WebElement Email;
	 
	 @FindBy(xpath="//div[@id='app']//div//form//div//input[@type='password']")
	 private WebElement Password;
	 
	 /*@FindBy(xpath="//div[@id='app']//div//form//div//input[@name='inviteCode']")
	 private WebElement Invitecode;
	 */
	 /*@FindBy(xpath="//div[@id='app']//div//form//div//input[@type='checkbox']")
	 private WebElement checkbox;*/
	 
	 @FindBy(xpath="//div[@id='app']//div//form//div//input[@type='submit']")
	 private WebElement sendotp;
	 
	public void SignupDisplay() throws Throwable
	{
		com.seleniumAjio.library.WebActionUtil.waitForElement(Signup, driver, 30);
		Signup.click();
		Thread.sleep(3000);
		
		com.seleniumAjio.library.WebActionUtil.waitForElement(Phno, driver, 30);
		Phno.sendKeys("6303524107");
		Thread.sleep(3000);
		
		com.seleniumAjio.library.WebActionUtil.waitForElement(Continue, driver, 30);
		Continue.click();
		Thread.sleep(2000);
		
		/*com.seleniumAjio.library.WebActionUtil.waitForElement(Gender, driver, 30);
		Gender.click();
		Thread.sleep(2000);*/
		
		com.seleniumAjio.library.WebActionUtil.waitForElement(Name, driver, 30);
		Name.sendKeys("Lakshmi");
		Thread.sleep(2000);
		
		com.seleniumAjio.library.WebActionUtil.waitForElement(Email, driver, 30);
		Email.sendKeys("lakkigudapa@gmail.com");
		Thread.sleep(3000);
	
		com.seleniumAjio.library.WebActionUtil.waitForElement(Password, driver, 30);
		Password.sendKeys("lakshmi68");
		Thread.sleep(3000);
		
		/*com.seleniumAjio.library.WebActionUtil.waitForElement(Invitecode, driver, 30);
		Invitecode.click();
		Thread.sleep(3000);*/
		
		/*com.seleniumAjio.library.WebActionUtil.waitForElement(checkbox, driver, 30);
		checkbox.click();
		Thread.sleep(3000);*/
		
		com.seleniumAjio.library.WebActionUtil.waitForElement(sendotp, driver, 30);
		sendotp.click();
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		
		
	}

}
