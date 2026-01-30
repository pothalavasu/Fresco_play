package Bdd_package1;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@SuppressWarnings("deprecation")
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/feature"
		,glue= {"stepdefinitions"},monochrome=true,
		plugin= {"pretty","html:target/HtmlReports.html",
				"json:target/JSONReports.xml"}
		 
		)
public class another_method{

}
