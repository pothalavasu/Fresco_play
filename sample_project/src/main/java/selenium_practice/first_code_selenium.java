package selenium_practice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class first_code_selenium {
	
	public static void main(String[] args) throws InterruptedException{
	System.out.println("hello googlooo");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.gmail.com");
	Thread.sleep(3000);
	String pagetitle= driver.getTitle();
	System.out.println(pagetitle);
	driver.quit();
	
	}
}
