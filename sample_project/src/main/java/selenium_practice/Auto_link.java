package selenium_practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_link {
	
	public static void main(String[] args) throws InterruptedException{
	System.out.println("hello googlooo");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.google.com");
	Thread.sleep(3000);
	
//	driver.findElement(By.xpath("//a[test()='Gmail']")).click();
	driver.findElement(By.linkText("Gmail")).click();
	driver.findElement(By.xpath("//a[@class='gb_Z' and @aria-label='Gmail']")).click();
	
//	driver.quit();
	
	}
}
