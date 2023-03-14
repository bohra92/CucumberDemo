@Login
Feature: Login to Orange HRM with different scenarios

  @LoginPass
  Scenario Outline: Providing valid Login Creds to OrangeHRM Login
    Given I am at Orange HRM Login portal
    When I provide valid credentials with "<username>" and "<password>" in Login portal 
    Then I verify the "<status>"
    
    Examples:
			|username	|password	|Status	|
			|Admin		|admin123	|pass		|
			

