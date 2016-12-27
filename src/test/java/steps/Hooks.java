package steps;

import classes.VariablesForSteps;
import cucumber.api.java.After;

/**
 * Created by USER on 21-Dec-16.
 */
public class Hooks extends VariablesForSteps{

    @After
    public void closeDriver()
    {
        getDriver().quit();
    }
}
