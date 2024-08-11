package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.loginPage;

public class LoginTest {
    loginPage login = new loginPage();

    @Given("User lands on Login page")
    public void userLandsOnLoginPage() {
        login.source();
    }

    @When("The user enters their username")
    public void theUserEntersTheirUsername() {
        login.enterUsername("Admin");
    }

    @Then("The user enters their password")
    public void theUserEntersTheirPassword() {
        login.enterPassword("admin123");
    }

    @And("The user clicks the login button")
    public void theUserClicksTheLoginButton() {
        login.clickLoginButton();
        login.getDriver().quit();
    }

    @When("The user enters their wrong {string}")
    public void theUserEntersTheirWrong(String username) {
        login.enterUsername(username);
    }

    @Then("The user enter their wrong {string}")
    public void theUserEnterTheirWrong(String password) {
        login.enterPassword(password);
    }

    @And("the user click the login button")
    public void theUserClickTheLoginButton() {
        login.clickLoginButton();
        login.getDriver().quit();
    }
}
