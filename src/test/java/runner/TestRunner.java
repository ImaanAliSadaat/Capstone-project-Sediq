package runner;
 
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import utilities.capstoneReporting;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "classpath:features",
glue = "stepDefinitions",
tags = "@LaptopsAndNotebooks",
dryRun = false,
monochrome = true,
plugin = {
		"pretty",
		"html:target/site/cucumber-pretty",
		"json:target/cucumber.json"
}

)
public class TestRunner {
	@AfterClass
	public static void generateReport() {
		capstoneReporting.reportConfig();
	}

}
