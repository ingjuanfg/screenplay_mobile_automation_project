Feature: Use Shopping Cart

  Scenario: Buying products at  using Questions
    Given that Juan signed-in SwagLabs app
    When He puts in the cart the "Sauce Labs Backpack"
    Then He should see that he has 1 product on the cart

  Scenario: Buying products at SwagLabs using Serenity Ensure
    Given that Juan signed-in SwagLabs app
    When He puts in the cart the "Sauce Labs Backpack"
    Then He ensure that there is 1 product on the cart