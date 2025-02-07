package testScript;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.Base;
import constants.Constants;
import pages.LoginPage;
import pages.SubCategoryPage;
import utilities.ExcelUtilities;

public class SubCategoryTest extends Base {

	@Test(description="Verifying Reset Option ")
public void resetTheSubCategoryPage() throws IOException
{
	String username = ExcelUtilities.getStringData(1, 0, "LoginPage");
	String password1 = ExcelUtilities.getStringData(1, 1, "LoginPage");
	LoginPage login = new LoginPage(driver);
	login.enterUserNameOnUserNameField(username);
	login.enterPasswordonPasswordField(password1);
	login.clickOnSignInButton();
	SubCategoryPage sub=new SubCategoryPage(driver);
	sub.clickSubCategory();
	sub.clickResetButton();
	String actual=driver.getTitle();
	String expected="List Sub Categories | 7rmart supermarket";
	Assert.assertEquals(actual, expected);
}
	@Test(description="Creation of new Sub Category")
	public void addNewSubCategoryItem() throws IOException
	{
		String username = ExcelUtilities.getStringData(1, 0, "LoginPage");
		String password1 = ExcelUtilities.getStringData(1, 1, "LoginPage");
		String itemName = ExcelUtilities.getStringData(1, 0, "CategoryPage");
		LoginPage login = new LoginPage(driver);
		login.enterUserNameOnUserNameField(username);
		login.enterPasswordonPasswordField(password1);
		login.clickOnSignInButton();
		SubCategoryPage sub=new SubCategoryPage(driver);
		sub.clickSubCategory();
		sub.clickNewButton();
		sub.selectCategoryOnCategoryField();
		sub.enterTheSubCategory(itemName);
		String image = Constants.TESTDATAFILE1;
		sub.imageUpload(image);
		sub.clickSaveButton();
		boolean isAlertDisplayed=login.isAlertDisplayed();
		Assert.assertTrue(isAlertDisplayed, "Sub Category not created successfully");
	}
}
