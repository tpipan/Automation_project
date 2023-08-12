package Homework.tests;

import Homework.pageobject.RegisterPage;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class NegativeRegisterPageTest extends SetUpRegister {
    RegisterPage registerPage;

    @DataProvider(name = "negativeRegisterDp")
    public Object[][] registerNegativeDataProvider() {
        return new Object[][]{
                {"", "", "", "", "", "",""},
                {"a", "", "", "", "", "",""},
                {"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaae","", "", "", "", "",""},
                {"", "pas", "", "", "", "",""},
                {"", "password321", "password32", "", "", "",""},
                {"","","","","","EmaEma%",""}

        };
    }


    @Test(dataProvider = "negativeRegisterDp")
    public void emptyDataTest(String user, String passwordI, String confirmPassword, String firstName, String lastName,String email, String browser) throws InterruptedException {
        setUpDriver(browser);
        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.goToRegisterPage();
        registerPage.submitButton();
        TimeUnit.SECONDS.sleep(1);
        List<WebElement> errorMessages = driver.findElements(By.className("form-error"));

        Assert.assertEquals(3, errorMessages.size());
    }


    @Test(dataProvider = "negativeRegisterDp")
    public void invalidUsernameTest(String user, String passwordI, String confirmPassword, String firstName, String lastName,String email, String browser) throws InterruptedException {

        setUpDriver(browser);
        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.goToRegisterPage();

        registerPage.usernameInputField.sendKeys(user);
        registerPage.usernameInputField.sendKeys(Keys.TAB);

        TimeUnit.SECONDS.sleep(1);

        List<WebElement> errorMessages = driver.findElements(By.className("form-error"));

        Assert.assertEquals("More than 1 error message found", 1, errorMessages.size());
        Assert.assertEquals("Please choose a longer username", errorMessages.get(0).getText());

    }

    @Test(dataProvider = "negativeRegisterDp")
    public void InvalidLongUsernameTest(String user, String passwordI, String confirmPassword, String firstName, String lastName,String email, String browser) throws InterruptedException {

        setUpDriver(browser);
        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.goToRegisterPage();

        registerPage.usernameInputField.sendKeys(user);
        registerPage.usernameInputField.sendKeys(Keys.TAB);

        TimeUnit.SECONDS.sleep(1);

        List<WebElement> errorMessages = driver.findElements(By.className("form-error"));

        Assert.assertEquals("More than 1 error message found", 1, errorMessages.size());
        Assert.assertEquals("Please choose a shorter username", errorMessages.get(0).getText());

    }

    @Test(dataProvider = "negativeRegisterDp")
    public void invalidPasswordTest(String user, String passwordI, String confirmPassword, String firstName, String lastName,String email, String browser) throws InterruptedException {

        setUpDriver(browser);
        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.goToRegisterPage();
        registerPage.passwordField1.sendKeys(passwordI);
        registerPage.passwordField1.sendKeys(Keys.TAB);

        TimeUnit.SECONDS.sleep(1);

        List<WebElement> errorMessages = driver.findElements(By.className("form-error"));

        Assert.assertEquals("More than 1 error message found", 1, errorMessages.size());
        Assert.assertEquals("Please choose a longer password", errorMessages.get(0).getText());

    }


    @Test(dataProvider = "negativeRegisterDp")
    public void differentPasswordTest(String user, String passwordI, String confirmPassword, String firstName, String lastName,String email, String browser) throws InterruptedException {


        setUpDriver(browser);
        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.goToRegisterPage();
        registerPage.passwordField1.sendKeys(passwordI);
        registerPage.passwordField1.sendKeys(Keys.TAB);
        TimeUnit.SECONDS.sleep(1);
        registerPage.ConfirmPassword.sendKeys(confirmPassword);
        registerPage.ConfirmPassword.sendKeys(Keys.TAB);

        TimeUnit.SECONDS.sleep(1);


        List<WebElement> errorMessages = driver.findElements(By.className("form-error"));

        Assert.assertEquals("More than 1 error message found", 1, errorMessages.size());
        Assert.assertEquals("Please choose a longer password", errorMessages.get(0).getText());

//        Exista un bug, chiar daca parolele sunt identice da mesaj de eroare.
    }

    @Test(dataProvider = "negativeRegisterDp")
    public void invalidEmailTest(String user, String passwordI, String confirmPassword, String firstName, String lastName, String email, String browser) throws InterruptedException {

        setUpDriver(browser);
        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.goToRegisterPage();
        TimeUnit.SECONDS.sleep(1);
        registerPage.emailField.sendKeys(email);
        registerPage.submitButton();
        TimeUnit.SECONDS.sleep(1);
        String alert = driver.switchTo().alert().getText();



    }
}



