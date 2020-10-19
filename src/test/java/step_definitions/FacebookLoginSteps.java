package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;

import pages.LoginPage;
import utilities.ConfigurationReader;
import utilities.Driver;


public class FacebookLoginSteps {

    LoginPage loginPage = new LoginPage();


    @Given("^user is on Facebook login page$")
    public void user_is_on_Facebook_login_page() throws Throwable {

        Driver.getDriver().get(ConfigurationReader.getProperty("baseUrl"));

    }

    @When("^user enters email and password$")
    public void user_enters_email_and_password() throws Throwable {
        loginPage.emailOrPhoneNumberInputField.click();
        loginPage.emailOrPhoneNumberInputField.sendKeys(ConfigurationReader.getProperty("email"));
        loginPage.emailOrPhoneNumberInputField.click();
        loginPage.passwordInputField.sendKeys(ConfigurationReader.getProperty("password"));


    }

    @When("^user clicks login button$")
    public void user_clicks_login_button() throws Throwable {
        loginPage.logInButton.click();

    }

    @Then("^user should be in profile page$")
    public void user_should_be_in_profile_page() throws Throwable {


    }

    @When("^user inputs \"([^\"]*)\" in search field and presses enter keyboard$")
    public void user_inputs_in_search_field_and_presses_enter_keyboard(String fetchRewards) throws Throwable {

        WebElement searchField = Driver.getDriver().findElement(By.xpath("//input[@type='search']"));
        searchField.click();
        searchField.sendKeys(fetchRewards + Keys.ENTER);
    }

    @Then("^user should see Fetch Rewards profile page$")
    public void user_should_see_Fetch_Rewards_profile_page() throws Throwable {
        Assert.assertTrue(Driver.getDriver().getPageSource().contains("Fetch Rewards"));


    }


    @When("^user goes to Fetch Rewards page$")
    public void user_presses_like_button() throws Throwable {
      WebElement element= Driver.getDriver().findElement(By.xpath("(//span[@class='b3onmgus'])[1]"));
      JavascriptExecutor js= (JavascriptExecutor)Driver.getDriver();
      js.executeScript("arguments[0].click();",element);
    }

    @When("^user clicks like button$")
    public void userGoesToFetchRewardsPage() throws InterruptedException {
        Driver.getDriver().findElement(By.xpath("//span[text()='Like']")).click();


    }

    @Then("^like button should be displayed as liked$")
    public void like_button_is_displayed_as_liked() throws Throwable {
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//span[text()='Liked']")).getText().contains("Liked"));
    }


}
