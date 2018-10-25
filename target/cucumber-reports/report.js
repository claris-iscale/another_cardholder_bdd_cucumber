$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Feature/login_test.feature");
formatter.feature({
  "name": "Login Test",
  "description": "  I want log in Page, Forgot Password and Confirmation message feature",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@unitTest"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Log in Page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I navigate to Login Page",
  "keyword": "Given "
});
formatter.step({
  "name": "I click forgot password",
  "keyword": "When "
});
formatter.step({
  "name": "I check \"\u003crecoverPasswordPage\u003e\" page is displayed",
  "keyword": "Then "
});
formatter.step({
  "name": "I Click Continue button",
  "keyword": "When "
});
formatter.step({
  "name": "I check an error \"Email cannot be blank.\" should be displayed",
  "keyword": "Then "
});
formatter.step({
  "name": "I go back previous Page",
  "keyword": "When "
});
formatter.step({
  "name": "Click Didn\u0027t receive confirmation message\" link",
  "keyword": "And "
});
formatter.step({
  "name": "I check \"\u003crequestConfirmationPage\u003e\" page is displayed",
  "keyword": "Then "
});
formatter.step({
  "name": "I Click Continue button - request confirmation page",
  "keyword": "And "
});
formatter.step({
  "name": "I check an error \"Email cannot be blank.\" should be displayed - request confirmation page",
  "keyword": "Then "
});
formatter.step({
  "name": "I go back previous Page",
  "keyword": "When "
});
formatter.step({
  "name": "I enters \"\u003cvalid username\u003e\" and \"\u003cvalid password\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "I click Sign in button",
  "keyword": "And "
});
formatter.step({
  "name": "I check \"\u003cselectProgramPage\u003e\" page is displayed",
  "keyword": "Then "
});
formatter.step({
  "name": "I Close the browser",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "invalid username",
        "invalid password",
        "recoverPasswordPage",
        "selectProgramPage",
        "requestConfirmationPage",
        "valid username",
        "valid password"
      ]
    },
    {
      "cells": [
        "invalid username",
        "password123",
        "Recover your password",
        "Select program",
        "Request new confirmation message",
        "G00003@100002.com",
        "@Password123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Log in Page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@unitTest"
    }
  ]
});
formatter.step({
  "name": "I navigate to Login Page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_Home_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click forgot password",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefinition.click_forgot_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I check \"Recover your password\" page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "CommonStepDefinition.page_title_is_displayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Click Continue button",
  "keyword": "When "
});
formatter.match({
  "location": "RecoverPasswordStepDefinition.click_continue_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I check an error \"Email cannot be blank.\" should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "RecoverPasswordStepDefinition.check_error_message_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I go back previous Page",
  "keyword": "When "
});
formatter.match({
  "location": "CommonStepDefinition.click_continue_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Didn\u0027t receive confirmation message\" link",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinition.click_didnt_receive_confirmation_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I check \"Request new confirmation message\" page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "CommonStepDefinition.page_title_is_displayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Click Continue button - request confirmation page",
  "keyword": "And "
});
formatter.match({
  "location": "RequestConfirmationStepDefinition.click_continue_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I check an error \"Email cannot be blank.\" should be displayed - request confirmation page",
  "keyword": "Then "
});
formatter.match({
  "location": "RequestConfirmationStepDefinition.check_error_message_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I go back previous Page",
  "keyword": "When "
});
formatter.match({
  "location": "CommonStepDefinition.click_continue_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enters \"G00003@100002.com\" and \"@Password123\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefinition.user_enters_UserName_and_Password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click Sign in button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinition.click_sign_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I check \"Select program\" page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "CommonStepDefinition.page_title_is_displayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinition.user_close_the_browser()"
});
formatter.result({
  "status": "passed"
});
});