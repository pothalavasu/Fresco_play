package Test_pages;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.Google_search_page;

public class Search_page_test {
	static WebDriver driver;
	

	public static void main(String[] args) throws InterruptedException {
		Search_test();
		Thread.sleep(2000);
		
		driver.quit();

	}
	public static void Search_test(){
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		Google_search_page.Search(driver).click();
		Google_search_page.Search(driver).sendKeys("hello anime" +Keys.ENTER);
	}


}
