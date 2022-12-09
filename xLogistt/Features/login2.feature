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
Scenario: Loginand adding New Country
Given User open Chrome browser
When User Open URL "https://xlogist.pisystindia.com/admin/login"
And User enter Emails as "admin@gmail.com" and Password as "Charlie123" and Click on Login
When User click on Locationsdropdown will open
Then Click on Country
And Click on Add Country and enter Country as "India" 
Then Click on add
And Close Browser

