Feature: Gmail login

Background: login to gmail


Given user landed on gmail page
Given user enter url as "https://www.google.com/gmail/about/"
Given user click on sign up page "/html/body/header/div/div/div/a[2]"


Scenario Outline:
Given user "//*[@id='identifierId']" enter email id <userid>
Then user enter on submit "//*[@id='identifierNext']/div/button/span"
When user "//*[@id='password']/div[1]/div/div[1]/input"  enter password <password>

Examples:

|userid||password|
|shailaja@Gmail.com||Shailaja@963|

