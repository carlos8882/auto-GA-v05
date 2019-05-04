# Admin management feature review the behavior in this feature
Feature: Admins management crud of users and behavior of page

  Scenario: Admins user added
    Given set my credentials on 'Login' page
    And go to admins page
#    When go to admins page
    And click add Button
    Then fill form to create admin user
    #Then fill form to create admin user "1"

  Scenario: Admin user updated
#    Given set my credentials on 'Login' page
#    When go to admins page
#    And click add Button
#    And fill form to create admin user "0"
    Given go to admins page
    When click add Button
    And fill form to create admin user then edit
    And click on edit button
    Then Verify fields were updated

  Scenario: Admin user deleted
#    Given set my credentials on 'Login' page
#    When go to admins page
    Given go to admins page
    And click add Button
    And fill form to create admin user
    Then Delete user created

  Scenario: Admin user searched by First Name
#    Given set my credentials on 'Login' page
#    When go to admins page
    Given go to admins page
    And Click on Search button
#    And Click on DropDwnFirst
    And Click on DropDwn "F"
    And Enter a name for the first name search
    And Click on Go button
    Then Verify that search by First Name was success

  Scenario: Admin user searched by Last Name
#    Given set my credentials on 'Login' page
#    When go to admins page
    Given go to admins page
    And Click on Search button
    And Click on DropDwn "L"
    And Enter a name for the last name search
    And Click on Go button
    Then Verify that search by Last Name was success

  Scenario: Admin user searched by Email
#    Given set my credentials on 'Login' page
#    When go to admins page
    Given go to admins page
    And Click on Search button
    And Click on DropDwn "E"
    And Enter an email for the email search
    And Click on Go button
    Then Verify that search by Email was success

  Scenario: Admin user searched by Active
#    Given set my credentials on 'Login' page
#    When go to admins page
    Given go to admins page
    And Click on Search button
    And Click on DropDwn "Active"
#    And Enter an email for the email search
    And Click on Go button
    Then Verify that search by Active was success

  Scenario: Admin users ordered by First Name
#    Given set my credentials on 'Login' page
#    When go to admins page
    Given go to admins page
    When Click on header First Name column
    Then Verify grid was sorted descentantly



#  Scenario Outline: Admin users ordered by <column>
##    Given set my credentials on 'Login' page
##    When go to admins page
#    Given go to admins page
#
#Examples:
#    | column     |
#    |  FirstName |g