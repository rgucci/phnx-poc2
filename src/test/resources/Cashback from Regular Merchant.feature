Feature: 1% cashback from regular merchant

  Scenario: customer pays 100
    Given a regular merchant
    When customer pays 100
    Then customer receives 1.00
  
  Scenario: customer pays 10
    Given a regular merchant
    When customer pays 10
    Then customer receives 0.01
    
  Scenario: customer pays 500
    Given a regular merchant
    When customer pays 500
    Then customer receives 5.00
