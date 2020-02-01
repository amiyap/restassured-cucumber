package com.amiya_apitest.cucumberrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty", "json:target/cucumber-reports/Cucumber.json",
				 "junit:target/cucumber-reports/Cucumber.xml",
				 "html:target/cucumber-html-reports"},
		glue = {"com.amiya_apitest.stepdefinition"},
		features = {"src/test/java/com/amiya_apitest/featurefiles"})
public class CucumberRunner {}
