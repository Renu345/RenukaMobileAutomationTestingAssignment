package com.runner;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.example.PageObjectModel;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.net.URL;
public class FirstCalculationStepDefintion {

	private AppiumDriver driver;
	private PageObjectModel pageObjectModel;
	
	//protected AndroidDriver driver;

    // @Before setup method to initialize driver
    @Before
    public AppiumDriver setUp() throws MalformedURLException, URISyntaxException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 7a API 34");
        cap.setCapability(MobileCapabilityType.APP, "C:/Users/renukar/Documents/Notes/Mobile Automation Testing/com.ulsumobile.calculator.apk");
        
        // Initialize AndroidDriver
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        return driver;
    }

    // @After teardown method to quit driver
    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    
    @Given("the calculator app is open")
    public void openCalculatorApp() throws MalformedURLException, URISyntaxException {
       driver=setUp();
    	pageObjectModel = new PageObjectModel(driver);
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    	pageObjectModel.okButton();
    	//pageObjectModel.okButton1();
        // You can add logic here to ensure the app is opened (Appium will handle app launch if configured correctly)
        
    }

    @When("the user enters firstdigit")
    public void enterNumbers() {
        pageObjectModel.button1();  // Pass firstdigit to the method
    }
    
    
    @Then("the user press add")
    public void pressAddButton() {
        pageObjectModel.plusButton(); // Adjust locator for "+" button in PageObjectModel
    }

    @When("the user enter seconddigit")
    public void enterSecondDigit() {
        pageObjectModel.button2(); // Adjust locator for "2" button in PageObjectModel
    }


    
    @And("the user press jia")
    public void pressOperation() {
        pageObjectModel.equalButton();  // Pass the operation (e.g., "add") to the method
    }

}
