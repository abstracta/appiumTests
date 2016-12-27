# appiumTests

## Description

This project is for automate mobile test cases using Appium, developing in Java and importing different libraries and frameworks, which ar described below :

* Maven : This project is a maven project, and you have a pom.xml file to download all the libraries automatically
* Cucumber : BDD Framework for the tests, all the "features" and "steps" for them are in src/test
* Appium Library : This library is to control the connected device (virtual or real) in order to test on it.
* Cucumber-reporting : Library for generate professional reports with charts for run in Jenkins
* TestNG : Testing framework used to execute the test cases

## Basic Structure :

src/main : In this part of the project there are all the classes with a kind of logic and the page objects.
src/test : Here we have only the "features" which are the "test cases", the steps for them and the resources (like the apk).

```
src
**** main
*********** classes : A folder with important classes for the project. Ex : DeviceHandler has all the logic to control the device configuration and the application to test
*********** pageObjects : This folder has all the pageobjects of the application, all the Pageobjects inherit from "AbstractPageObject"
**** test
*********** java
***************** features : This folder has all the features to run in Java using TestNg, it has the "cucumberOptions" to run the cucumber features.
***************** steps : This folder has all the steps that a feature contains on it's structure, using Gherkin language.
*********** resource
********************* apk : Here we have the application APK
********************* features : Here we have the features on Cucumber format.
********************* settings : This folder contains the JSON files with configurations about the device.
*********** resources : Cucumber properties
```

## Execution :

To execute a test case, it needs to be created a class in src/test/java/features with the cucumber options setted correctly, you can define the tag of the test case
or run an entire cucumber feature.
You will need to have the "Appium server" configured, running and with the device linked on the moment that you execute the test.
Then, you can run the class as a "testNg" test and the execution will be started. After the execution is finished, a report will
be generated in "target/site/cucumber-pretty".

## Requirements :

To use this project you will need to have installed in your machine :

* JDK
* Appium
* An IDE to import the project
* GenyMotion or Android Studio to create virtual devices if you need

You can read this document in order to follow the steps and have all installed : https://github.com/isonic1/appium-workshop/blob/master/Appium%20Windows%20Installation%20Instructions.md

## Contact :

If you need assistance with something, please send me an email at maximiliano.pineyro@abstracta.com.uy   or find me in GitHub, my user is : maxipineyro

## More Information :

If you need more information about this project and about Appium, we have some information in spanish in google drive. Please click on this link : https://docs.google.com/a/abstracta.com.uy/document/d/1VfNfuVLTsXr0kYzxi4o2epM-wtMbpFc5hkCHIuS9Lmc/edit?usp=sharing

Thank you!
Enjoy the project!