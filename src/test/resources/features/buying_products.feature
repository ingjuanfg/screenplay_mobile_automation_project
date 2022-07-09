Feature: Use Shopping Cart

  Scenario: Buying products at SwagLabs
    Given that Juan signed-in SwagLabs app
    When He puts in the cart the "Sauce Labs Backpack"
    Then He should see that he has 1 product on the cart