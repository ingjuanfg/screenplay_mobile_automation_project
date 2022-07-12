Feature: Login Swaglabs App

  Scenario: Login Success using Questions
    When Juan types his credentials on SwagLabs app
    Then He should see the product page

  Scenario: Login Success using Serenity Ensure
    When Juan types his credentials on SwagLabs app
    Then He ensure that is on product page