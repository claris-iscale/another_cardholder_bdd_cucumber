#Author: claris@iscale-solutions.com
#Keywords Summary : Testing Another Cardholder WebApp
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


@unitTest
Feature: Login Test
  I want log in Page, Forgot Password and Confirmation message feature

  Scenario Outline: Log in Page
    Given I navigate to Login Page
    When I click forgot password
    Then I check "<recoverPasswordPage>" page is displayed
    When I Click Continue button
    Then I check an error "Email cannot be blank." should be displayed
    When I go back previous Page
    And Click Didn't receive confirmation message" link
    Then I check "<requestConfirmationPage>" page is displayed
    And I Click Continue button - request confirmation page
    Then I check an error "Email cannot be blank." should be displayed - request confirmation page
    When I go back previous Page
    When I enters "<valid username>" and "<valid password>"
    And I click Sign in button
    Then I check "<selectProgramPage>" page is displayed
    And I Close the browser


  Examples:
  | invalid username | invalid password | recoverPasswordPage   | selectProgramPage | requestConfirmationPage         | valid username       | valid password |
  | invalid username | password123      | Recover your password | Select program    | Request new confirmation message| G00003@100002.com    | @Password123   |