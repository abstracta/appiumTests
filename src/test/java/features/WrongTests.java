package features;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;

@CucumberOptions(strict = false, format = {"pretty", "html:target/site/cucumber-pretty",
        "json:target/cucumber.json"}
                    ,glue = {"steps"}
                    ,tags = {"@wrongSignUp"})
public class WrongTests extends AbstractTestNGCucumberTests{ }