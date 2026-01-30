package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_page {
private static WebDriver driver;
private final static String url="https://www.saucedemo.com/";

private static By userField = By.id("user-name");
private static By passwordField = By.id("password");
private static By loginButton = By.id("login-button");
private static By errorMessage = By.cssSelector("h3[data-test='error']");

public String getErrorMessage() {
	return driver.findElement(errorMessage).getText();
}

public Login_page(WebDriver driver){
	this.driver=driver;
}

public static void navigateTo() {
	if(!driver.getCurrentUrl().equals(url)) {
		driver.get(url);
	}
}
	
	public static void login(String username, String password) {
		driver.findElement(userField).sendKeys(username);
		driver.findElement(passwordField).sendKeys(password);
		driver.findElement(loginButton).click();
		
	}
}


