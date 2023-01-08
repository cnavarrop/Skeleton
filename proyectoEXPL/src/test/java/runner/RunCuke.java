package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = ".\\src\\test\\resources\\features", glue = {
        "steps" }, monochrome = true, tags = "@Test", plugin = { "html:target/cucumber-reports/report.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" })


public class RunCuke extends AbstractTestNGCucumberTests{

}
