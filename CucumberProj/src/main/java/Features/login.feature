@sanity @prodnew
Feature: Login
  BackGround :
  Given user able to navigates to facebook
  When user validates the homepage title

  Scenario: In oder to loging FaceBook
    Then user entered "valid" username
    And user entered "valid" password
    Then user "shouldbe" succesfully login

  Scenario Outline: In oder to loging FaceBook with invalid User
    Given user able to navigates to facebook
    When user validates the homepage title
    Then user entered "<username>" username
    And user entered "<password>" password
    And user select the age category
      | age      | location |
      | below 18 | india    |
      | above 21 | USA      |
    Then user "<logintype>" succesfully login

    Examples: 
      | username | password | logintype |
      | valid    | valid    | should    |
      | invalid  | invalid  | shouldnot |
