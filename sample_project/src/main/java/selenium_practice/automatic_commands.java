package selenium_practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class automatic_commands {
	
	public static void main(String[] args) throws InterruptedException{
	System.out.println("hello googlooo");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.saucedemo.com");
	
	Thread.sleep(4000);
	
//	WebElement un = 
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
//	WebElement pasw = driver.findElement(By.id("passwoard"));
	
	
   driver.findElement(By.id("password")).sendKeys("secret_sauce");
   driver.findElement(By.id("login-button")).click();
	
   driver.findElement(By.id("react-burger-menu-btn")).click();
   driver.findElement(By.id("about_sidebar_link")).click();
   driver.findElement(By.id("logout_sidebar_link")).click();
    
   Thread.sleep(3000);
   
	
	}
}
