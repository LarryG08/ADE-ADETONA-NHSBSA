Feature: Searching for Job
  As a jobseeker on NHS Jobs website
  I want to search for a job with my preferences
  So that I can get recently posted job results

  Scenario Outline: User can successfully search for jobs matching their preferences
    Given I navigate to the NHS Jobs search homepage
    When I enter my search "<keyword>" in the what field
    And I enter "<location>" in the where field
    And I select the search "<distance>"
    And I click on Search button
    And I verify that search result page is displayed
    Then I should get a list of jobs which matches my preferences sorted with the newest Date Posted

    Examples: Test Data for Job Search
      | keyword | location | distance  |
      | Nurse   | London   | +50 Miles |
      | Doctor  | EC4M     | +20 Miles |
