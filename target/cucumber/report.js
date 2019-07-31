$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/userLogin.feature");
formatter.feature({
  "name": "User login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Valid administrator login",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "The login web page is accessible",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.theLoginWebPageIsAccessible()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I introduce the administrator user \u0026 password",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.iIntroduceTheAdministratorUserPassword()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The \"my Profile\" page is shown",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.thePageIsShown(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The \"edit Profile\" button is enabled",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.theButtonIsEnabled(String)"
});
formatter.result({
  "status": "passed"
});
});