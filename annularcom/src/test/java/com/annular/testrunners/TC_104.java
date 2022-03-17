package com.annular.testrunners;
import com.annular.core.TestSuiteInitialization;

@cucumber.api.CucumberOptions(features = "resources/features/", tags = "@alrtval", glue = "com.annular", monochrome = true, strict = true , plugin = {
		"pretty","com.epam.reportportal.cucumber.ScenarioReporter", "html:target/surefire-reports/html/alrtval", "json:target/surefire-reports/json/alrtval.json"})

public class TC_104 extends TestSuiteInitialization{

}
