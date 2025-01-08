package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locator extends Base {
	
	public void locators()
	{
		driver.navigate().to("https://selenium.qabible.in/index.php");
		WebElement messagefield=driver.findElement(By.id("single-input-field"));
		WebElement messagefield1=driver.findElement(By.className("form-control"));
		WebElement messagefield2=driver.findElement(By.tagName("button"));
		WebElement showMessageName=driver.findElement(By.name("description"));
		WebElement showMessageLink=driver.findElement(By.linkText("Checkbox Demo"));
		WebElement showMessagePartialLink=driver.findElement(By.linkText("Checkbox"));
		WebElement cssselector=driver.findElement(By.cssSelector("button[id='button-one']"));
		WebElement xpath=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		WebElement showmessagebutton=driver.findElement(By.xpath("//button[@id='button-one']"));
		driver.findElement(By.xpath("//button[contains(@id,'-one')]"));//lengthy attribute value
		driver.findElement(By.xpath("//button[text()='Show Message']"));//text
		driver.findElement(By.xpath("//button[starts-with(text(),'Show')]"));
		driver.findElement(By.xpath("//button[@type='button' and @id='button-one']"));
		driver.findElement(By.xpath("//button[@id='button-one' or @id='button-one-electronics']"));
		driver.findElement(By.xpath("//div[contains(text(),'Single Input Field')]//parent::div[@class='card']"));
		driver.findElement(By.xpath("//div[@class='card-body']//child::button[@id='button-one']"));
		driver.findElement(By.xpath("//button[@id='button-one']//ancestor::div"));
		driver.findElement(By.xpath("//div[@class='card']//descendant::div"));
		driver.findElement(By.xpath("//button[@id='button-one']//following::div[@class='card']"));
		driver.findElement(By.xpath("//button[@id='button-one']//preceding::div[@class='card']"));
	}

	public static void main(String[] args)
	{
	Locator locator=new Locator();
	locator.initializeBrowser();
	locator.driverCloseAndQuit();
	

	}

}
