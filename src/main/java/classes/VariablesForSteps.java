package classes;

import org.openqa.selenium.WebDriver;

/**
 * Created by USER on 21-Dec-16.
 */
public class VariablesForSteps {
    static WebDriver driver;
    static Utils utils = new Utils();

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public Utils getUtils() {
        return utils;
    }

    public void setUtils(Utils utils) {
        this.utils = utils;
    }
}