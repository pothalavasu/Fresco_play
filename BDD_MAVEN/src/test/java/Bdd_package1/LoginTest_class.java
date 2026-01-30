package Bdd_package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest_class {
	
	WebDriver driver;
	private static By userField = By.id("user-name");
	private static By passwordField = By.id("password");
	private static By loginButton = By.id("login-button");
@Given("chrome browser is open")
public void chrome_browser_is_open() {
    // Write code here that turns the phrase above into concrete actions
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	
//    throw new io.cucumber.java.PendingException();
}

@Given("user is on login page")
public void user_is_on_login_page() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	driver.navigate().to("https://www.saucedemo.com");
	Thread.sleep(2000);
//    throw new io.cucumber.java.PendingException();
}

@When("user enters vasu and {int}")
public void user_enters_vasu_and(Integer int1) throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(userField).sendKeys("standard_user");
	driver.findElement(passwordField).sendKeys("secret_sauce");
	driver.findElement(loginButton).sendKeys(Keys.ENTER);
	Thread.sleep(2000);
	driver.quit();
//    throw new io.cucumber.java.PendingException();
}

@Then("user is navigated to home page")
public void user_is_navigated_to_home_page() throws InterruptedException {
	driver.findElement(userField).sendKeys("vastrtru");
	driver.findElement(passwordField).sendKeys("1234");
	driver.findElement(loginButton).sendKeys(Keys.ENTER);
	Thread.sleep(2000);
	driver.quit();
    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
}

@When("user enters harika and {int}")
public void user_enters_harika_and(Integer int1) throws InterruptedException {
	driver.findElement(userField).sendKeys("rrr");
	driver.findElement(passwordField).sendKeys("1234");
	driver.findElement(loginButton).sendKeys(Keys.ENTER);
	Thread.sleep(2000);
	driver.quit();
    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
}

@When("user enters kumari and {int}")
public void user_enters_kumari_and(Integer int1) throws InterruptedException {
	driver.findElement(userField).sendKeys("vasurr");
	driver.findElement(passwordField).sendKeys("1234");
	driver.findElement(loginButton).sendKeys(Keys.ENTER);
	Thread.sleep(2000);
	driver.quit();
    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
}
}
