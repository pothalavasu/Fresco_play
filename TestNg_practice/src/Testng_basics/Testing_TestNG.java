package Testng_basics;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Testing_TestNG {

  private static final boolean enabled = false;

  @Test(groups= {"vasu"})
  public void f() {
	  System.out.println("eat five star do nothing");
  }
  @Test(enabled=true)
  public void f1() {
	  System.out.println("log in thorugh mobile");
  }
  @Test(dependsOnMethods= {"f1"})
	  public void f2() {
		  System.out.println("log in through website");
	  }
  @Test(enabled=true)
  public void f3() {
	  System.out.println("namasthe");
  }
 
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
