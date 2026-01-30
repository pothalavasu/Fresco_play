package Test_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class New_tab {
public static void main (String[] args) throws InterruptedException {
	WebDriver driver;
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.google.com");
	Thread.sleep(2000);
	String newTab = driver.getWindowHandle();
	
	
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("http://www.youtube.com");
	
	System.out.println(newTab + "\n"+ driver.getWindowHandles().size());
	driver.close();
	driver.quit();
}
}
