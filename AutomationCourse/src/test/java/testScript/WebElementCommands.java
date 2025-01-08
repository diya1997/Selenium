package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends Base{
	
	public void webElementCommand()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement showmessagefield=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		showmessagefield.sendKeys("diya");
		WebElement showmessagebutton=driver.findElement(By.xpath("//button[@id='button-one']"));
		showmessagebutton.click();
		
	}

	public static void main(String[] args) 
	{
		WebElementCommands webelementcommands=new WebElementCommands();
		webelementcommands.initializeBrowser();
		webelementcommands.webElementCommand();
		//webelementcommands.driverCloseAndQuit();
		

	}

}
