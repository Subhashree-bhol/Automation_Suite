Feature: Scenarios feature file

  Scenario: firefox
    Given I intialize "firefox" browser
    And i browse to url "https://grayjay.applause.stream/"
    And user waits for 10 sec
    Then i click on xpath "//a[text()='How It Works']"
    And i click on xpath "//a[text()='Sign In']"
    Then i click on xpath "//a[text()='Create An Event']"
    And i click on xpath "//a[text()='Help']"
