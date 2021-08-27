package com.seleniumAjio.library;

import java.time.Duration;
import java.util.ArrayList;
import java.util.NoSuchElementException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

public class WebActionUtil {

	public static WebDriver driver;

	public static JavascriptExecutor jsExecutor;
	public static Actions action;

	public static Object logger;
	
	/* To Enter the Text to the Text filed */

	public static void sendKeys(WebElement element, String elementName,String value)
	   
    {
        element.sendKeys(value);
    }
	 /* this method is using to click the entered test */

 public static void click(WebElement element, String elementName)
   
    {
        element.click();
    }
/** sharath
 * this method is using to clear the entered test
 */
public static void clear(WebElement element, String elementName)

{
    element.clear();
}

/* this method is using to get the entered text */

public static void getText(WebElement element, String elementName)

{
    element.getText();
}


/* navigate to URL   */
public static void navigateToUrl(String url) 
{
	
	
	driver.navigate().to(url);
}


/* Refresh the Page */
public static  void refreshThePage()
{
	driver.navigate().refresh();
	
}


/* navigate To back */
public static void navigateToback() 
{
	
	driver.navigate().back();
}


/* Scroll to the End of the page */
public static void scrollToEndOfThePage() throws Throwable
{

		jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
	}
/* Scroll to the Element */

public static void scrollToElement(WebElement element, String elementName) 
{

		jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
	}
/* Wait in seconds */

public static void sleep(long seconds) throws InterruptedException
{
	
		Thread.sleep(seconds * 1000);
	} 

/* Clear the Text field and Enter the Text to the Text field */
public static void clearAndTypeText(WebElement element, String value, String elementName)
{
	
		element.clear();
		
		element.sendKeys(value);
}

/* Switch To Tab */
public static void switchToTab(int tabindex)
{
	ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(tabs.get(tabindex));
}

/* Wait for The element to Load or to Display */
public static void waitForElement(WebElement element, WebDriver driver, int seconds)
		throws Throwable 
{
	try 
	{
		
		//waitTillPageLoad(driver, 1);
		long timeout = seconds;
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(timeout))
				.pollingEvery(Duration.ofMillis(250)).ignoring(NoSuchElementException.class);
		Assert.assertTrue(wait.until(ExpectedConditions.visibilityOf(element)) != null);			
		
	
		}
	catch (Exception e)
	{
		//MyExtentListener.logger.addScreenCaptureFromPath(capture(driver));
		
		throw e;
	} 
	catch (AssertionError e)
	{
		//MyExtentListener.logger.addScreenCaptureFromPath(capture(driver));
		
		throw e;
	}
	}
	public static  String formatDuration(final long millis) {
	 	   long seconds = (millis / 1000) % 60;
	 	   long minutes = (millis / (1000 * 60)) % 60;
	 	   long hours = millis / (1000 * 60 * 60);

	 	   StringBuilder b = new StringBuilder();
	 	   b.append(hours == 0 ? "00" : hours < 10 ? String.valueOf("0" + hours) :
	 	   String.valueOf(hours));
	 	   b.append(":");
	 	   b.append(minutes == 0 ? "00" : minutes < 10 ? String.valueOf("0" + minutes) :    
	 	   String.valueOf(minutes));
	 	   b.append(":");
	 	   b.append(seconds == 0 ? "00" : seconds < 10 ? String.valueOf("0" + seconds) :
	 	   String.valueOf(seconds));
	 	   return b.toString();
	 	}
}













