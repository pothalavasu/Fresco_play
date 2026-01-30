package selenium_practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Implicity_and_explicity {
	public static void main(String[] args) throws InterruptedException{
	System.out.println("hello googlooo");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/dynamic-properties");
//	
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    System.out.println(driver.findElement(By.id("visiableAfter")).getText());
	
	//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
	//wait.until(ExpectedConditions.elementToBeClickable(By.id("visiableAfter")));
	
   driver.findElement(By.id("visiableAfter")).click();
	
	driver.quit();
}
}
