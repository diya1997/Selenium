package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage {
	public WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//img[@src='https://groceryapp.uniqassosiates.com/public/assets/admin/dist/img/avatar5.png']")
	private WebElement admin;
	@FindBy(xpath = "//a[@class='dropdown-item' and @href='https://groceryapp.uniqassosiates.com/admin/logout']")
	private WebElement adminField;
	@FindBy(xpath ="//i[@class='nav-icon fas fa-th-large']") public WebElement dashboard;
	@FindBy(xpath ="//p[text()='cdc']") public WebElement cdc;
	
	public void verifylogoutByAdmin() {
		admin.click();
		adminField.click();
	}

	public boolean isLogoutButtonDisplayed() {
		return adminField.isDisplayed();
		
	}
	
	public void clickDashboardMenu()
	{
		dashboard.click();
	}
	
	public boolean iscdcDisplayed()
	{
		return cdc.isDisplayed();
	}

}
