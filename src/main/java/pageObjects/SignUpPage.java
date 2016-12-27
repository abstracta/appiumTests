package pageObjects;

import classes.GenerateData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by USER on 19-Dec-16.
 */
public class SignUpPage extends AbstractPageObject {
    @FindBy(id = "android:id/button2") private WebElement signUpPopUpCancel;
    @FindBy(id = "com.wendydigital:id/etFirstName") private WebElement firstNameForm;
    @FindBy(id = "com.wendydigital:id/etLastName") private WebElement lastNameForm;
    @FindBy(id = "com.wendydigital:id/etEmail") private WebElement emailForm;
    @FindBy(id = "com.wendydigital:id/etPhone") private WebElement phoneNumberForm;
    @FindBy(id = "com.wendydigital:id/etPassword") private WebElement passwordForm;
    @FindBy(id = "com.wendydigital:id/tvChangePhoto") private WebElement changePhotoButton;
    @FindBy(id = "com.wendydigital:id/textView") private WebElement cameraOption;
    @FindBy(id = "com.android.camera:id/shutter_button") private WebElement shutterButton;
    @FindBy(name = "DONE") private WebElement doneCameraButton;
    @FindBy(id = "com.wendydigital:id/btnCreateAccount") private WebElement createAccountButton;

    public SignUpPage(WebDriver driver){
        super(driver);
    }

    public void clickOnCancelInPopUp() throws Exception {
        try {
            signUpPopUpCancel.click();
            System.out.println("Cancel button on popup was clicked");
        }catch(Exception ex){
            throw new Exception("There is an error clicking on cancel button. Error : " + ex.getMessage());
        }
    }

    public void completeForm() throws Exception {
        try {
            System.out.println("Completing Form");
            completeFirstName("TestingName");
            completeLastName("TestingLastName");
            completeEmail(true);
            completePhoneNumber("1 404 345 4524");
            completePassword("TestingPassword");
            attachCameraImage();
            System.out.println("Form Completed!");
        }catch(Exception ex){
            throw new Exception("There is an error completing the form. Error : " + ex.getMessage());
        }
    }

    public void clickOnCreateAccountButton() throws Exception {
        try{
            createAccountButton.click();
            System.out.println("Create account button clicked!");
        }catch(Exception ex){
            throw new Exception("There is an error clicking on create account button. Error : " + ex.getMessage());
        }
    }

    public String getRegistrationMessage() throws InterruptedException {
        waitProgressBar();
        WebElement registrationMessage = driver.findElement(By.id("android:id/message"));
        return registrationMessage.getText();
    }

    public WebElement getErrorWithMessage(String message) throws Exception {
        try {
            WebElement errorMessage = driver.findElement(By.name(message));
            return errorMessage;
        }catch(Exception ex){
            throw new Exception("There is an error trying to find the error. Error : " + ex.getMessage());
        }
    }

    public void clickOnOkButton(){
        WebElement okButton = driver.findElement(By.id("android:id/button1"));
        okButton.click();
    }

    public void completeFirstName(String firstName) throws Exception {
        try
        {
            firstNameForm.sendKeys(firstName);
        }catch(Exception ex){
            throw new Exception("There is an error writing the first name. Error : " + ex.getMessage());
        }
    }

    public void completeLastName(String lastName) throws Exception {
        try
        {
            lastNameForm.sendKeys(lastName);
        }catch(Exception ex){
            throw new Exception("There is an error writing the last name. Error : " + ex.getMessage());
        }
    }

    public void completeEmail(Boolean valid) throws Exception {
        try
        {
            if (valid){
                emailForm.sendKeys(GenerateData.generateEmail(20));
            }else{
                emailForm.sendKeys("wrongEmail@");
            }
        }catch(Exception ex){
            throw new Exception("There is an error writing the email. Error : " + ex.getMessage());
        }
    }

    public void completePhoneNumber(String phoneNumber) throws Exception {
        try
        {
            phoneNumberForm.sendKeys(phoneNumber);
        }catch(Exception ex){
            throw new Exception("There is an error writing the phone number. Error : " + ex.getMessage());
        }
    }

    public void completePassword(String password) throws Exception {
        try
        {
            passwordForm.sendKeys(password);
        }catch(Exception ex){
            throw new Exception("There is an error writing the password. Error : " + ex.getMessage());
        }
    }

    public void attachCameraImage() throws Exception{
        try {
            changePhotoButton.click();
            cameraOption.click();
            shutterButton.click();
            doneCameraButton.click();
        }catch(Exception ex){
            throw new Exception("There is an error taking the photo. Error : " + ex.getMessage());
        }
    }
}
