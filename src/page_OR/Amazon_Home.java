package page_OR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Amazon_Home {
	
private static WebElement element = null;
	
	public static WebElement searchBox(WebDriver driver){
		element = driver.findElement(By.id("twotabsearchtextbox"));
		return element;		
	}
	
	public static WebElement searchButton(WebDriver driver){
		element = driver.findElement(By.xpath("//*[@id='nav-search']/form/div[2]/div/input"));
		return element;		
	}
	
	

}
