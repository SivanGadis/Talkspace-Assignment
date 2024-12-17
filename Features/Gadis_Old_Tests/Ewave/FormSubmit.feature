@Test11

Feature: Check that the Converting Celsius to Fahrenheit works well positive test.

  Scenario: 01 - Open metric Conversions site.
    Given User navigate to a config "Web_page2" Page
    And I wait for "1000" milliseconds

    And User Force press on element "#mainForm > div.btns.mb-5 > button"
    #And Users press the button by css "#mainForm > div.btns.mb-5 > button"
    #And Users press the button by cssselector "#mainForm > div.btns.mb-5 > button"
    And I wait for "5000" milliseconds