package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScriptExecutorSample extends Base {
	
	public void javaScriptExecutorSample()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement showMessageButton=driver.findElement(By.xpath("//button[@id='button-one']"));
		JavascriptExecutor js=(JavascriptExecutor) driver;//cast it as driver
		js.executeScript("arguments[0].click();", showMessageButton);//click//argument0-first button
		//js.executeScript("window.scrollBy(0,350)","");
		js.executeScript("window.scrollBy(0,-350)","");
		
	}

	public static void main(String[] args) 
	{
		JavaScriptExecutorSample executor=new JavaScriptExecutorSample();
		executor.initializeBrowser();
		executor.javaScriptExecutorSample();
		//executor.driverCloseAndQuit();

	}

}
