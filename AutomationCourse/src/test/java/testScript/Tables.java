package testScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Tables extends Base 
{
	
	public void handlingTables()
	{
		driver.navigate().to("https://money.rediff.com/indices/nse");
		WebElement showMore=driver.findElement(By.xpath("//a[@id='showMoreLess']"));
		showMore.click();
		WebElement tableField=driver.findElement(By.xpath("//table[@id='dataTable']"));//text by enter table
		System.out.println(tableField.getText());
		WebElement tableRow=driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr[3]"));//text by row
		System.out.println(tableRow.getText());
		List<WebElement> showHeading=driver.findElements(By.xpath("//table[@id='dataTable']//thead//th"));//to get headings of a table
		for(WebElement heading:showHeading)
		{
			String text=heading.getText();
			System.out.println(text);
		}
	}

	public static void main(String[] args)
	{
		Tables table=new Tables();
		table.initializeBrowser();
		table.handlingTables();
		//table.driverCloseAndQuit();

	}

}
