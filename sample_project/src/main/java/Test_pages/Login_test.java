package Test_pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Pages.Login_page;

public class Login_test {
	

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Login_page Login_page = new Login_page(driver);
		Actions a = new Actions(driver);
		
		Login_page.navigateTo();
		Login_page.login("userStandered" , "secret");
		System.out.println(Login_page.getErrorMessage());
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		
		
		Login_page.navigateTo();
		Login_page.login("standard_user" , "secret_sauce");
		
		
		Thread.sleep(2000);
		driver.quit();
	
	}

}
