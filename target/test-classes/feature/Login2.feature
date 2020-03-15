Feature:To validate the login functionality with bulk of user
Scenario Outline:To verify weather the user can be able to login with all possible combination
Given user has to enter "<username>" "<password>" and click on login
Then user has to find error page
Examples:
|monu123|monu@112|
|venky456|456789|
|monu9556|8964256|

