package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by USER on 19-Dec-16.
 */
public abstract class AbstractPageObject {
    protected final AppiumDriver driver;

    public AbstractPageObject(AppiumDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void waitProgressBar()
    {
        new WebDriverWait(driver, 30).until(ExpectedConditions.invisibilityOfElementLocated(By.id("com.wendydigital:id/progressView")));
    }

}
