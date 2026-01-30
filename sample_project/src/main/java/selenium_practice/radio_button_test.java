package selenium_practice;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radio_button_test {
	
	public static void main(String[] args) throws InterruptedException{
	System.out.println("hello googlooo");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demo.guru99.com/test/radio.html");
	Thread.sleep(3000);
	
   List<WebElement> tot_radio = driver.findElement(By.xpath("//input[@type='radio']")).click();
   System.out.print(tot_radio);
   
//   System.out.println( driver.findElement(By.xpath("//input[@type='radio' and value='Option 1']")).isSelected());

//    driver.findElement(By.xpath("//input[@type='radio' and value='Option 1']")).clear();



//	driver.quit();
	
	}
}
