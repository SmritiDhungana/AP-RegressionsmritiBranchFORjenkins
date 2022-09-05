Feature: Tractor Vendor Relationship Process Feature

  @TractorVendorRelationship
  Scenario Outline: Validate Tractor Vendor Relationship with VendorID in Launch Environment
    Given Run Test for Environment <environment> on Browser <browser> for EBH Tractors and Enter the url
    And Login to the EBH with username <username> and password <password> for EBH Tractors
    And Navigate to the Corporate Page on Main Menu then to the Settlements page for EBH Tractors
    Given Navigate to Tractor Vendor Relationship
    And Enter Unit Number <unitNumber> and click on Search
  #  And Click on View, Click on Edit
    Then Close all open Browsers on EBH for Tractors
    Examples:
      | unitNumber | ownerId | vendor | environment  | browser  | username     | password      | tableName |
      | "172270"    | ""      | ""     | "ebhstaging" | "chrome" | "SmritiTest" | "Legendary@1" | ""        |