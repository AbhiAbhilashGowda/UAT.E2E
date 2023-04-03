//package com.diatoz.automation.stepdef;
//import com.diatoz.automation.base.Base;
//import com.diatoz.automation.framework.Elements;
//import com.diatoz.automation.pages.LoginPage;
//import com.diatoz.automation.pages.MorePage;
//
//import cucumber.api.java.en.*;
//
//public class More extends Base{
//	
//    	MorePage scene = new MorePage();
//    	LoginPage scenA = new LoginPage();
//
//    	@Then("^I click on More menu$")
//        public void i_click_on_more_menu() throws Throwable {
//    		Thread.sleep(2000);
//    		Elements.click(MorePage.clickonmore);
//
//        }
//
//        @Then("^I click on job fair$")
//        public void i_click_on_job_fair() throws Throwable {
//        	Thread.sleep(2000);
//        	Elements.click(MorePage.clickonjobFair);
//            
//        }
//
//        @Then("^I click on ongoing$")
//        public void i_click_on_ongoing() throws Throwable {
//        	Thread.sleep(2000);
//        	Elements.click(MorePage.clickonOngoing);
//            
//        }
//
//        @Then("^I click on completed$")
//        public void i_click_on_completed() throws Throwable {
//        	Thread.sleep(2000);
//        	Elements.click(MorePage.clickonComplited);
//        	Thread.sleep(2000);
//        	Elements.click(MorePage.clickonmore);
//        	Thread.sleep(2000);
//        	
//            
//        }
//
//        @Then("^I click on Bootcamp$")
//        public void i_click_on_bootcamp() throws Throwable {
//        	Thread.sleep(2000);
//        	Elements.click(MorePage.clickonBootcamp);
//        	Thread.sleep(2000);
//            
//        }
//
//        @Then("^I click on First option$")
//        public void i_click_on_first_option() throws Throwable {
//        	Thread.sleep(2000);
//        	Elements.click(MorePage.clickonFirstOption);
//            
//        }
//
//        @Then("^I click on partners$")
//        public void i_click_on_partners() throws Throwable {
//        	Thread.sleep(2000);
//            Elements.click(MorePage.clickonPartenrs);
//            Thread.sleep(2000);
//
//            Elements.click(MorePage.clickonmore);
//            
//        }
//
//
//        @Then("^I click on Blogs$")
//        public void i_click_on_blogs() throws Throwable {
//        	Thread.sleep(2000);
//          Elements.click(MorePage.clickonBlogs);
//
//          Elements.click(MorePage.clickonmore);
//        }
//
//        @Then("^I click on newsroom$")
//        public void i_click_on_newsroom() throws Throwable {
//        	Thread.sleep(20000);
//        	Elements.click(MorePage.clickoNewsroom);
//           
//        }
//
//    	   
//
//    	
//    	   }
//
