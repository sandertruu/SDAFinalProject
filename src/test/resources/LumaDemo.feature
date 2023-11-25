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

  Scenario: Check adding product with negative quantity to the cart
    Given User is on Luma Demo page Men's Tees section
    When User chooses "Strike Endurance Tee"
    And User chooses "S" as the size
    And User chooses "Black" as the colour
    And User changes quantity to -1
    And User clicks "Add to cart" button
    Then Product is not added to the cart
    And A message is shown "Please enter a quantity greater than 0"

  Scenario: Check editing quantity of the product in cart
    Given User is on Luma Demo page Men's Tees section with 1 item in cart
    When User opens the cart from the icon
    And User changes quantity from icon to 3
    And User clicks Update button
    Then The quantity is saved as "3"
    And Subtotal is tripled

  Scenario: Check editing quantity to negative in cart
    Given User is on Luma Demo page Men's Tees section with 1 item in cart
    When User opens the cart from the icon
    And User changes quantity from icon to -1
    Then Update button is not visible

  Scenario: Check deleting the product from cart
    Given User is on Luma Demo page Men's Tees section with 1 item in cart
    When User opens the cart from the icon
    And User clicks the thrash can button
    And User clicks OK on the pop up
    Then Item is removed from the cart

  Scenario: Check editing the product properties from the cart
    Given User is on Luma Demo page Men's Tees section with 1 item in cart
    When User opens the cart from the icon
    And User clicks View and edit cart button
    And User clicks the pencil icon
    And User changes colour to blue
    And User changes size to L
    And User clicks Update cart
    Then A message is shown
    And Properties are updated