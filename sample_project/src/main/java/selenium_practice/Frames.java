package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public static void main(String[] args) throws InterruptedException{
	System.out.println("oooreee ajamuu lagethaarooooy");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://the-internet.herokuapp.com/nested_frames");
	
	driver.switchTo().frame("frame-bottom");
	WebElement bo= driver.findElement(By.cssSelector("body"));
	
	System.out.println("Bottom frame text: " + bo.getText());
	
	driver.switchTo().parentFrame();
	driver.switchTo().frame("frame-top");
    driver.switchTo().frame(1);
	

   Thread.sleep(2000);
	driver.quit();
}
}
