Feature: login into application

Scenario Outline: positive test validation login
Given Initialize the browser with Chrome
And Navigate to "http://www.qaclickacademy.com" site
And Click on login link in home page to land on secure sign in page
When USer enters <username> and <password> and logs in
Then Verify that user is successfully logged in
And Close the browser

Examples:
|username      |password  |
|abc@gmail.com |123		  |
|123@gmail.com |222222    |