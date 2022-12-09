#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: Login and adding Country
Scenario: Succesfully login and adding new Country
Given User launch Chrome browser
When User open URL "https://products.pisystindia.com/Ecommerce/admin/"
And User enters Emails as "admin@gmail.com" and Password as "123456" and Click on Login
When User click on Locations dropdown will open
Then click on City
And click on Add City and enter city as "Nagpur" 
Then click on Add
And close browser
