@AuthenticateEmail
Feature: AuthenticateEmail
  Test API :  https://safranrisk-api-test.azurewebsites.net/api/Account/AuthenticateEmail
  
	Background:
	 * url baseUrl
	 * def apiUrl = 'Account/AuthenticateEmail'


  Scenario: Positive Scenario
    Given path apiUrl
    And params { tenant: "tester", apiKey: "81e1c4e3-153f-426b-8aef-1e0c85da32d8", email:"test@safran.com"}
    When method get
    Then status 200
    * def expResponse = read('classpath:expectedresponse/ExpAuthenticateEmailSchema.json')
    * match response == expResponse
  
  Scenario: Negative Scenario Invalid Parameters
    Given path apiUrl
    And params { tenant: "tester", apiKey: "81e1c4e3-153f-426b-8aef-1e0c85da32d8", email:"test1@safran.com"}
    When method get
    Then status 400
    * def expResponse = read('classpath:expectedresponse/ExpAuthenticateEmailInvalidParamSchema.json')
    * match response == expResponse
    
  Scenario: Negative Scenario Invalid Token
 		Given path apiUrl
    And params { tenant: "tester", apiKey:"81e1c4e3-153f-426b-8aef-1e0c85da32d83",email:"test1@safran.com"}
    When method get
    Then status 400
		* def expResponse = read('classpath:expectedresponse/ExpAuthenticateEmailInvalidApikeySchema.json')
    * match response == expResponse