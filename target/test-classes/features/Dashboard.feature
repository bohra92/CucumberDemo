@dashboard
Feature: Dashboard Scenarios

Background:
		Given I am at Orange HRM Login portal

  @cards
  Scenario Outline: Check the title of the cards
    When I provide valid credentials with "<username>" and "<password>" in Login portal
    Then I check the title of the cards
    |Title															|
    |Time at Work												|
    |My Actions													|
    |Quick Launch												|
    |Buzz Latest Posts									|
    |Employees on Leave Today						|
    |Employee Distribution by Sub Unit	|
    |Employee Distribution by Location	|
    
    Examples:
			|username	|password	|User							|
			|Admin		|admin123	|Dashboard				|
    
    @quickLaunch
    Scenario Outline: Check the buttons of the Quick Launch
    When I provide valid credentials with "<username>" and "<password>" in Login portal
    Then I check the quick launch buttons
    |Button					|
    |Assign Leave		|
    |Leave List			|
    |Timesheets			|
    |Apply Leave		|
    |My Leave				|
    |My Timesheet		|
    
    Examples:
			|username	|password	|User							|
			|Admin		|admin123	|Dashboard				|
  