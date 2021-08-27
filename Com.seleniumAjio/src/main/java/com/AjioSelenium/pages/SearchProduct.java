package com.AjioSelenium.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchProduct extends CommonPage
{
	public SearchProduct(WebDriver driver) throws IOException {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//div[@id='app']//div[@class='header-right']//div[@class='scb']//form//div[@class='searchbar-view']/div[@class='react-autosuggest__container react-autosuggest__container--open']/input[@type='text']")
	private WebElement Search;
	
	@FindBy(linkText="Shoes")
	private WebElement Shoes;
	
	
	//@FindBy(linkText="ASIAN")
	//@FindBy(linkText="Textured Lace Fastening Sports Shoes")
	
	/*@FindBy(xpath="//div[@id='app']//div[@class='item rilrtl-products-list__item item']//a[@class='rilrtl-products-list__link']//div//div[@class='imgHolder']/img[@src='https://assets.ajio.com/medias/sys_master/root/20210403/xX5W/6068a008aeb269a9e335b3ef/asian_white_textured_lace_fastening_sports_shoes_.jpg']")
	private WebElement sport;
	*/
	//@FindBy(xpath="//*[@id=\"appContainer\"]/div[2]/div/div/div[2]/div/div[3]/div/div[6]/div[3]/div")
	//@FindBy(xpath="//div//div[@class='size-guide-text']")
	
	/*@FindBy(linkText="Check Size Chart")
	private WebElement SizeChart;
	
	@FindBy(xpath="//div[@class='modal fade in size-guide-modal']//td[@class='td-radio selected-row ']/label[@class='custom-radio']/input[@value='7']")
	private WebElement Size;
	
	
	//@FindBy(xpath="//div[@class='btn-gold']/span[@class='ic-pdp-add-cart']")
	@FindBy(linkText="ADD TO BAG")
	private WebElement Added;
	
	@FindBy(xpath="//div//div[@class='pdp-addtocart-button']/a[@class='go-to-cart-btn']/div[@class='btn-cart']")
	private WebElement GotoBag;
	*/
	public void ProductDisplay() throws Throwable
	{
	
		Thread.sleep(2000);
		Search.click();
		
		Thread.sleep(2000);
		Shoes.click();
		
		/*Thread.sleep(2000);
		sport.click();
		*/
		driver.navigate().back();
		/*Thread.sleep(3000);
		SizeChart.click();
		driver.navigate().back();
		Thread.sleep(3000);
		Size.click();
		
		Thread.sleep(3000);
		Added.click();
		
		Thread.sleep(3000);
		GotoBag.click();*/
		
	}
}
