@Login
Feature: Login to Orange HRM with different scenarios

  @LoginPass
  Scenario Outline: Providing valid Login Creds to OrangeHRM Login
    Given I am at Orange HRM Login portal
    When I provide valid credentials with "<username>" and "<password>" in Login portal 
    Then I verify the "<User>"
    
    Examples:
			|username	|password	|User							|
			|Admin		|admin123	|Dashboard				|
			
			
  @LoginFail
  Scenario Outline: Providing valid Login Creds to OrangeHRM Login
    Given I am at Orange HRM Login portal
    When I provide invalid credentials with "<username>" and "<password>" in Login portal 
    Then I verify the Error Icon
    And I verify Error message "<ErrorStatus>"
    
    Examples:
			|username	|password	|ErrorStatus						|
			|Admin1		|admin123	|Invalid credentials		|
			|Admin		|admin12	|Invalid credentials		|
			
			
					

