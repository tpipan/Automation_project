package Course_08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

@Test
public class LoginTest {
    private WebDriver driver;

    @DataProvider(name = "LoginDataProvider")
    public Iterator<Object[]> loginDataProvider() {
        Collection<Object[]> dp = new ArrayList<Object[]>();
        dp.add(new String[]{"", "", "Please enter your username", "Please enter your password", ""});
        dp.add(new String[]{"SomeUser", "somePassword", "", "", "Incorrect username or password"});
        return dp.iterator();
    }

    @Test(dataProvider = "LoginDataProvider")
    public void loginTest(String username, String password, String userError, String passwordError, String generalError) {
        WebElement usernameField = driver.findElement(By.id("input-login-username"));
        usernameField.clear();
        usernameField.sendKeys(username);

        WebElement passwordField = driver.findElement(By.id("input-login-password"));
        passwordField.clear();
        passwordField.sendKeys(password);

        WebElement submitButton = driver.findElement(By.id("login-submit"));
        submitButton.click();

        WebElement userErrorElement = driver.findElement(By.xpath("//input[@id='input-login-username']/following-sibling::div"));
        String actualUserError = userErrorElement.getText();

        WebElement userPasswordElement = driver.findElement(By.xpath("//input[@id='input-login-password']/following-sibling::div"));
        String actualPasswordError = userPasswordElement.getText();

        WebElement generalErrorElement = driver.findElement(By.id("login-error"));
        String actualGeneralError = generalErrorElement.getText();

        Assert.assertEquals(actualUserError,
                userError,
                "Checking username error");
        Assert.assertEquals(actualPasswordError,
                passwordError,
                "Checking password error");
        Assert.assertEquals(actualGeneralError,
                generalError,
                "Checking general error");
    }

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://127.0.0.1:6868/web-stubs/stubs/auth.html");
    }

    @AfterMethod
    public void quit()
    {
        driver.quit();
    }

    private String getErrorMessage(String locator) {
        WebElement errorWebElement = (new WebDriverWait(driver, 3))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
        return errorWebElement.getText();
	}
}