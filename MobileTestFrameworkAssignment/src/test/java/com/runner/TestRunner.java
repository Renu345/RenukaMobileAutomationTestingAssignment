package com.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)

@CucumberOptions(
	    features = "src/test/resources/com.featurefile/calculator.feature",  // Path to feature files
	    glue = "com.runner",                                               // Package name only
	    plugin = { "pretty", "html:target/cucumber-reports" },               // Updated report folder path
	    monochrome = true
	)

public class TestRunner {

}
