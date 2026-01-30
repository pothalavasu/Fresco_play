package Testng_basics;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("i can eat now");
  }
  @Test
  public void f1() {
	  System.out.println("i have washed my hands");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Wash your hands first and come in");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("good job");
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.out.println("i am done with playing");
  }
  @AfterTest
  public void AfterTest() {
	  System.out.println("go and eat food");
  }
@BeforeSuite
public void BeforeSuit() {
	System.out.println("B Suite");
}
@AfterSuite
public void AfterSuit() {
	System.out.println("A suite");
}
}

