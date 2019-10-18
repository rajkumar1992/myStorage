$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/Admin.feature");
formatter.feature({
  "name": "Admin Dashboard",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Clicking on Admin Dashboard successfully",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "User Launch Chrome Browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_Launch_Chrome_Browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens URL \"https://opensource-demo.orangehrmlive.com/\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_opens_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Username as \"Admin\" and Password as \"admin123\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_enters_Username_as_and_Password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on ADMIN Dashbord",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_ADMIN_Dashbord()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter Username as \"David Jones\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_enter_Username_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select UserRole as Admin",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.select_UserRole_as_Admin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Employee name as \"Ronald\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_enters_Employee_name_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select status as Enabled",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.select_status_as_Enabled()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Then Click on logout",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.then_Click_on_logout()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:Features/login.feature");
formatter.feature({
  "name": "login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Successful Login with valid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "User Launch Chrome Browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_Launch_Chrome_Browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens URL \"https://opensource-demo.orangehrmlive.com/\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_opens_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Username as \"Admin\" and Password as \"admin123\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_enters_Username_as_and_Password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on logout",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_on_logout()"
});
formatter.result({
  "status": "passed"
});
});