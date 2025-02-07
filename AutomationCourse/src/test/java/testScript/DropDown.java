package testScript;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropDown extends Base
{
	public void handlingDropDown()
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement dropdown1=driver.findElement(By.xpath("//select[@id='dropdowm-menu-1']"));
		Select select=new Select(dropdown1);
		select.selectByIndex(2);
		WebElement dropdown2=driver.findElement(By.xpath("//select[@id='dropdowm-menu-2']"));
		Select select1=new Select(dropdown2);
		select1.selectByVisibleText("Maven");
		WebElement dropdown3=driver.findElement(By.xpath("//select[@id='dropdowm-menu-3']"));
		Select select2=new Select(dropdown3);
		select2.selectByValue("HTML");
		
	}
	
	@Test
	public void handlingCheckBox()
	{
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement checkbox=driver.findElement(By.xpath("//input[@id='gridCheck']"));
		Wait<WebDriver> fluentWait=new FluentWait<WebDriver>(driver) 
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(3))
				.ignoring(NoSuchElementException.class);
		fluentWait.until(ExpectedConditions.elementToBeClickable(checkbox));
		checkbox.click();
		
		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@type='checkbox' and @class='check-box-list']"));
		for(WebElement check:checkboxes)
		{
			check.click();
		}
		
		
	}
	
	public void handlingRadioButton()
	{
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement radiobutton=driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		radiobutton.click();
		boolean isRadioButtonSelected=radiobutton.isSelected();
		System.out.println(isRadioButtonSelected);
	}
	

	public static void main(String[] args)
	{
		DropDown dropdown=new DropDown();
		dropdown.initializeBrowser();
		//dropdown.handlingDropDown();
		dropdown.handlingCheckBox();
		//dropdown.handlingRadioButton();
		//dropdown.driverCloseAndQuit();

	}

}
