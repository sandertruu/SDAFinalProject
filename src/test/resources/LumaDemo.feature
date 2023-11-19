Feature: Shopping Cart
  Tests related to the functionality of the shopping cart
  on page https://magento.softwaretestingboard.com/

  Scenario: Add product to cart
    Given User is on Luma Demo page Men's Tees section
    When User chooses "Strike Endurance Tee"
    And User chooses "S" as the size
    And User chooses "Black" as the colour
    And User clicks "Add to cart" button
    Then Black S size tee is added to the cart
    And Small "1" appears over the cart icon

  Scenario: Add product without size to the cart
    Given User is on Luma Demo page Men's Tees section
    When User chooses "Strike Endurance Tee"
    And User chooses "Black" as the colour
    And User clicks "Add to cart" button
    Then Product is not added to the cart
    And Message is shown under size menu

  Scenario: Add product without colour to the cart
    Given User is on Luma Demo page Men's Tees section
    When User chooses "Strike Endurance Tee"
    And User chooses "S" as the size
    And User clicks "Add to cart" button
    Then Product is not added to the cart
    And Message is shown under colour menu

  Scenario:
