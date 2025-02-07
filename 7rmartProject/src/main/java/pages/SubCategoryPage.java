package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SubCategoryPage {

	public WebDriver driver;
	public int index=3;
	public SubCategoryPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//p[text()='Sub Category']") public WebElement subCategory;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-sub-category' and @class='btn btn-rounded btn-warning']") public WebElement reset;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/Subcategory/add']") public WebElement newButton;
	@FindBy(xpath="//select[@id='cat_id']") public WebElement categoryField;
	@FindBy(xpath="//input[@id='subcategory']") public WebElement subCategoryField;
	@FindBy(xpath="//input[@id='main_img']") public WebElement chooseFileButton;
	@FindBy(xpath="//button[@type='submit']") public WebElement saveButton;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") public WebElement alert;
	public void clickSubCategory()
	{
		subCategory.click();
	}
	
	public void clickResetButton()
	{
		reset.click();
	}
	public void clickNewButton()
	{
		newButton.click();
	}
	public void selectCategoryOnCategoryField()
	{
		Select select=new Select(categoryField);
		select.selectByIndex(index);
	}
	public void enterTheSubCategory(String item)
	{
		subCategoryField.sendKeys(item);
	}
	public void imageUpload(String image)
	{
		chooseFileButton.sendKeys(image);
	}
	
	public void clickSaveButton()
	{
		saveButton.click();
	}
	public boolean isAlertDisplayed() {
		return alert.isDisplayed();
	}
	
}
