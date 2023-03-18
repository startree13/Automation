Feature: An example

  Scenario: The example
    Given I am on the main page
    When I write the email address of "test@tester.com"
    And I click on the submit button
    Then the confirmation pop-up appears

    Scenario: Negative #1
      Given I am on the main page
      When I write the email address of "test@tester.ro"
      And I click on the submit button
      Then the confirmation pop-up appears

    Scenario: Negative #2
      Given I am on the main page
      When I write the email address of "testssssstestsssssttestssssstestssssstestssssstestssssstestsssss"
      And I click on the submit button

    Scenario: Positive #3
      Given I am on the main page
      When I scroll to the Read More from Virtual
      Then the "Virtual" page opens

  Scenario: Positive #4
     Given I am on the main page
     When I click on What You'll Learn
     Then Learn the fundamentals will be shown

  Scenario: Positive #5
    Given I am on the main page
    When I write the email address of "testssssstestsssssttestssssstestssssstestssssstestssssstestsssss"
    And I click on the submit button
    Then the email field turns red

  Scenario: Positive #6
    Given I am on the main page
    When I click on Start The Enrollment
    Then Enrollment page opens

  Scenario: Negative #7
    Given I am on the Enrollment Page
    When I click on the First Name field
    And I enter the First Name "0010"
    And I enter the Last Name "010" on the Last Name field
    And I enter the Username "Ab01" in the Username field
    And I enter the Password "@010" in the Password field
    And I enter the Password "@-1-0" in the Confirm Password field
    And I click on the Next Button
    Then The user is still on Personal Information page

  Scenario: Positive #8
    Given I am on the Enrollment Page
    When I click on the First Name field
    And I enter the First Name "Smith"
    And I enter the Last Name "Ben" on the Last Name field
    And I enter the Username "BSmith01" in the Username field
    And I enter the Password "ClearSky@12" in the Password field
    And I enter the Password "ClearSky@12" in the Confirm Password field
    And I click on the Next Button
    Then Contact Information page opens

    Scenario: Positive #9
      Given I am on the main page
      When I click on Instructors button
      Then the Instructors section will be shown

    Scenario: Positive #10
      Given I am on the main page
      When I click on Instructors button
      And I click on Twitter button from John Doe
      Then Twitter page will open

   Scenario: Positive #11
      Given I am on the main page
      When I click on Instructors button
      And I click on Facebook button from Steve Smith
      Then Facebook page will open

     Scenario: Positive #12
       Given I am on the main page
       When I click on Instructors button
       And I click on Instagram button from Jane Doe
       Then Instagram page opens

       Scenario: Positive #13
         Given I am on the main page
         When I click on Instructors button
         And I click on LikedIn button from Sara Smith
         Then LinkedIn page opens

       Scenario: Negative #14
         Given I am on the main page
         When I click on the Read More button from Selenium section
         Then A new page with Selenium header opens

         Scenario: Positive #15
           Given I am on the Enrollment Page
           When I click on the Next Button
           Then an error message appears



