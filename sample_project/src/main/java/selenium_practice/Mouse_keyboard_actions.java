package selenium_practice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_keyboard_actions {
	
	public static void main(String[] args) throws InterruptedException{
	System.out.println("hello googlooo");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.google.com");
	
	WebElement sear = driver.findElement(By.name("q"));
	
	Actions a = new Actions(driver);
	
	a.moveToElement(sear).click();
	a.keyDown(Keys.SHIFT);
	a.sendKeys("demon slayer" + Keys.SPACE + ("anime")).keyUp(Keys.SHIFT).build().perform();
	a.sendKeys(Keys.ENTER);
//	Thread.sleep(1000);
//    driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']")).sendKeys(Keys.ENTER);
	a.contextClick().keyDown(Keys.ARROW_DOWN).build().perform();
	
Thread.sleep(3000);
driver.quit();
	}}