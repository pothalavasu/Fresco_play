package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Google_search_page {

	private static WebElement element=null;
	public static  WebElement Search(WebDriver driver) {
		element = driver.findElement(By.name("q"));
		return element;	
	}
	

}
