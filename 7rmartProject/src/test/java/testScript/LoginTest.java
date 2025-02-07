package testScript;

import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.Base;
import pages.LoginPage;
import utilities.ExcelUtilities;
import utilities.WaitUtility;

public class LoginTest extends Base {
	@Test(description = "Login using valid credentials", priority = 1)
	public void userLoginWithValidUsernameAndPassword() throws IOException {
		
		String username=ExcelUtilities.getStringData(1, 0,"LoginPage");
		String password1=ExcelUtilities.getStringData(1, 1,"LoginPage");
		LoginPage login = new LoginPage(driver);
		login.enterUserNameOnUserNameField(username);
		login.enterPasswordonPasswordField(password1);
		login.clickOnSignInButton();
		boolean isDashboardDisplayed=login.isDashboardDisplayed();
		Assert.assertTrue(isDashboardDisplayed, "Unable to login with given credentials");
	}

	@Test(description = "Login using invalid credentials", priority = 2)
	public void userLoginWithInvalidUsernameAndInvalidPassword() throws IOException {
		String username=ExcelUtilities.getStringData(2, 0,"LoginPage");
		String password1=ExcelUtilities.getStringData(2, 1,"LoginPage");
		LoginPage login = new LoginPage(driver);
		login.enterUserNameOnUserNameField(username);
		login.enterPasswordonPasswordField(password1);
		login.clickOnSignInButton();
		boolean isAlertDisplayed=login.isAlertDisplayed();
		Assert.assertTrue(isAlertDisplayed, "Successful login with invalid credentials");
		
	}

	@Test(description = "Login using invalid username", priority = 3)
	public void userLoginWithInvalidUsernameAndvalidPassword() throws IOException {
		String username=ExcelUtilities.getStringData(4, 0,"LoginPage");
		String password1=ExcelUtilities.getStringData(4, 1,"LoginPage");
		LoginPage login = new LoginPage(driver);
		login.enterUserNameOnUserNameField(username);
		login.enterPasswordonPasswordField(password1);
		login.clickOnSignInButton();
		boolean isAlertDisplayed=login.isAlertDisplayed();
		Assert.assertTrue(isAlertDisplayed, "Successful login with invalid password");
	}

	@Test(description = "Login using invalid password", priority = 4)
	public void userLoginWithValidUsernameAndInvalidPassword() throws IOException {
		String username=ExcelUtilities.getStringData(3, 0,"LoginPage");
		String password1=ExcelUtilities.getStringData(3, 1,"LoginPage");
		LoginPage login = new LoginPage(driver);
		login.enterUserNameOnUserNameField(username);
		login.enterPasswordonPasswordField(password1);
		login.clickOnSignInButton();
		boolean isAlertDisplayed=login.isAlertDisplayed();
		Assert.assertTrue(isAlertDisplayed, "Successful login with invalid password");
	}
}
