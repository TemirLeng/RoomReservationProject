@SPA1806
Feature: Postive Login Functionality

Scenario Outline: user is able to login with correct credentials 
Given user is on the sign in page
When user enters correct email "<username>" and "<password>"
And verify "<location>" IL is displayed

Examples:
| username                    | password         | location |                
|htwinbrowb4@blogspot.com     |kanyabang         | IL       |
|dfrederickb5@yellowbook.com  |engraciahuc       | IL       |
|apainb6@google.co.jp         |rosettalightollers| IL       |
|afbawmeb7@studiopress.com    |sherilyngohn      | IL       |
|teacherilsamnickel@gmail.com |samnickel         | IL       |

