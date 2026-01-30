package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pages_factory {
private static WebDriver driver;
private final static String url="https://www.saucedemo.com/";

@FindBy(id = "user-name")
private static By userField;

@FindBy(id = "password")
private static By passwordField;

@FindBy(id = "login-button")
private static By loginButton;

@FindBy(css = "h3[data-test='error']")
private static By errorMessage;



//private static By userField = By.id("user-name");
//private static By passwordField = By.id("password");
//private static By loginButton = By.id("login-button");
//private static By errorMessage = By.cssSelector("h3[data-test='error']");

public static String getErrorMessage() {
	return driver.findElement(errorMessage).getText();
}

public pages_factory(WebDriver driver){
	this.driver=driver;
	PageFactory.initElements(driver, this);
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


