package page_OR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Amazon_iPhone {
private static WebElement element = null;
	
	public static WebElement cellPhoneLink(WebDriver driver){
		element = driver.findElement(By.xpath("//*[@id='ref_2335753011']/li[3]/a/span[2]"));
		return element;		
	}
}
