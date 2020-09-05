Feature: RegistrationFunctionalityScenarios
@One @Register
Scenario: Verify Whether the user is able to register into the application by providing all details

Given I launch the application
And I Navigate to Account registration page
When I fill all the below valid details
|FirstName|joe|
|LastName|root|
|E-Mail|root@gmail.com|
|Telephone|1234567890|
|Password|root|
|PasswordConfirm|root|
And I Select on Privacy Policy
And I click on continue
Then I should see user account has successfully created
@Two @Register
Scenario: Whether the user is not allowed to register on skipping the mandatory field
Given I launch the application
And I Navigate to Account registration page
When I click on continue
Then user account is not created
And i should see the error message informing the user to fill mandatory fields

@Three @Register
Scenario: Verify Whether the user is able to register into the application by opting newsletter subscribtion

Given I launch the application
And I Navigate to Account registration page
When I fill all the below valid details
|FirstName|joe|
|LastName|root|
|E-Mail|root@gmail.com|
|Telephone|1234567890|
|Password|root|
|PasswordConfirm|root|
And Select Yes on Subscribe
And I Select on Privacy Policy
And I click on continue
Then I should see user account has successfully created

@Four @Register
Scenario: Verify the user is restricted from creating a duplicate account

Given I launch the application
And I Navigate to Account registration page
When I fill all the below duplicate details
|FirstName|joe|
|LastName|root|
|E-Mail|root@gmail.com|
|Telephone|1234567890|
|Password|root|
|PasswordConfirm|root|
And Select Yes on Subscribe
And I Select on Privacy Policy
And I click on continue
Then I should see user is restricted from creating duplicate account