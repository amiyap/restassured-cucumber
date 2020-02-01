package com.amiya_apitest.cucumberrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty"},
		glue = {"com.amiya_apitest.stepdefinition"},
		features = {"src/test/java/com/amiya_apitest/featurefiles"})
public class CucumberTests {}
