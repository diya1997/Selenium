package testScript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.Base;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtilities;
import utilities.WaitUtility;

public class HomeTest extends Base {

	
	@Test(description="user can access Dashboard Menu on Home Pge")
	public void accessOfDashboardMenuOnHomePage() throws IOException, InterruptedException
	{
		String username = ExcelUtilities.getStringData(1, 0, "LoginPage");
		String password1 = ExcelUtilities.getStringData(1, 1, "LoginPage");
		LoginPage login = new LoginPage(driver);
		login.enterUserNameOnUserNameField(username);
		login.enterPasswordonPasswordField(password1);
		login.clickOnSignInButton();
		HomePage homePage = new HomePage(driver);
		homePage.clickDashboardMenu();
		WaitUtility wait=new WaitUtility();
		wait.waitUntilElementToBeClickable(driver, homePage.cdc);
		Boolean cdcDisplayed=homePage.iscdcDisplayed();
		Assert.assertTrue(cdcDisplayed,"cdc is not accessible on home page");
	}

	@Test(description = "Perform logout by Admin")
	public void logOutByAdmin() throws IOException {
		String username = ExcelUtilities.getStringData(1, 0, "LoginPage");
		String password1 = ExcelUtilities.getStringData(1, 1, "LoginPage");
		LoginPage login = new LoginPage(driver);
		login.enterUserNameOnUserNameField(username);
		login.enterPasswordonPasswordField(password1);
		login.clickOnSignInButton();
		HomePage homePage = new HomePage(driver);
		homePage.verifylogoutByAdmin();
		String actual = driver.getTitle();
		String expected = "Login | 7rmart supermarket";
		Assert.assertEquals(actual, expected);

	}
}
