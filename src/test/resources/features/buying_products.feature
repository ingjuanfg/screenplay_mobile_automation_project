Feature: Use Shopping Cart

  Scenario: Buying products at SwagLabs
    Given that Juan signed-in SwagLabs app
    When He puts in the cart the "Sauce Labs Backpack"
    And He does the checkout of his purchase
    Then He should see that his purchase is successful
