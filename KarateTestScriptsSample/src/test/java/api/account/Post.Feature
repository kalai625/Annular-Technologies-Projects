@Risk
Feature: ConsequenceImpact GetAll
  Test API : https://srmapiv2.azurewebsites.net/api/Risk/GetAll
            
  Background: 
    * url baseUrl
    * def apiUrl = 'Risk/GetAll'
   
    @GetAllRisks 
    Scenario: Get All Risks(Positive Scenario)
    Given path apiUrl    
    And header Authorization = 'Bearer '+ authToken
    And header Accept = 'application/json'    
    When method get
    Then status 200        
    * def expResponse = read('classpath:expectedresponse/ExpRiskResponseSchema.json')     
	  * match  response each contains expResponse 
	  
	  Scenario: Get All Risks (Negative Scenario Invalid Token)
    Given path apiUrl
    And header Authorization = 'Bearer '+ invalidAuthToken
    When method get
    Then status 401