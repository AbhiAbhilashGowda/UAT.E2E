package com.diatoz.automation;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
//import cucumber.api.junit.Cucumber;
//import io.cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={//"classpath:FeatureFiles/Login.feature",
                           //"classpath:FeatureFiles/Jobs.feature",
		                    //"classpath:FeatureFiles/LoginwithInvalid.feature",
		                    //"classpath:FeatureFiles/Mentorshipp.feature",
		                     // "classpath:FeatureFiles/Courses.feature",
		                     // "classpath:FeatureFiles/More.feature",
		                      "classpath:FeatureFiles/Profile.feature"

},
glue={"classpath:com.diatoz.automation.stepdef"},
//tags= {" @Courses @one"},

plugin={"html:target/cucumber_html_report","json:target/cucumber.json"})

public class Runner {
	 

}

