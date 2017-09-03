Feature: ContactUs.feature

  @one
  Scenario: Submit ContactUs form with your details to know more about QAWorks Services offerings
    Given I am on QAWorks Site
    Then I should be able to contact QA Works with the following information
      | name    | J.Bloggs                                  |
      | email   | J.Bloggs@Qaworks.com                      |
      | message | Please contact me I want to find out more |

  Scenario: Picking Test Data from Property File
    Given I am on ContactUs Page
    When I submit ContactUs Page
    Then Summary Pagge is displayed


  Scenario: Submit ContactUs form without details and check if any Error Message displayed
    Given I am on ContactUs Page
    When  I submit empty ContactUs Page
    Then  Error Message is displayed on COntactUs Page