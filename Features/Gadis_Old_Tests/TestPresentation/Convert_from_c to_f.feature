Feature: Check that the Converting Celsius to Fahrenheit works well positive test.

  @TestNum1
  @TestNumMob2
  Scenario: 01 - Open metric Conversions site.
    Given User navigate to a config "Web_page" Page
    And I wait for "1000" milliseconds

  @TestNum1
  @TestNumMob2
  Scenario: 02 - Choosing Temperture option
    And Scroll down and press the object bycss "#mainLinks > a:nth-child(3)"

  @TestNum1
  Scenario: 03 - Entering 10 as a Temperture to convert to fahrenheit
    And User enter the text to field css "#argumentConv" with the value "10"
    And I wait for "4000" milliseconds

  @TestNumMob2
  Scenario: 04 - Mobile Entering 10 as a Temperture to convert to fahrenheit
    And User enter the text to field css "#argumentConvMob" with the value "10"
    And I wait for "4000" milliseconds

  @TestNum1
  Scenario: 05 - Validating for web browser that the result is 10°C= 50.00000°F
    Then I validate the input Text by CssSelector InnerText "#answer" With the Value "10°C= 50.00000°F"
    And I wait for "3000" milliseconds


  @TestNumMob2
  Scenario: 06 - Mobile Validating for mobile that the result is 10°C= 50.00000°F.
    And User Send keyboard key Enter
    And I wait for "1000" milliseconds
    Then I validate the text by xpath "//*[@id="mobileAnswer"]" that the Value is "10°C= 50.00000°F"
    And I wait for "3000" milliseconds


