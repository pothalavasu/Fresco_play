package selenium_practice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_drop {
	
	public static void main(String[] args) throws InterruptedException{
	System.out.println("hello googlooo");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.google.com");
	
	Actions a = new Actions(driver);
	

	WebElement from = driver.findElement(By.xpath("//a[@aria-label='Gmail' or @data-pid='23']"));
	WebElement to = driver.findElement(By.xpath("//textarea[@class='gLFyf' or @aria-controls='Alh6id']"));
	a.dragAndDrop(from, to).sendKeys(Keys.ENTER).build().perform();
	
	Thread.sleep(2000);
	 driver.quit();
	}
}
