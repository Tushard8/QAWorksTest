Feature: ContactUs.feature

  @one
  Scenario: Contact Us1
    Given I am on QAWorks Site
    Then I should be able to contact QA Works with the following information
    |name|J.Bloggs|
    |email|J.Bloggs@Qaworks.com|
    |message|Please contact me I want to find out more|


  #Scenario: some scenario
    #Given I am on 4th Page #Context
    #When I am on 4th Page  #Action
    #Then I am on 4th Page  #Verification\Final Check

  Scenario: Picking Test Data from Propert File
    Given I am on ContactUs Page
    When I submit ContactUs Page
    Then Summary Pagge is displayed


  Scenario: Error Message id displayed
    Given I am on ContactUs Page
    When I submit empty ContactUs Page
    Then Error Message is displayed on COntactUs Page