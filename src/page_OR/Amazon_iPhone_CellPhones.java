package page_OR;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Amazon_iPhone_CellPhones {
private static WebElement element = null;
	
	public static WebElement starIcon(WebDriver driver){
		element = driver.findElement(By.xpath("//*[@id='result_0']/div/div[6]/span/span/a/i[1]"));
		return element;		
	}
	
	public static WebElement ratingText(WebDriver driver){
		element = driver.findElement(By.xpath("//*[@id='a-popover-content-1']/div/div/div/div[1]/span"));
		return element;		
	}
	

}
