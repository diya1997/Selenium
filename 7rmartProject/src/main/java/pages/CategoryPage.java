package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CategoryPage {
	public WebDriver driver;
	public CategoryPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath="//a[@onclick='click_button(1)']") public WebElement newButton;
	@FindBy(xpath="//input[@placeholder='Enter the Category']") public WebElement enterCategory;
	@FindBy(xpath="//p[text()='Category']") public WebElement clickCategory;
	@FindBy(xpath="//input[@id='main_img']") public WebElement chooseFileButton;
	@FindBy(xpath="//input[@name='top_menu' and @value='yes']") public WebElement showOnTop;
	@FindBy(xpath="//button[text()='Save']") public WebElement saveButton;
	@FindBy(xpath="//input[@name='show_home' and @value='yes']") public WebElement showOnLeft;
	@FindBy(xpath="//a[@href='javascript:void(0)']") public WebElement searchButton;
	@FindBy(xpath="//button[@class='btn btn-danger btn-fix']") public WebElement searchCategoryButton;
	@FindBy(xpath="//input[@placeholder='Category']") public WebElement searchCategoryField;
	@FindBy(xpath="//a[@class='page-link']") public WebElement pageNumber;
	@FindBy(xpath="//div[@id='imagePreview']") public WebElement imagePreview;
public void clicktheNewButtonForAddingCategory()
{
	newButton.click();
	
}

public void clickCategory()
{
	clickCategory.click();
}
public boolean isImagePreviewDisplayed()
{
	return imagePreview.isDisplayed();
}


public void enterCategoryOnCategory(String itemName)
{
	enterCategory.sendKeys(itemName);
}

public void imageUpload(String image)
{
	chooseFileButton.sendKeys(image);
	
}
public void clickRadioButtonForShowOnTop() throws InterruptedException
{
	
	showOnTop.click();
}

public void clickRadioButtonForShowOnLeft() throws InterruptedException
{
	
	showOnLeft.click(); 
}

public void saveNewCategoryItem() throws InterruptedException
{
	saveButton.click();
}
public void clickSearchButton()
{
	searchButton.click();
}
public void clickSearchCategoryButton()
{
	searchCategoryButton.click();
}

public void enterCategoryOnSearchField(String itemName)
{
	searchCategoryField.sendKeys(itemName);
}
public boolean isPageNumberDisplayedAfterSearch()
{
	return pageNumber.isDisplayed();
}

}
