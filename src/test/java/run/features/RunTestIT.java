package run.features;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "html: cucumber-html-reports",
		"json: cucumber-html-reports/cucumber.json" }, features = "Features/Access.feature", glue = "cucumber.integration")

public class RunTestIT {

}
