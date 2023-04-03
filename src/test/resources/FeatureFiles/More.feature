Feature: Validate the courses functionality for e2eHiring application

        @Courses @one
      Scenario: Verification of Courses functionality 
Given I launch the application
When I enter emailid "sunny@mail7.io"
When I enter password "Diatoz@123"
Then I click on login button
Then I click on More menu
Then I click on job fair
Then I click on ongoing
Then I click on completed
Then I click on More menu
Then I click on Bootcamp
Then I click on First option
Then I click on More menu 
Then I click on partners
Then I click on More menu
Then I click on Blogs
Then I click on More menu
Then I click on newsroom
