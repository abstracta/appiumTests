@signUpRegression
Feature: Test Cases for SignUp

 @successfulSignUp
 Scenario: Successful SignUp
  Given The device is setted and the application called "WendyWilliams" is opened
  Then Clicks in signup on the login page
  * Clicks in cancel button on the popup displayed in signup page
  * Completes the form for signup
  * Clicks on Create Account button
  * Verifies that the message for signup is correct
  And Clicks on OK button in signup page

  @wrongSignUp
  Scenario Outline: Signup with an error
   Given The device is setted and the application called "WendyWilliams" is opened
   Then Clicks in signup on the login page
   * Clicks in cancel button on the popup displayed in signup page
   * Writes "Juan" on the firstname field
   * Writes "Perez" on the lastname field
   * Writes <password> on the password field
   * Writes <phoneNumber> on the phone number field
   * Writes a <emailType> on the email field
   * Takes a photo and attach the image
   * Clicks on Create Account button
   And Verifies that the error message is <errorMessage>
   Examples:
    | password    | phoneNumber   | emailType | errorMessage |
    | hello123    | 12334         | true      |The phone format is invalid. Please enter phone number in international format. Ex. 1 404 345 4524|
    | hello          | 1 404 345 4524       | true |*Password have to be between 8 and 16 characters long|
    | hello12          | 1 404 345 4524        | true |*Password have to be between 8 and 16 characters long|
    | hello123          | 1 404 345 4524        | false |The email must be a valid email address.|