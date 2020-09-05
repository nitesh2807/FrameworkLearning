Feature: Login Functionality scenarios

@Login
Scenario: Verify whether the user is able to login with valid credentials

Given I launch the application
And I Navigate to Login page
When I enter username "root@gmail.com" and password "root"
Then I should be login successfully

@Login @two

Scenario: Verify the user is not able to login with invalid Credentials
Given I launch the application
And I Navigate to Login page
When I enter username "root3@gmail.com" and password "root"
Then I should see an error message informing the user about invalid credentails

@Login @three

Scenario: Verify the user is not able to login without providing Credentials
Given I launch the application
And I Navigate to Login page
When I enter username "" and password ""
Then I should see an error message informing the user about invalid credentails

@Login @four

Scenario: Verify the user is able to reset the forgotten password
Given I launch the application
And I Navigate to Login page
When i reset the forgotten password for email "root@gmail.com"
Then i should see a message informing that the password reset detailshave been sent to email page


