package com.annular.testrunners;
import com.annular.core.TestSuiteInitialization;

@cucumber.api.CucumberOptions(features = "resources/features/", tags = "@drag", glue = "com.annular", monochrome = true, strict = true , plugin = {
		"pretty","com.epam.reportportal.cucumber.ScenarioReporter", "html:target/surefire-reports/html/drag", "json:target/surefire-reports/json/drag.json"})

public class TC_105 extends TestSuiteInitialization{

}
