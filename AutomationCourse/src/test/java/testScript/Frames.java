package testScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Frames extends Base
{

	public void handlingFrames()
	{
	driver.navigate().to("https://demoqa.com/frames");
	List<WebElement> iframes=driver.findElements(By.tagName("iframe"));
	int totalFrames=iframes.size();
	System.out.println(totalFrames);
	//driver.switchTo().frame(0);
	WebElement frame1=driver.findElement(By.id("frame1"));
	driver.switchTo().frame(frame1);
	WebElement frameTitle=driver.findElement(By.id("sampleHeading"));
	String title=frameTitle.getText();
	System.out.println(title);
	driver.switchTo().defaultContent();//back to main page content
	System.out.println(driver.getTitle());
	}

	public static void main(String[] args)
	{
		Frames frames = new Frames();
		frames.initializeBrowser();
		frames.handlingFrames();
		frames.driverCloseAndQuit();

	}

}
