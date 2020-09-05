Feature: Search scenario functionality

@Search @one
Scenario: Verify user is able to search for products
Given I launch the application
		When I search for a product "Samsung SyncMaster 941BW"
		Then I should see the product in the search resultsil address
		
@Search @two
Scenario: Verify user is informed when product being search is not available
Given I launch the application
		When I search for a product "Apple iPhone"
		Then I should see the page displaying the message "There is no product that matches the search criteria."		