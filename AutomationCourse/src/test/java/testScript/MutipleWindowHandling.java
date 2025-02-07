package testScript;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MutipleWindowHandling extends Base 
{
	
	public void windowHandling()
	{
		driver.navigate().to("https://demo.guru99.com/popup.php");
		String firstWindowHandle=driver.getWindowHandle();
		System.out.println(firstWindowHandle);
		WebElement clickButton=driver.findElement(By.xpath("//a[text()='Click Here']"));
		clickButton.click();
		Set<String> handleids=driver.getWindowHandles();
		System.out.println(handleids);
		Iterator<String> it=handleids.iterator();
		while(it.hasNext())
		{
			String currentId=it.next();
			if(!currentId.equals(firstWindowHandle))
			{
				driver.switchTo().window(currentId);
				WebElement inputEmail=driver.findElement(By.xpath("//input[@name='emailid']"));
				inputEmail.sendKeys("diya15@gamil.com");
				WebElement submitButton=driver.findElement(By.xpath("//input[@name='btnLogin']"));
				submitButton.click();
			}
		}
	}

	public static void main(String[] args) 
	{
		MutipleWindowHandling window = new MutipleWindowHandling();
		window.initializeBrowser();
		window.windowHandling();
		window.driverCloseAndQuit();

	}

}
