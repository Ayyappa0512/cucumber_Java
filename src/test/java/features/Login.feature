Feature: Login feature

  Scenario Outline: Login with valid credentials
    Given Enter the URl
    When Login with userId as "<userId>", companyId as "<companyId>" and password as "<password>"
    Then Verify the Home page landing screen
    Examples:
    |userId|companyId|password   |
    |user1 |PCR1     |Welcome@123|
    |user2 |PCR1     |Welcome@123|

