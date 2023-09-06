package Homework.pageobject;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

public class RegisterPage {


    static WebDriver driver;
    WebDriverWait wait;



    @FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/p[2]/div/a")
    public WebElement registerLink;

    @FindBy(tagName = "h2")
    public WebElement loginPageBtn;
    @FindBy(id = "username")
    public WebElement usernameInputField;

    @FindBy(id = "password")
    public WebElement passwordField1;

    @FindBy(id = "password2")
    public WebElement ConfirmPassword;

    @FindBy(id = "Mr")
    public WebElement MrRadioButton;
    @FindBy(id = "Ms")
    public WebElement MsRadioButton;

    @FindBy(id = "input-first-name")
    public WebElement firstNameInput;

    @FindBy(id = "input-last-name")
    public WebElement lastNameInput;

    @FindBy(id = "input-email")
    public WebElement emailField;

    @FindBy(id = "input-dob")
    public WebElement DateInput;

    @FindBy(id = "input-nationality")
    public WebElement nationalityField;

    @FindBy(id = "terms")
    public WebElement termsField;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement submitBtn;

    @FindBy(css = "[class = 'form-error']")
    public WebElement formError;


    public RegisterPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.of(20, ChronoUnit.SECONDS));
        PageFactory.initElements(driver, this);
    }

    public void goToRegisterPage() {
        driver.get("https://adimoldovan.github.io/web-stubs/signup");
        wait.until(ExpectedConditions.elementToBeClickable(usernameInputField));
    }

    public void submitButton() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.querySelector('.btn.btn-primary').scrollIntoView();");
        TimeUnit.SECONDS.sleep(1);
        submitBtn.click();
    }



}
