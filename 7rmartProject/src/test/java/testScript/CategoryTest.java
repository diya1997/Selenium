package testScript;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.Base;
import constants.Constants;
import pages.CategoryPage;
import pages.LoginPage;
import utilities.ExcelUtilities;
import utilities.WaitUtility;

public class CategoryTest extends Base {

	@Test(description = "Adding new Category")
	public void addNewCategoryOnListCategories() throws IOException, InterruptedException {
		String username = ExcelUtilities.getStringData(1, 0, "LoginPage");
		String password1 = ExcelUtilities.getStringData(1, 1, "LoginPage");
		String itemName = ExcelUtilities.getStringData(1, 0, "CategoryPage");
		LoginPage login = new LoginPage(driver);
		login.enterUserNameOnUserNameField(username);
		login.enterPasswordonPasswordField(password1);
		login.clickOnSignInButton();
		CategoryPage category = new CategoryPage(driver);
		category.clickCategory();
		category.clicktheNewButtonForAddingCategory();
		category.enterCategoryOnCategory(itemName);
		System.out.println(itemName);
		String image = Constants.TESTDATAFILE1;
		category.imageUpload(image);
		Boolean imagePreviewDisplayed=category.isImagePreviewDisplayed();
		Assert.assertTrue(imagePreviewDisplayed,"Image is not added");
		/*WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.elementToBeClickable(category.showOnTop));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", category.showOnTop);
		Thread.sleep(500);*/
		WaitUtility wait=new WaitUtility();
		wait.waitUntilElementToBeClickable(driver, category.showOnTop);
		category.clickRadioButtonForShowOnTop();
		category.clickRadioButtonForShowOnLeft();
		category.saveNewCategoryItem();
		
	}

	@Test(description="Verify Search option")
	public void checkSearchOptionIsWorking() throws IOException {
		String username = ExcelUtilities.getStringData(1, 0, "LoginPage");
		String password1 = ExcelUtilities.getStringData(1, 1, "LoginPage");
		String itemName = ExcelUtilities.getStringData(1, 0, "CategoryPage");
		LoginPage login = new LoginPage(driver);
		login.enterUserNameOnUserNameField(username);
		login.enterPasswordonPasswordField(password1);
		login.clickOnSignInButton();
		CategoryPage category = new CategoryPage(driver);
		category.clickCategory();
		category.clickSearchButton();
		category.enterCategoryOnSearchField(itemName);
		category.clickSearchCategoryButton();
		Boolean pageNumberDisplayed=category.isPageNumberDisplayedAfterSearch();
		Assert.assertTrue(pageNumberDisplayed, "Searched category not found");
		

	}
}
