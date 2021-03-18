@bvt @prod
Feature: Login to Production

Scenario: In oder to loging FaceBook

Given user able to navigates to facebook
When user validates the homepage title
Then user entered "valid" username
And user entered "valid" password
And user validate to capture image
Then user "shouldbe" succesfully login

Scenario: In oder to loging FaceBook

Given user able to navigates to facebook
When user validates the homepage title
Then user entered "Farjana" username
And user entered "123467" password
And user validate to capture image
Then user "shouldnot" succesfully login


