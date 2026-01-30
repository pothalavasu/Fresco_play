package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_hover {
	public static void main(String[] args) throws InterruptedException{
	System.out.println("hello googlooo");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.google.com");
	
  WebElement gm = driver.findElement(By.linkText("Gmail"));
	
	Actions a = new Actions(driver);
	a.moveToElement(gm).perform();
	
	Thread.sleep(2000);
	driver.quit();
}
}
