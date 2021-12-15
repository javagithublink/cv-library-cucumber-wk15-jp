Feature: Tester Job search
  As a user I should be able to search jobs using multiple criteria

  @Smoke
  Scenario Outline: User is able to get job search results successfully
    When   User enters Job Title "<jobTitle>"
    And    User enters Location "<location>"
    And    User enters Distance "<distance>"
    And    User clicks on 'More Search Options'
    And    User enters "<salaryMin>" as minimum salary
    And    User enters "<salaryMax>" as maximum salary
    And    User selects Salary Type "<salaryType>" from dropdown menu
    And    User selects Job Type "<jobType>" from dropdown menu
    And    User clicks on 'Find Jobs' button
    Then   User is able see job search results successfully under header message "<message>"
    Examples:
      | jobTitle | location  | distance       | salaryMin | salaryMax | salaryType | jobType   | message                                     |
      | Tester   | Harrow    | up to 5 miles  | 30000     | 500000    | Per annum  | Permanent | Permanent Tester jobs in Harrow on the Hill |
      | Tester   | Wembley   | up to 7 miles  | 30000     | 500000    | Per annum  | Contract  | Contract Tester jobs in Wembley             |
      | Tester   | Watford   | up to 10 miles | 30000     | 500000    | Per annum  | Temporary | Temporary Tester jobs in Watford            |
      | Tester   | Dunstable | up to 15 miles | 30000     | 500000    | Per annum  | Permanent | Permanent Tester jobs in Dunstable          |
      | Tester   | Ealing    | up to 25 miles | 30000     | 500000    | Per annum  | Contract  | Contract Tester jobs in Ealing              |
      | Tester   | Stanmore  | up to 35 miles | 30000     | 500000    | Per annum  | Temporary | Temporary Tester jobs in Stanmore           |