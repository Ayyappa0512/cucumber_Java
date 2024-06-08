package stepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.LoginPage;

import java.time.Duration;

public class Steps {

    public static WebDriver driver;
    public static WebDriverWait wait;

    public LoginPage loginPage;

    @Given("Enter the URl")
    public void enter_the_u_rl() {
            System.out.println("1st step");
            driver = new ChromeDriver();
            driver.get("https://demo.olbanking.com/onlineMessenger");
            wait = new WebDriverWait(driver, Duration.ofSeconds(15));
            System.out.println("Loaded URL"+driver.getCurrentUrl());
    }
    @When("Login with userId as {string}, companyId as {string} and password as {string}")
    public void login_to_the_application(String userId, String companyId, String password) {
        System.out.println("2st step");
        loginPage = new LoginPage(driver);
        loginPage.enterCompanyId(wait,companyId);
        loginPage.enterUserId(wait,userId);
        loginPage.clickLoginButton(wait);
        loginPage.enterPassword(wait,password);
        System.out.println("Login button clicked");
    }
    @Then("Verify the Home page landing screen")
    public void verify_the_home_page_landing_screen() {
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
