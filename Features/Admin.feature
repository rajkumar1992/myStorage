Feature: Admin Dashboard



@regression
Scenario: Clicking on Admin Dashboard successfully
  
Given User Launch Chrome Browser

When User opens URL "https://opensource-demo.orangehrmlive.com/"

And  User enters Username as "Admin" and Password as "admin123"

Then  Click on Login

Then Click on ADMIN Dashbord

And User enter Username as "David Jones" 

And Select UserRole as Admin

And User enters Employee name as "Ronald" 

And Select status as Enabled

Then Then Click on logout







