package selenium_practice;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_msg_testing {
	
	public static void main(String[] args) throws InterruptedException{
	System.out.println("hello googlooo");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://vinothqaacademy.com/alert-and-popup/");
	
	Thread.sleep(2000);
	
	driver.findElement(By.name("confirmalertbox")).click();
	Thread.sleep(2000);
	
	Alert alert = driver.switchTo().alert();
	Thread.sleep(2000);
   alert.accept();
   
   Thread.sleep(2000);
   
   driver.findElement(By.name("promptalertbox1234")).click();
   Thread.sleep(2000);
   alert.dismiss();
   
    
   Thread.sleep(3000);
   driver.quit();
   
	
	}
}
