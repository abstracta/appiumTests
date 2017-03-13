$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/SignUp.feature");
formatter.feature({
  "line": 2,
  "name": "Test Cases for SignUp",
  "description": "",
  "id": "test-cases-for-signup",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@signUpRegression"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Successful SignUp",
  "description": "",
  "id": "test-cases-for-signup;successful-signup",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@successfulSignUp"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "The device is setted and the application called \"WendyWilliams\" is opened",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Clicks in signup on the login page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Clicks in cancel button on the popup displayed in signup page",
  "keyword": "* "
});
formatter.step({
  "line": 9,
  "name": "Completes the form for signup",
  "keyword": "* "
});
formatter.step({
  "line": 10,
  "name": "Clicks on Create Account button",
  "keyword": "* "
});
formatter.step({
  "line": 11,
  "name": "Verifies that the message for signup is correct",
  "keyword": "* "
});
formatter.step({
  "line": 12,
  "name": "Clicks on OK button in signup page",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "WendyWilliams",
      "offset": 49
    }
  ],
  "location": "DeviceSteps.openDevice(String)"
});
formatter.result({
  "duration": 18206452706,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.clickInSignUp()"
});
formatter.result({
  "duration": 1118290661,
  "status": "passed"
});
formatter.match({
  "location": "SignUpSteps.clickOnCancelButtonPopUp()"
});
formatter.result({
  "duration": 1807987601,
  "status": "passed"
});
formatter.match({
  "location": "SignUpSteps.completeForm()"
});
formatter.result({
  "duration": 34077282432,
  "status": "passed"
});
formatter.match({
  "location": "SignUpSteps.clickOnCreateAccount()"
});
formatter.result({
  "duration": 822705243,
  "status": "passed"
});
formatter.match({
  "location": "SignUpSteps.verifiesMessageIsOk()"
});
formatter.result({
  "duration": 6876078124,
  "status": "passed"
});
formatter.match({
  "location": "SignUpSteps.clickOnOkButton()"
});
formatter.result({
  "duration": 3133057290,
  "status": "passed"
});
formatter.after({
  "duration": 497881678,
  "status": "passed"
});
});