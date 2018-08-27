$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/features/SPA-1802.feature");
formatter.feature({
  "name": "",
  "description": "  User reserves a room",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@SPA-1802"
    },
    {
      "name": "@SPA-1741"
    }
  ]
});
formatter.scenarioOutline({
  "name": "",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "\"\u003cuser\u003e\" is on the signs in to page using valid \"\u003cemail\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "\"\u003cuser\u003e\" clicks on hunt to make reservation",
  "keyword": "When "
});
formatter.step({
  "name": "\"\u003cuser\u003e\" chooses \"today\u0027s date\" as the desired date",
  "keyword": "Then "
});
formatter.step({
  "name": "\"\u003cuser\u003e\" enters startTime \"8:30am\" endTime \"9:30am\" then clicks search button",
  "keyword": "Then "
});
formatter.step({
  "name": "\"\u003cuser\u003e\" verifies free spots is displayed",
  "keyword": "Then "
});
formatter.step({
  "name": "\"\u003cuser\u003e\" clicks on book for \"Apple\" and verifies the time",
  "keyword": "Then "
});
formatter.step({
  "name": "\"\u003cuser\u003e\" clicks confirm button",
  "keyword": "Then "
});
formatter.step({
  "name": "\"\u003cuser\u003e\" verifies that \"Apple\" has been reserved as a desired room",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "user",
        "email",
        "password"
      ]
    },
    {
      "cells": [
        "Kanya Bang",
        "htwinbrowb4@blogspot.com",
        "kanyabang"
      ]
    },
    {
      "cells": [
        "Sam Nickel",
        "teacherilsamnickel@gmail.com",
        "samnickel"
      ]
    }
  ]
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SPA-1802"
    },
    {
      "name": "@SPA-1741"
    }
  ]
});
formatter.step({
  "name": "\"Kanya Bang\" is on the signs in to page using valid \"htwinbrowb4@blogspot.com\" and \"kanyabang\"",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "\"Kanya Bang\" clicks on hunt to make reservation",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "\"Kanya Bang\" chooses \"today\u0027s date\" as the desired date",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "\"Kanya Bang\" enters startTime \"8:30am\" endTime \"9:30am\" then clicks search button",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "\"Kanya Bang\" verifies free spots is displayed",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "\"Kanya Bang\" clicks on book for \"Apple\" and verifies the time",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "\"Kanya Bang\" clicks confirm button",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "\"Kanya Bang\" verifies that \"Apple\" has been reserved as a desired room",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SPA-1802"
    },
    {
      "name": "@SPA-1741"
    }
  ]
});
formatter.step({
  "name": "\"Sam Nickel\" is on the signs in to page using valid \"teacherilsamnickel@gmail.com\" and \"samnickel\"",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "\"Sam Nickel\" clicks on hunt to make reservation",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "\"Sam Nickel\" chooses \"today\u0027s date\" as the desired date",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "\"Sam Nickel\" enters startTime \"8:30am\" endTime \"9:30am\" then clicks search button",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "\"Sam Nickel\" verifies free spots is displayed",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "\"Sam Nickel\" clicks on book for \"Apple\" and verifies the time",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "\"Sam Nickel\" clicks confirm button",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "\"Sam Nickel\" verifies that \"Apple\" has been reserved as a desired room",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});