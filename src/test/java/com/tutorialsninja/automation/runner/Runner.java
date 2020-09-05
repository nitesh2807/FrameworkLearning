package com.tutorialsninja.automation.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/*@RunWith(Cucumber.class)

	@CucumberOptions(features= {"classpath:FeatureFiles\\Login.feature"},
			glue= {"com.tutorialsninja.automation.stepdef"},
			plugin= {"html:target/cucmber_html_report"},
			tags= {"@Login"}
			)*/
@RunWith(Cucumber.class)

@CucumberOptions(features= {"classpath:FeatureFiles\\Register.feature","classpath:FeatureFiles\\Login.feature"},
		glue= {"com.tutorialsninja.automation.stepdef"},
		plugin= {"html:target/cucmber_html_report"}
	
		)
public class Runner {

}
