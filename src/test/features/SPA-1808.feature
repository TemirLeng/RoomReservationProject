@SPA1808
Feature: Negative Login Functionality

Scenario Outline: user should not be able to login with invalid credentials 

Given user is on the sign in page
When user enters email "<username>" and "<password>"
Then verify message "invalid password." is displayed

Examples:
| username                    | password         |                
|htwinbrowb4@blogspot.com     |Kanyabang         | 
|dfrederickb5@yellowbook.com  |Engraciahuc       | 
|apainb6@google.co.jp         |Rosettalightollers| 
|teacherilsamnickel@gmail.com |Samnickel         | 