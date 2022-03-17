package com.annular.testrunners;
import com.annular.core.TestSuiteInitialization;

@cucumber.api.CucumberOptions(features = "resources/features/", tags = "@dragble", glue = "com.annular", monochrome = true, strict = true , plugin = {
		"pretty","com.epam.reportportal.cucumber.ScenarioReporter", "html:target/surefire-reports/html/dragble", "json:target/surefire-reports/json/dragble.json"})

public class TC_106  extends TestSuiteInitialization {

}