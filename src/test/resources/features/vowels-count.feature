Feature: determine how many vowels there are in some text



  Scenario Outline: text with vowels
    Given I enter the text <input>
    When I test given text for vowels
    Then I should get result <output>


    Examples:
      | input | output |
      | "Hello Friend" | 4 |
      | "1234567890"   | 0 |





