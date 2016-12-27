package features;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(strict = false, format = {"pretty", "html:target/site/cucumber-pretty",
        "json:target/cucumber.json"}
                    ,glue = {"steps"})
public class RegressionTests extends AbstractTestNGCucumberTests{ }