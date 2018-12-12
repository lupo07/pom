$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/Access.feature");
formatter.feature({
  "line": 1,
  "name": "Access the google account",
  "description": "",
  "id": "access-the-google-account",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 2,
      "value": "#"
    },
    {
      "line": 3,
      "value": "#"
    },
    {
      "line": 4,
      "value": "#  Scenario Outline: Access to google account"
    },
    {
      "line": 5,
      "value": "#    Given I have a google account  \u003caccount\u003e"
    },
    {
      "line": 6,
      "value": "#    And I have the password \u003cpassword\u003e"
    },
    {
      "line": 7,
      "value": "#    When I try to access"
    },
    {
      "line": 8,
      "value": "#    Then I should be able to enter to my account"
    },
    {
      "line": 9,
      "value": "#"
    },
    {
      "line": 10,
      "value": "#"
    },
    {
      "line": 11,
      "value": "#    Examples:"
    },
    {
      "line": 12,
      "value": "#    |              account             |          password        |"
    },
    {
      "line": 13,
      "value": "#    |      eduardo.alvarez0007         |    S3r3nd1p1aLup0N3r0    |"
    },
    {
      "line": 14,
      "value": "#"
    }
  ],
  "line": 16,
  "name": "Validate the error message when trying to access a google account",
  "description": "",
  "id": "access-the-google-account;validate-the-error-message-when-trying-to-access-a-google-account",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 17,
  "name": "I have a google account  \u003caccount\u003e",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "I have the password \u003cpassword\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I try to access",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "I should be able to get the proper error\u003cerror\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "The color should be \u003ccolor\u003e",
  "keyword": "And "
});
formatter.examples({
  "line": 23,
  "name": "",
  "description": "",
  "id": "access-the-google-account;validate-the-error-message-when-trying-to-access-a-google-account;",
  "rows": [
    {
      "cells": [
        "account",
        "password",
        "error",
        "color"
      ],
      "line": 24,
      "id": "access-the-google-account;validate-the-error-message-when-trying-to-access-a-google-account;;1"
    },
    {
      "cells": [
        "",
        "",
        "Ingresa un correo electrónico o número de teléfono",
        "rgba(213, 0, 0, 1)"
      ],
      "line": 25,
      "id": "access-the-google-account;validate-the-error-message-when-trying-to-access-a-google-account;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 7571242349,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "Validate the error message when trying to access a google account",
  "description": "",
  "id": "access-the-google-account;validate-the-error-message-when-trying-to-access-a-google-account;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 17,
  "name": "I have a google account  ",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "I have the password ",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I try to access",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "I should be able to get the proper errorIngresa un correo electrónico o número de teléfono",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "The color should be rgba(213, 0, 0, 1)",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": " ",
      "offset": 24
    }
  ],
  "location": "AccessGStepDef.I_have_a_google_account(String)"
});
formatter.result({
  "duration": 115974957,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 20
    }
  ],
  "location": "AccessGStepDef.I_have_the_password(String)"
});
formatter.result({
  "duration": 266666,
  "status": "passed"
});
formatter.match({
  "location": "AccessGStepDef.I_try_to_access()"
});
formatter.result({
  "duration": 1817952243,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ingresa un correo electrónico o número de teléfono",
      "offset": 40
    }
  ],
  "location": "AccessGStepDef.I_should_be_able_to_get_the_proper_error(String)"
});
formatter.result({
  "duration": 87111,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "rgba(213, 0, 0, 1)",
      "offset": 20
    }
  ],
  "location": "AccessGStepDef.The_color_should_be(String)"
});
formatter.result({
  "duration": 5857471745,
  "error_message": "java.lang.AssertionError: expected [true] but found [false]\r\n\tat org.testng.Assert.fail(Assert.java:93)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:512)\r\n\tat org.testng.Assert.assertTrue(Assert.java:41)\r\n\tat org.testng.Assert.assertTrue(Assert.java:51)\r\n\tat page.gaccess.GmailPage.fillPassword(GmailPage.java:107)\r\n\tat cucumber.integration.AccessGStepDef.The_color_should_be(AccessGStepDef.java:78)\r\n\tat ✽.And The color should be rgba(213, 0, 0, 1)(Features/Access.feature:21)\r\n",
  "status": "failed"
});
});