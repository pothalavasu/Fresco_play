package selenium_practice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Navigation_commands {
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("namasthe guru");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		
		Thread.sleep(2000);
		
		driver.navigate().to("http://www.firefox.com");
		
//		Actions a = new Actions(driver);
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
