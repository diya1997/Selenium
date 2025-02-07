package testScript;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertHandle extends Base {

	public void handlingAlert() {
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement simpleAlert = driver.findElement(By.xpath("//button[@id='alertButton']"));
		simpleAlert.click();
		Alert al = driver.switchTo().alert();
		al.accept();
	}
	
	public void handlingConfirmAlert()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement confirmAlert = driver.findElement(By.xpath("//button[@id='confirmButton']"));
		confirmAlert.click();
		Alert al=driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();
	}
	
	public void handlingPromptAlert()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement promptAlert = driver.findElement(By.xpath("//button[@id='promtButton']"));
		promptAlert.click();
		Alert al=driver.switchTo().alert();
		al.sendKeys("diya");
		al.accept();
	}

	public static void main(String[] args) {
		AlertHandle alert = new AlertHandle();
		alert.initializeBrowser();
		//alert.handlingAlert();
		//alert.handlingConfirmAlert();
		alert.handlingPromptAlert();
		// alert.driverCloseAndQuit();

	}

}
