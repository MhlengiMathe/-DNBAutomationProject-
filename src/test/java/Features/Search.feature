Feature: Search Default page
  Scenario: Adding to cart
    Given User is on Items home page
    When User search for "book" and extract actual product name
   Then User adds product to cart
   And User Goes to shopping cart