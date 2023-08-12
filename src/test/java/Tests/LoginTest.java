package Tests;

import PageObjects.AccountPage;
import PageObjects.LoginPage;
import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class LoginTest extends BaseTest {

    LoginPage loginPage;
    AccountPage accountPage;

    @DataProvider(name = "loginDp")
    public Object[][] loginNegativeDataProvider() {
        return new Object[][]{
                {"", "", "chrome", "Please enter your username", "Please enter your password"},
                {"", "somePassword", "edge", "Please enter your username", ""},
                {"test", "", "firefox", "", "Please enter your password"},
                {"zebra", "zebrapassword", "chrome", "", ""}
        };
    }

    @DataProvider(name = "loginPDp")
    public Object[][] loginPositiveDataProvider() {
        return new Object[][]{
                {"", "", "chrome", "Please enter your username", "Please enter your password"},
                {"", "somePassword", "edge", "Please enter your username", ""},
                {"test", "", "firefox", "", "Please enter your password"},
                {"zebra", "zebrapassword", "chrome", "", ""}
        };
    }

    @Test(dataProvider = "loginDp")
    public void login(String username, String password, String browser, String usernameErr, String passErr) {
        System.out.println("Login with username:" + username + "/password:" + password + "=> on browser:" + browser);
        setUpDriver(browser);
        driver.get(baseUrl);

        loginPage = new LoginPage(driver);
        loginPage.goToLoginPage();
        loginPage.login(username, password);

        System.out.println("Login Finished, verify error message");
        accountPage = new AccountPage(driver);
        Assert.assertEquals("Login succesfull " +username,username, accountPage.getName());
        System.out.println("Logout user");
    }
}