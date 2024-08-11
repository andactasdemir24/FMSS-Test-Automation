package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class loginPage {

    private String pageSource = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
    private String usernameXPath = "//input[@name='username']";
    private String passwordXPath = "//input[@type='password']";
    private String loginButtonXPath = "//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']";

    private WebDriver driver;
    private WebDriverWait wait;

    public void source() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.navigate().to(pageSource);
    }

    public void enterUsername(String username) {
        WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(usernameXPath)));
        usernameField.sendKeys(username);
    }

    public void enterPassword(String password) {
        WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(passwordXPath)));
        passwordField.sendKeys(password);
    }

    public void clickLoginButton() {
        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(loginButtonXPath)));
        loginButton.click();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public WebDriverWait getWait() {
        return wait;
    }

    public void setUsernameXPath(String usernameXPath) {
        this.usernameXPath = usernameXPath;
    }

    public void setPasswordXPath(String passwordXPath) {
        this.passwordXPath = passwordXPath;
    }

    public void setLoginButtonXPath(String loginButtonXPath) {
        this.loginButtonXPath = loginButtonXPath;
    }

    public void setPageSource(String pageSource) {
        this.pageSource = pageSource;
    }
}
