package com.diatoz.automation.stepdef;

import com.diatoz.automation.base.Base;
import com.diatoz.automation.framework.Elements;
import com.diatoz.automation.pages.ProfilePage;
import cucumber.api.java.en.*;

public class Profile extends Base {

	ProfilePage scenA = new ProfilePage();
	@Given("^I launch the application$")
    public void i_launch_the_application() throws Throwable {
       Base.driver.get(Base.reader.getUrl());
		Thread.sleep(2000);
		System.out.println("Launch the application");
    }

    @When("^I enter emailid \"([^\"]*)\"$")
    public void i_enter_emailid_something(String Username) throws Throwable {
    	Thread.sleep(2000);
    	Elements.TypeText(ProfilePage.enterusername, Username);
    	Thread.sleep(2000);
        
    }

    @When("^I enter password \"([^\"]*)\"$")
    public void i_enter_password_something(String password) throws Throwable {
    	Thread.sleep(2000);
    	Elements.TypeText(ProfilePage.enterpassword, password);
    	Thread.sleep(2000);

    }

    @Then("^I click on login button$")
    public void i_click_on_login_button() throws Throwable {
    	Elements.click(ProfilePage.clickLogin);
        
    }

    @Then("^I click on Me menu$")
    public void i_click_on_me_menu() throws Throwable {
    	Thread.sleep(2000);
    	Elements.click(ProfilePage.clickonMe);
        
    }

    @Then("^I click on view profile$")
    public void i_click_on_view_profile() throws Throwable {
    	Thread.sleep(2000);
    	Elements.click(ProfilePage.selectviewprofile);
    	
        
    }

    @Then("^I click on Edit profile$")
    public void i_click_on_edit_profile() throws Throwable {
    	Thread.sleep(2000);
    	Elements.click(ProfilePage.clickonEditButton);
        
    }

    @Then("^I enter First Name \"([^\"]*)\"$")
    public void i_enter_first_name_something(String fstname) throws Throwable {
    	Thread.sleep(2000);
    	Elements.clearTxtBox(ProfilePage.enterFirstname);
    	Thread.sleep(2000);
    	Elements.TypeText(ProfilePage.enterFirstname, fstname);
        
    }

    @Then("^I enter Last Name \"([^\"]*)\"$")
    public void i_enter_last_name_something(String lstname) throws Throwable {
    	Thread.sleep(2000);
    	Elements.clearTxtBox(ProfilePage.enterLastname);
    	Thread.sleep(2000);
    	Elements.TypeText(ProfilePage.enterLastname, lstname);
        
    }

    @Then("^I enter enter headline \"([^\"]*)\"$")
    public void i_enter_enter_headline_something(String headline) throws Throwable {
    	Thread.sleep(2000);
    	Elements.clearTxtBox(ProfilePage.clickonheadline);
    	Thread.sleep(2000);
    	Elements.TypeText(ProfilePage.clickonheadline, headline);
    	Thread.sleep(2000);

    }

    @Then("^I enter Industry \"([^\"]*)\"$")
    public void i_enter_industry_something(String type) throws Throwable {
    	Thread.sleep(2000);
    	Elements.clearTxtBox(ProfilePage.selectindustry);
    	Thread.sleep(20000);
    	Elements.TypeText(ProfilePage.selectindustry, type);
    	Thread.sleep(2000);
        
    }

    @Then("^I select 2020 in Academic Completion Year dropdown$")
    public void i_select_2020_in_academic_completion_year_dropdown() throws Throwable {
    	Elements.click(ProfilePage.selectYear);
        
    }

    @Then("^I select Fresher in Candidate Type$")
    public void i_select_Fresher_in_Candidate_Type() throws Exception {
    	Thread.sleep(2000);
    	Elements.click(ProfilePage.selectASFresher);

    }

    @Then("^I enter Current City \"([^\"]*)\"$")
    public void i_enter_current_city_something(String place) throws Throwable {
    	Thread.sleep(2000);
    	Elements.TypeText(ProfilePage.enterCity, place);
        
    }

    @Then("^I select Joining immediately in Notice period dropdown$")
    public void i_select_joining_immediately_in_notice_period_dropdown(String period) throws Throwable {
    	Thread.sleep(2000);
    	Elements.TypeText(ProfilePage.enterNoticeperiod, period);
        
    }

    @And("^I click on save button$")
    public void i_click_on_save_button() throws Throwable {
    	Elements.click(ProfilePage.clcikonSave);
        
    }


	
}