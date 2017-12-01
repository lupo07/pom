$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/Access.feature");
formatter.feature({
  "line": 1,
  "name": "Access the google account",
  "description": "",
  "id": "access-the-google-account",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Access to google account",
  "description": "",
  "id": "access-the-google-account;access-to-google-account",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I have a google account  \u003caccount\u003e",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I have the password \u003cpassword\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I try to access",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I should be able to enter to my account",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "access-the-google-account;access-to-google-account;",
  "rows": [
    {
      "cells": [
        "account",
        "password"
      ],
      "line": 12,
      "id": "access-the-google-account;access-to-google-account;;1"
    },
    {
      "cells": [
        "eduardo.alvarez0007",
        "S3r3nd1p1aLup0N3r0"
      ],
      "line": 13,
      "id": "access-the-google-account;access-to-google-account;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 7196726579,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Access to google account",
  "description": "",
  "id": "access-the-google-account;access-to-google-account;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I have a google account  eduardo.alvarez0007",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I have the password S3r3nd1p1aLup0N3r0",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I try to access",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I should be able to enter to my account",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": " eduardo.alvarez0007",
      "offset": 24
    }
  ],
  "location": "AccessGStepDef.I_have_a_google_account(String)"
});
formatter.result({
  "duration": 103377732,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "S3r3nd1p1aLup0N3r0",
      "offset": 20
    }
  ],
  "location": "AccessGStepDef.I_have_the_password(String)"
});
formatter.result({
  "duration": 107556,
  "status": "passed"
});
formatter.match({
  "location": "AccessGStepDef.I_try_to_access()"
});
formatter.result({
  "duration": 1470585124,
  "status": "passed"
});
formatter.match({
  "location": "AccessGStepDef.I_should_be_able_to_enter_to_my_account()"
});
formatter.result({
  "duration": 2150566155,
  "status": "passed"
});
formatter.scenarioOutline({
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
        "No se ha podido encontrar tu cuenta de Google",
        "#d50000"
      ],
      "line": 25,
      "id": "access-the-google-account;validate-the-error-message-when-trying-to-access-a-google-account;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 5909040929,
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
  "name": "I should be able to get the proper errorNo se ha podido encontrar tu cuenta de Google",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "The color should be #d50000",
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
  "duration": 148000,
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
  "duration": 67111,
  "status": "passed"
});
formatter.match({
  "location": "AccessGStepDef.I_try_to_access()"
});
formatter.result({
  "duration": 1571299301,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "arguments": [
    {
      "val": "#d50000",
      "offset": 20
    }
  ],
  "location": "AccessGStepDef.The_color_should_be(String)"
});
formatter.result({
  "status": "skipped"
});
});