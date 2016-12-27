package steps;

import classes.VariablesForSteps;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pageObjects.SignUpPage;

/**
 * Created by USER on 21-Dec-16.
 */
public class SignUpSteps extends VariablesForSteps {
    SignUpPage signUpPage;

    public void createPageInstance(){
        if (signUpPage == null)
            signUpPage = new SignUpPage(getDriver());
    }

    @When("^Clicks in cancel button on the popup displayed in signup page$")
    public void clickOnCancelButtonPopUp() throws Exception {
        try {
            createPageInstance();
            signUpPage.clickOnCancelInPopUp();
        }catch(Exception ex){
            throw new Exception("There is an error trying to click on cancel button. " + ex.getMessage());
        }
    }

    @When("^Completes the form for signup$")
    public void completeForm() throws Exception {
        try {
            createPageInstance();
            signUpPage.completeForm();
        }catch(Exception ex){
            throw new Exception("There is an error trying to click on cancel button. " + ex.getMessage());
        }
    }

    @When("^Clicks on Create Account button$")
    public void clickOnCreateAccount() throws Exception {
        try {
            createPageInstance();
            signUpPage.clickOnCreateAccountButton();
        }catch(Exception ex){
            throw new Exception("There is an error trying to click on create account button. " + ex.getMessage());
        }
    }

    @When("^Verifies that the message for signup is correct$")
    public void verifiesMessageIsOk() throws Exception {
        try {
            createPageInstance();
            Assert.assertEquals(signUpPage.getRegistrationMessage(), "Before you can login, you must active your account with the code sent to your email address.");
            System.out.println("USER REGISTERED!");
        }catch(Exception ex){
            throw new Exception("There is an error trying to verify if message in signup is correct. " + ex.getMessage());
        }
    }

    @When("^Clicks on OK button in signup page$")
    public void clickOnOkButton() throws Exception {
        try {
            createPageInstance();
            signUpPage.clickOnOkButton();
        }catch(Exception ex){
            throw new Exception("There is an error trying to click on OK button creating the account. " + ex.getMessage());
        }
    }

    @When("^Writes \"([^\"]*)\" on the firstname field$")
    public void completeFirstName(String firstName) throws Exception {
        try {
            createPageInstance();
            signUpPage.completeFirstName(firstName);
        }catch(Exception ex){
            throw new Exception("There is an error trying to write the firstname on the field " + ex.getMessage());
        }
    }

    @When("^Writes \"([^\"]*)\" on the lastname field$")
    public void completeLastName(String lastName) throws Exception {
        try {
            createPageInstance();
            signUpPage.completeLastName(lastName);
        }catch(Exception ex){
            throw new Exception("There is an error trying to write the lastname on the field " + ex.getMessage());
        }
    }

    @When("^Writes a (.*) on the email field$")
    public void completeEmail(Boolean valid) throws Exception {
        try {
            createPageInstance();
            signUpPage.completeEmail(valid);
        }catch(Exception ex){
            throw new Exception("There is an error trying to write the email on the field " + ex.getMessage());
        }
    }

    @When("^Writes (.*) on the phone number field$")
    public void completePhoneNumber(String phoneNumber) throws Exception {
        try {
            createPageInstance();
            signUpPage.completePhoneNumber(phoneNumber);
        }catch(Exception ex){
            throw new Exception("There is an error trying to write the phonenumber on the field " + ex.getMessage());
        }
    }

    @When("^Writes (.*) on the password field$")
    public void completePassword(String password) throws Exception {
        try {
            createPageInstance();
            signUpPage.completePassword(password);
        }catch(Exception ex){
            throw new Exception("There is an error trying to write the password on the field " + ex.getMessage());
        }
    }

    @When("^Takes a photo and attach the image$")
    public void takePhotoAndAttach() throws Exception {
        try {
            createPageInstance();
            signUpPage.attachCameraImage();
        }catch(Exception ex){
            throw new Exception("There is an error trying to take the photo " + ex.getMessage());
        }
    }

    @When("^Verifies that the error message is (.*)$")
    public void verifyErrorMessage(String errorMessage) throws Exception {
        try {
            createPageInstance();
            Assert.assertNotNull(signUpPage.getErrorWithMessage(errorMessage));
        }catch(Exception ex){
            throw new Exception("There is an error verifying the error message : " + ex.getMessage());
        }
    }
}
