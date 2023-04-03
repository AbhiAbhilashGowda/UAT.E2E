Feature: Validate the courses functionality for e2eHiring application

        @Courses @one
      Scenario: Verification of Courses functionality with valid credentials
Given I launch the application
When I enter emailid "sunny@mail7.io"
When I enter password "Diatoz@123"
Then I click on login button
Then I click on Courses menu
Then I click on First courses
Then I click on share Through Whatsup