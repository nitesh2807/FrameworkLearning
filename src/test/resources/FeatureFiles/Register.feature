Feature: RegistrationFunctionalityScenarios
@Reg
Scenario: Verify Whether the user is able to register into the application bt providing all details

Given I launch the application
And I Navigate to Account registration page
When I fill all the below valid details
|First Name|joe|
|Last Name|root|
|E-Mail|root@gmail.com|
|Telephone|1234567890|
|Password|root|
|Password Confirm|root|
And Select Yes on Subscribe
And I Select on Privacy Policy
And I click on continue
Then I should see user account has successfully created
