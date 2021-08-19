Feature: Test User API
  Background:
    * url apiURL
    Scenario: Get all products
      Given url 'http://localhost:8080/'
      And path 'products'
      When method GET
      Then status 200


  Scenario: Get product by id
    Given url 'http://localhost:8080/'
    And path 'products/id'
    And request {id:"", name:"Soumare",price:"123158" , color:"Green"}
    When method GET
    Then status 200


  Scenario: Create a new  product
    Given url 'http://localhost:8080/'
    And path 'products'
    When method POST
    Then status 200

    
  Scenario: Delete a product by id
    Given url 'http://localhost:8080/'
    And path 'products/id'
    And request {id:"", name:"Diagne",price:"123158" , color:"red"}
    When method DELETE
    Then status 200





