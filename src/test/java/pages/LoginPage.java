package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {


    public WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver =driver;
    }

    public static WebElement getElement(WebDriverWait wait,By by){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    private final By companyIdLocator = By.xpath("//input[@id='company']");
    private final By userIdLocator = By.xpath("//input[@id='user']");
    private final By loginBtnLocator = By.xpath("//button[@id='login']");
    private final By passwordLocator = By.xpath("//input[@id='passwordPrompt']");

    public void enterCompanyId(WebDriverWait wait,String companyId){
        getElement(wait, companyIdLocator).sendKeys(companyId);
    }

    public void enterUserId(WebDriverWait wait,String userId){
        getElement(wait, userIdLocator).sendKeys(userId);
    }
    public void clickLoginButton(WebDriverWait wait){
        getElement(wait, loginBtnLocator).click();
    }

    public void enterPassword(WebDriverWait wait,String password){
        getElement(wait, passwordLocator).sendKeys(password);
    }


}
