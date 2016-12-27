package steps;

import classes.VariablesForSteps;
import cucumber.api.java.en.Given;
import pageObjects.LoginPage;

public class LoginSteps extends VariablesForSteps {
    LoginPage loginPage;

    public void createPageInstance(){
        if (loginPage == null)
            loginPage = new LoginPage(getDriver());
    }

    @Given("^Clicks in signup on the login page$")
    public void clickInSignUp() throws Exception {
        try {
            createPageInstance();
            loginPage.clickOnSignUpButton();
        }catch(Exception ex){
            throw new Exception("Error trying to click in sign up button. " + ex.getMessage());
        }
    }
}