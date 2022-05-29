Feature: login functionality

@search
Scenario: Verify user add item in cart

Given Lunch "<URL>"
Then Click login
Then Enter username and password then click login
Then Click Samsung6 hyperlink
Then Click add cart
Then Click Cart
Then Verify user add item in cart
