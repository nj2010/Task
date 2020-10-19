$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/facebookLogin.feature");
formatter.feature({
  "line": 2,
  "name": "Facebook Login",
  "description": "",
  "id": "facebook-login",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Smoke"
    },
    {
      "line": 1,
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "duration": 174911,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Log in  with email",
  "description": "",
  "id": "facebook-login;log-in--with-email",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is on Facebook login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters email and password",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user clicks login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user should be in profile page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user inputs \"Fetch Rewards\" in search field and presses enter keyboard",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user should see Fetch Rewards profile page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user goes to Fetch Rewards page",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "user clicks like button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "like button should be displayed as liked",
  "keyword": "Then "
});
formatter.match({
  "location": "FacebookLoginSteps.user_is_on_Facebook_login_page()"
});
formatter.result({
  "duration": 13087195685,
  "status": "passed"
});
formatter.match({
  "location": "FacebookLoginSteps.user_enters_email_and_password()"
});
formatter.result({
  "duration": 799992222,
  "status": "passed"
});
formatter.match({
  "location": "FacebookLoginSteps.user_clicks_login_button()"
});
formatter.result({
  "duration": 4620873416,
  "status": "passed"
});
formatter.match({
  "location": "FacebookLoginSteps.user_should_be_in_profile_page()"
});
formatter.result({
  "duration": 35279,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Fetch Rewards",
      "offset": 13
    }
  ],
  "location": "FacebookLoginSteps.user_inputs_in_search_field_and_presses_enter_keyboard(String)"
});
formatter.result({
  "duration": 1988471880,
  "status": "passed"
});
formatter.match({
  "location": "FacebookLoginSteps.user_should_see_Fetch_Rewards_profile_page()"
});
formatter.result({
  "duration": 588199900,
  "status": "passed"
});
formatter.match({
  "location": "FacebookLoginSteps.user_presses_like_button()"
});
formatter.result({
  "duration": 5275526729,
  "status": "passed"
});
formatter.match({
  "location": "FacebookLoginSteps.userGoesToFetchRewardsPage()"
});
formatter.result({
  "duration": 4494749614,
  "status": "passed"
});
formatter.match({
  "location": "FacebookLoginSteps.like_button_is_displayed_as_liked()"
});
formatter.result({
  "duration": 2046158394,
  "status": "passed"
});
formatter.after({
  "duration": 3923605524,
  "status": "passed"
});
});