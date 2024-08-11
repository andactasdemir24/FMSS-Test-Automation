package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.searchPage;

import java.time.Duration;

public class searchTest {
    private WebDriverWait wait;
    private WebDriver driver;
    searchPage searchPage = new searchPage();

    @Given("User logs in")
    public void userLogsIn() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.navigate().to(searchPage.pageSource);
        WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
        usernameField.sendKeys("Admin");

        WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']")));
        passwordField.sendKeys("admin123");

        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")));
        loginButton.click();
    }

    @Then("User lands on Admin Module")
    public void userLandsOnAdminModule() {
        WebElement adminModuleLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(searchPage.adminModuleLinkXpath)));
        adminModuleLink.click();
    }

    @When("The user select their User Role")
    public void theUserSelectTheirUserRole() {
        WebElement userRolesTextboxClick = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='oxd-select-text oxd-select-text--active']/div[@tabindex='0'])[1]")));
        userRolesTextboxClick.click();

        WebElement secondOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@role='listbox']//div[@role='option'][2]")));
        secondOption.click();
    }

    @And("The user clicks the search button")
    public void theUserClicksTheSearchButton() {
        WebElement searchButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(searchPage.searchButtonXpath)));
        searchButton.click();
        driver.quit();
    }

    @Then("User lands on Buzz Module")
    public void userLandsOnBuzzModule() {
        WebElement buzzModuleLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(searchPage.buzzModuleLinkXpath)));
        buzzModuleLink.click();
    }

    @When("type something in the textbox {string}")
    public void typeSomethingInTheTextbox(String text) {
        WebElement postField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(searchPage.postFieldXpath)));
        postField.sendKeys(text);
    }

    @And("The user clicks the Post button")
    public void theUserClicksThePostButton() {
        WebElement postButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(searchPage.postButtonXpath)));
        postButton.click();
        driver.quit();

    }

    @When("User lands on Performance Module")
    public void userLandsOnPerformanceModule() {
        WebElement performanceModuleLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(searchPage.performanceModuleLinkXpath)));
        performanceModuleLink.click();
    }

    @Then("Selects My Tracker module from four titles")
    public void selectsMyTrackerModuleFromFourTitles() {
        WebElement selectTitle = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(searchPage.myTrackerModuleXpath)));
        selectTitle.click();
    }

    @Then("goes to the details of the registered user")
    public void goesToTheDetailsOfTheRegisteredUser() {
        WebElement viewButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(searchPage.viewButtonXpath)));
        viewButton.click();
    }

    @And("clicks the add log button")
    public void clicksTheAddLogButton() {
        WebElement addLogButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(searchPage.addLogButtonXpath)));
        addLogButton.click();
    }

    @And("fills the {string} and {string} fields and saves by pressing the save button")
    public void fillsTheAndFieldsAndSavesByPressingTheSaveButton(String log, String comment) {
        WebElement logField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(searchPage.logFieldXpath)));
        logField.sendKeys(log);
        WebElement commentField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(searchPage.commentFieldXpath)));
        commentField.sendKeys(comment);
        WebElement saveButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(searchPage.saveButtonXpath)));
        saveButton.click();
        driver.quit();

    }

    @When("User lands on Recruitment Module")
    public void userLandsOnRecruitmentModule() {
        WebElement recruitmentModuleLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(searchPage.recruitmentModuleLinkXpath)));
        recruitmentModuleLink.click();
    }

    @And("the user clicks on Vacancies")
    public void theUserClicksOnVacancies() {
        WebElement vacanciesModuleLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(searchPage.vacanciesModuleLinkXpath)));
        vacanciesModuleLink.click();
    }

    @Then("Click on the Vacancy sort item and Sort by descending")
    public void clickOnTheVacancySortItemAndSortByDescending() {
        WebElement vacancySortItem = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(searchPage.vacancySortItemXpath)));
        vacancySortItem.click();
        WebElement sortDescending = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(searchPage.sortDescendingXpath)));
        sortDescending.click();
        driver.quit();

    }

    @When("User lands on My Info Module")
    public void userLandsOnMyInfoModule() {
        WebElement myInfoModuleLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(searchPage.myInfoModuleLinkXpath)));
        myInfoModuleLink.click();
    }

    @Then("the user click on Contact Details")
    public void theUserClickOnContactDetails() {
        WebElement contactDetailsClick = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(searchPage.contactDetailsClickXpath)));
        contactDetailsClick.click();
    }

    @And("Change the work email fields")
    public void changeTheWorkEmailFields() {
        WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(searchPage.emailFieldXpath)));
        emailField.sendKeys("Home");
    }

    @And("Click save button")
    public void clickSaveButton() {
        WebElement saveButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(searchPage.saveButtonXpath)));
        saveButton.click();
        driver.quit();
    }

    @When("User lands on Claim Module")
    public void userLandsOnClaimModule() {
        WebElement claimModuleLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(searchPage.claimModuleLinkXpath)));
        claimModuleLink.click();
    }

    @Then("the user click on Assign Claim button")
    public void theUserClickOnAssignClaimButton() {
        WebElement assignClaimButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(searchPage.assignClaimButtonXpath)));
        assignClaimButton.click();
    }

    @And("fills the {string} and {string} fields")
    public void fillsTheAndFields(String arg0, String arg1) {
        WebElement logField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Type for hints...']")));
        logField.sendKeys("Ranga Ankunuri");
        WebElement tek = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@role='listbox']//div[@role='option']")));
        tek.click();

        WebElement eventTextboxClick = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='oxd-select-text oxd-select-text--active']/div[@tabindex='0'])[1]")));
        eventTextboxClick.click();
        WebElement firstOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@role='listbox']//div[@role='option'][2]")));
        firstOption.click();

        WebElement currencyTextboxClick = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='oxd-select-text oxd-select-text--active']/div[@tabindex='0'])[2]")));
        currencyTextboxClick.click();
        WebElement thirdOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@role='listbox']//div[@role='option'][2]")));
        thirdOption.click();

    }

    @And("Click create button")
    public void clickCreateButton() {
        WebElement createButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(searchPage.saveButtonXpath)));
        createButton.click();
        driver.quit();

    }

    @When("User lands on Profile Module")
    public void userLandsOnProfileModule() {
        WebElement profileModuleLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(searchPage.profileModuleLinkXpath)));
        profileModuleLink.click();
    }

    @And("click logout button")
    public void clickLogoutButton() {
        WebElement logoutButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(searchPage.logoutButtonXpath)));
        logoutButton.click();
        driver.quit();
    }

}
