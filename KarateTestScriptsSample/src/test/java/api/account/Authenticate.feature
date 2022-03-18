Feature: SRM API Authentication
  for help, see: https://safranrisk-api-test.azurewebsites.net/swagger/index.html

  Background: 
    * url 'https://safranrisk-api-test.azurewebsites.net/api/'

  Scenario: Authentication Test
    Given path 'Account/Authenticate'
    And header Authorization = 'SRMApiKey:81e1c4e3-153f-426b-8aef-1e0c85da32d8'
    And header Content-Type = 'application/json'
    And header Tenant = 'automation'
    And header Accept = 'application/json'
    And request { "username":"tester", "password":"T3S73r@2021"}
    And params { tenant:'automation'}
    When method post
    * def token = response.token
    Then status 200
    And print token