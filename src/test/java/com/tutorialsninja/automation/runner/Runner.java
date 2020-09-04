package com.tutorialsninja.automation.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

	@CucumberOptions(features= {"classpath:FeatureFiles\\Register.feature"},
			glue= {"com.tutorialsninja.automation.stepdef"},
			plugin= {"html:target/cucmber_html_report"},
			tags= {"@Reg"})
public class Runner {

}
