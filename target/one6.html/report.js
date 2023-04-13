$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/aramudhan/eclipse-workspace/cucumber/src/test/resources/fbprofile/Facebook.feature");
formatter.feature({
  "name": "Facebook",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "common fumction",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "launch the url \"https://www.facebook.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "facebook.launch_the_url(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "create account",
  "keyword": "And "
});
formatter.match({
  "location": "facebook.create_account()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "oops",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "user clicks",
  "keyword": "Given "
});
formatter.match({
  "location": "facebook.user_clicks()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user sends",
  "keyword": "When "
});
formatter.match({
  "location": "facebook.user_sends()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "output",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "User clicks on create account",
  "keyword": "Given "
});
formatter.step({
  "name": "user enters the firstname with one dim map \"\u003cfirstname\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user enters the surname with one dim map \"\u003csname\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user send email \"\u003cemail\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "user send password \"\u003cpass\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user send dropdown",
  "keyword": "Then "
});
formatter.step({
  "name": "user select gender",
  "keyword": "When "
});
formatter.step({
  "name": "user click sign up",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "firstname",
        "sname",
        "email",
        "pass"
      ]
    },
    {
      "cells": [
        "giri",
        "dharan",
        "giridharan@gmail.com",
        "ddsbjd6759"
      ]
    },
    {
      "cells": [
        "arumugam",
        "m",
        "arumugamajith@gmail.com",
        "safhsasa67"
      ]
    },
    {
      "cells": [
        "aramudhan",
        "a",
        "aramudhan@gmail.com",
        "amudhan123"
      ]
    }
  ]
});
formatter.background({
  "name": "common fumction",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "launch the url \"https://www.facebook.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "facebook.launch_the_url(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "create account",
  "keyword": "And "
});
formatter.match({
  "location": "facebook.create_account()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "output",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "User clicks on create account",
  "keyword": "Given "
});
formatter.match({
  "location": "facebook.user_clicks_on_create_account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the firstname with one dim map \"giri\"",
  "keyword": "When "
});
formatter.match({
  "location": "facebook.user_enters_the_firstname_with_one_dim_map(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the surname with one dim map \"dharan\"",
  "keyword": "When "
});
formatter.match({
  "location": "facebook.user_enters_the_surname_with_one_dim_map(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user send email \"giridharan@gmail.com\"",
  "keyword": "Then "
});
formatter.match({
  "location": "facebook.user_send_email(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user send password \"ddsbjd6759\"",
  "keyword": "When "
});
formatter.match({
  "location": "facebook.user_send_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user send dropdown",
  "keyword": "Then "
});
formatter.match({
  "location": "facebook.user_send_dropdown()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select gender",
  "keyword": "When "
});
formatter.match({
  "location": "facebook.user_select_gender()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click sign up",
  "keyword": "Then "
});
formatter.match({
  "location": "facebook.user_click_sign_up()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "common fumction",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "launch the url \"https://www.facebook.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "facebook.launch_the_url(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "create account",
  "keyword": "And "
});
formatter.match({
  "location": "facebook.create_account()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "output",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "User clicks on create account",
  "keyword": "Given "
});
formatter.match({
  "location": "facebook.user_clicks_on_create_account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the firstname with one dim map \"arumugam\"",
  "keyword": "When "
});
formatter.match({
  "location": "facebook.user_enters_the_firstname_with_one_dim_map(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the surname with one dim map \"m\"",
  "keyword": "When "
});
formatter.match({
  "location": "facebook.user_enters_the_surname_with_one_dim_map(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user send email \"arumugamajith@gmail.com\"",
  "keyword": "Then "
});
formatter.match({
  "location": "facebook.user_send_email(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user send password \"safhsasa67\"",
  "keyword": "When "
});
formatter.match({
  "location": "facebook.user_send_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user send dropdown",
  "keyword": "Then "
});
formatter.match({
  "location": "facebook.user_send_dropdown()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select gender",
  "keyword": "When "
});
formatter.match({
  "location": "facebook.user_select_gender()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click sign up",
  "keyword": "Then "
});
formatter.match({
  "location": "facebook.user_click_sign_up()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "common fumction",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "launch the url \"https://www.facebook.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "facebook.launch_the_url(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "create account",
  "keyword": "And "
});
formatter.match({
  "location": "facebook.create_account()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "output",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "User clicks on create account",
  "keyword": "Given "
});
formatter.match({
  "location": "facebook.user_clicks_on_create_account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the firstname with one dim map \"aramudhan\"",
  "keyword": "When "
});
formatter.match({
  "location": "facebook.user_enters_the_firstname_with_one_dim_map(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the surname with one dim map \"a\"",
  "keyword": "When "
});
formatter.match({
  "location": "facebook.user_enters_the_surname_with_one_dim_map(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user send email \"aramudhan@gmail.com\"",
  "keyword": "Then "
});
formatter.match({
  "location": "facebook.user_send_email(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user send password \"amudhan123\"",
  "keyword": "When "
});
formatter.match({
  "location": "facebook.user_send_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user send dropdown",
  "keyword": "Then "
});
formatter.match({
  "location": "facebook.user_send_dropdown()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select gender",
  "keyword": "When "
});
formatter.match({
  "location": "facebook.user_select_gender()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click sign up",
  "keyword": "Then "
});
formatter.match({
  "location": "facebook.user_click_sign_up()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});