package testScript;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FileUpload extends Base {

	public void fileUploadUsingSendKeys() {
		driver.navigate().to("https://demo.guru99.com/test/upload/");
		WebElement fileUpload = driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
		fileUpload.sendKeys(
				"C:\\Users\\diyad\\git\\Selenium\\AutomationCourse\\src\\test\\resources\\Collection Assignment.pdf");
		WebElement terms = driver.findElement(By.xpath("//input[@id='terms']"));
		terms.click();
		WebElement submitButton = driver.findElement(By.xpath("//button[@id='submitbutton']"));
		submitButton.click();
	}

	public void fileUploadUsingRobotClass() throws AWTException {
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement fileUpload = driver.findElement(By.xpath("//a[@id='pickfiles']"));
		fileUpload.click();
		StringSelection s = new StringSelection(
				"C:\\Users\\diyad\\git\\Selenium\\AutomationCourse\\src\\test\\resources\\Collection Assignment.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		Robot robot = new Robot();
		robot.delay(2500);
		robot.keyPress(KeyEvent.VK_ENTER);// to enter the upload box

		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);

		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_ENTER);// to click ok

		robot.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void main(String[] args) {
		FileUpload file = new FileUpload();
		file.initializeBrowser();
		// file.fileUploadUsingSendKeys();
		try {
			file.fileUploadUsingRobotClass();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// file.driverCloseAndQuit();

	}

}
