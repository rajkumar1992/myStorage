Feature:login





@regression
Scenario: Successful Login with valid credentials

Given User Launch Chrome Browser

When User opens URL "https://opensource-demo.orangehrmlive.com/"

And  User enters Username as "Admin" and Password as "admin123"

Then  Click on Login

Then Click on logout


Scenario Outline: login Data Driven

Given User Launch Chrome Browser

When User opens URL "https://opensource-demo.orangehrmlive.com/"

And  User enters Username as "<email>" and Password as "<password>"

Then  Click on Login

Then Click on logout


  Examples:
           | email | password |
            |Admin|admin123|
            |Admin|admin123|
        


