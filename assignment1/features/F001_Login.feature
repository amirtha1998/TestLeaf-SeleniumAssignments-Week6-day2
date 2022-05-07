Feature: Login functionality of Leaftaps application

#Background:
#Given Open the chrome browser
#And Load the application url

Scenario Outline: TC01_Login with positive credential
And Enter the username as <username>
And Enter the password as <password>
When Click on Login button
Then Homepage should be displayed

Examples:
|username|password|
|'DemosalesManager'|'crmsfa'||'DemoCSR'|'crmsfa'|

#Scenario: TC02_Login with negative credential
#And Enter the name as 'Demo'
#And enter the password as 'crmsfa'
#When Click on Login button
#But Error message should be displayed