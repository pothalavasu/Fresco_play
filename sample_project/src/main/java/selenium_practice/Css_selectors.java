package selenium_practice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_selectors {
	
	public static void main(String[] args) throws InterruptedException{
	System.out.println("hello googlooo");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.saucedemo.com");
	
	Thread.sleep(4000);
	driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
	driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
	driver.findElement(By.cssSelector("input#login-button")).click();
	
	Thread.sleep(3000);
	driver.quit();
	}
}