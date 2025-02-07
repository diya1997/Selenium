package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FillInputForm extends Base
{

	public void fillInputForm()
	{
	driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");	
	WebElement showmessagefield=driver.findElement(By.xpath("//input[@id='single-input-field']"));
	showmessagefield.sendKeys("diya");
	WebElement showmessagebutton=driver.findElement(By.xpath("//button[@id='button-one']"));
	showmessagebutton.click();
	WebElement entervalueA=driver.findElement(By.xpath("//input[@id='value-a']"));
	entervalueA.sendKeys("2");
	WebElement entervalueB=driver.findElement(By.xpath("//input[@id='value-b']"));
	entervalueB.sendKeys("3");
	WebElement showgettotalbutton=driver.findElement(By.xpath("//button[@id='button-two']"));
	showgettotalbutton.click();
	}
	public static void main(String[] args) 
	{
	FillInputForm fill=new FillInputForm();
	fill.initializeBrowser();
	fill.fillInputForm();

	}

}
