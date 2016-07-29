package Page_flow;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import page_OR.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestAmazon {
	
	//Creating object of WebDriver
	WebDriver driver = new FirefoxDriver();
	//Creating object of Actions class
	Actions action = new Actions(driver);
	//Expected String for Assertion 
	String expectedText = "4.2 out of 5 stars";
	
		@Before
		public void opneURL(){
			//Open Amazon.com
			driver.get("https://www.amazon.com/");
			//Maximize browser window
			driver.manage().window().maximize();
			//Set an implicit wait of 20 Sec
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
	
		@Test
		public void TestAmazoniPhone() throws InterruptedException{
					
			//Send text to searchBox
			Amazon_Home.searchBox(driver).sendKeys("iphone6s");
			
			//Click on search button
			Amazon_Home.searchButton(driver).click();
			
			//Click on cell phone
			Amazon_iPhone.cellPhoneLink(driver).click();
						
			//Perform page down
			JavascriptExecutor js = ((JavascriptExecutor) driver);
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			Thread.sleep(1000);
			
			//perform mouse move action to starIcon		
			action.moveToElement(Amazon_iPhone_CellPhones.starIcon(driver)).perform();
			
			//Read the rating
			String actualText = Amazon_iPhone_CellPhones.ratingText(driver).getText();
			actualText = actualText.trim();
			
			//To compare and Assert
			Assert.assertEquals(actualText, expectedText);

		}
		
		
		@After
		public void closeBrowser(){
			//Closing the browser
			driver.close();
			driver.quit();
		}
}
