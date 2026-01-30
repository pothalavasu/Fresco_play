package Test_pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Pages.pages_factory;

public class Page_factory_test {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		pages_factory factory = new pages_factory(driver);
		
		pages_factory.navigateTo();
		pages_factory.login("userStandered" , "secret");
		
		System.out.println(pages_factory.getErrorMessage());
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		
		
		pages_factory.navigateTo();
		pages_factory.login("standard_user" , "secret_sauce");
		
		
		Thread.sleep(2000);
		driver.quit();
	
	}

}
