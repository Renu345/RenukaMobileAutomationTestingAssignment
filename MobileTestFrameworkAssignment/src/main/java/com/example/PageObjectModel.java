package com.example;

import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;

public class PageObjectModel {

    private AppiumDriver driver;

    private By okClick = By.id("android:id/button1");
    private By okClick1 = By.id("android:id/button1");
    private By firstnumber = By.id("com.ulsumobile.calculator:id/iv_1");
    private By plus = By.id("com.ulsumobile.calculator:id/iv_jia");
    private By secondnumber = By.id("com.ulsumobile.calculator:id/iv_2");
    private By equal = By.id("com.ulsumobile.calculator:id/iv_deng");
    
    
    
    // Constructor to initialize AppiumDriver
    public PageObjectModel(AppiumDriver driver) {
        this.driver = driver;
    }
    
    
    
    public void okButton() {
    	driver.findElement(okClick).click();
    }

    public void okButton1() {
    	driver.findElement(okClick1).click();
    }

    public void button1() {
    	driver.findElement(firstnumber).click();
    }
    
    public void plusButton() {
    	driver.findElement(plus).click();
    }
    
    public void button2() {
    	driver.findElement(secondnumber).click();
    }
    
    public void equalButton() {
    	driver.findElement(equal).click();
    }

    
}
