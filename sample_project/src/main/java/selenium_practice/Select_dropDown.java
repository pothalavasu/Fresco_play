package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Select_dropDown {
	public static void main(String[] args) throws InterruptedException{
		System.out.println("5mins chat guntta flat");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://stackoverflow.com/questions/4350937/html-select-dropdown-list");
		 
		 Actions a = new Actions(driver);
		 
		 WebElement dropList2 = driver.findElement(By.xpath("//ul[@class = '-list']"));
		 Select sl2 = new Select(dropList2);
		 
		 WebElement dropList1 = driver.findElement(By.id("answer-sort-dropdown-select-menu"));
		 Select sl1 = new Select(dropList1);
		 
		 
		 Thread.sleep(2000);
		 
		 sl1.selectByValue("modifieddesc");
		 Thread.sleep(2000);
		 driver.navigate().back();
		 
		 
	 sl2.selectByVisibleText("About");
	 a.moveToElement(dropList2);
		 Thread.sleep(2000);
		 driver.quit();
		 
		 
		 
	}

}
