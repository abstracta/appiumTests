package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
/**
 * Created by USER on 19-Dec-16.
 */
public class LoginPage extends AbstractPageObject{
    @FindBy(id = "com.wendydigital:id/tvSignUp") private WebElement signupElement;

    public LoginPage(WebDriver driver){
        super(driver);
    }

    public void clickOnSignUpButton() throws Exception {
        try {
            signupElement.click();
            System.out.println("SignUp button clicked");
        }catch(Exception ex){
            throw new Exception("There is an error clicking on signup button. Error : " + ex.getMessage());
        }
    }
}
