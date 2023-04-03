Feature: Validate the profile functionality for e2eHiring application

        @Profile @one
      Scenario: Verification of profile functionality with valid information
Given I launch the application
When I enter emailid "abhilashhs14@gmail.com"
When I enter password "Abhi@123"
Then I click on login button
Then I click on Me menu
Then I click on view profile
Then I click on Edit profile
Then I enter First Name "Abhilash"
Then I enter Last Name "Gowda"
Then I enter enter headline "Proven experience as a QA tester|Knowledge and experience in automated testing tools, Selenium"
Then I enter Industry "Accounting"
Then I select 2020 in Academic Completion Year dropdown
Then I select Fresher in Candidate Type 
Then I enter Current City "Mysure"
Then I select Joining immediately in Notice period dropdown
And I click on save button
