package selenium_practice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class search_code{
	
	public static void main(String[] args) throws InterruptedException{
	System.out.println("hello googlooo");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.google.com");
	
	Thread.sleep(4000);
	
//	driver.findElement(By.name("q")).sendKeys("anime" + Keys.ENTER);
//	 driver.quit();
	}
}
