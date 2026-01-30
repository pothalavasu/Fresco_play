package TestNg_experiment;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class open_app {  // Keeping the class name the same as your file name.
    WebDriver driver;

    @BeforeMethod
    void openApp() {
        driver = new ChromeDriver(); // Initialize driver here
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        System.out.println("Open the application.");
    }

    @Test(priority = 1)
    void logo() {
        // Replace Thread.sleep with implicit wait, which was already set above
        boolean status = driver.findElement(By.xpath("//img[@src='/web/images/ohrm_branding.png?v=1763650546848']")).isDisplayed();
        System.out.println("Logo displayed: " + status);
    }

    @Test(priority = 2)
    void login() {
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.className("oxd-button oxd-button--medium oxd-button--main orangehrm-login-button")).click();
        System.out.println("Login attempt completed.");
    }

    @Test(priority = 3)
    void closeApp() throws InterruptedException {
        System.out.println("Logging out.");
        Thread.sleep(2000);  // This is fine for waiting 2 seconds
        driver.quit();
    }
}
