//package com.diatoz.automation.stepdef;
//
//import com.diatoz.automation.base.Base;
//import com.diatoz.automation.framework.Elements;
//import com.diatoz.automation.pages.LoginwithInvalidPage;
//
//import cucumber.api.java.en.*;
//
//public class LoginwithInvalid extends Base {
//
//	LoginwithInvalidPage scenc = new LoginwithInvalidPage();
//
//	@Given("^I launch the application$")
//    public void i_launch_the_application() throws Throwable {
//
//		Base.driver.get(Base.reader.getUrl());
//		Thread.sleep(2000);
//		System.out.println("Launch the application");
//        
//    }
//
//    @When("^I enter invalid emailid \"([^\"]*)\"$")
//    public void i_enter_invalid_emailid_something(String invalid) throws Throwable {
//    	Thread.sleep(2000);
//    Elements.TypeText(LoginwithInvalidPage.entervalidusername, invalid);
//        
//    }
//
//    @When("^I enter invalid password \"([^\"]*)\"$")
//    public void i_enter_invalid_password_something(String invalidpass) throws Throwable {
//    	Thread.sleep(2000);
//    	Elements.TypeText(LoginwithInvalidPage.enterinvalidpassword, invalidpass);
//
//    }
//
//    @When("^I enter valid emailid \"([^\"]*)\"$")
//    public void i_enter_valid_emailid_something(String valid) throws Throwable {
//    	Thread.sleep(2000);
//    	Elements.TypeText(LoginwithInvalidPage.enterinvalidusername, valid);
//       
//    }
//
//    @When("^I enter valid password \"([^\"]*)\"$")
//    public void i_enter_valid_password_something(String vaalidpass) throws Throwable {
//    	Thread.sleep(2000);
//    	Elements.TypeText(LoginwithInvalidPage.entervalidpassword, vaalidpass);
//
//    }
//
//    @Then("^I click on login button$")
//    public void i_click_on_login_button() throws Throwable {
//    	Elements.click(LoginwithInvalidPage.clickLogin);
//        
//    }
//
//    @Then("^I should get error message$")
//    public void i_should_get_error_message() throws Throwable {
//        
//    }
//
//}
