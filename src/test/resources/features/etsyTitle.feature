Feature: Etsy search functionality and Verification

  Scenario: Etsy Title Verification
    When User is on Etsy home page
    Then User sees title is as expected

    @wip
  Scenario: Etsy Title Verification
    Given User is on Etsy home page
    When User types Wooden Spoon in the search box
    And User clicks search button
    Then User sees Wooden Spoon is in the title

      Scenario: Etsy Title Verification
      Given User is on Etsy home page
      When User types "Wooden Spoon" in the search box
      And User clicks search button
      Then User sees "Wooden spoon" is in the title

  Scenario: Etsy Title Verification
  Given User is logged into SmartBear Tester account and on Order page
  When User fills out the form as followed:
  Then User selects FamilyAlbum from product dropdown
  And User enters 4 to quantity
  Given User enters John Wick to costumer name
  When User enters Kinzie Ave to street
  Then User enters Chicago to city
  And User enters IL to state
  And User enters 60056
  Given User selects Visa as card type
  When User enters 1111222233334444 to card number
  Then User enters 12/22 to expiration date
  And User clicks process button
  Then User verifies John Wick is in the list

