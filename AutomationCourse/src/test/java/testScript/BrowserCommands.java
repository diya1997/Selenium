package testScript;

public class BrowserCommands extends Base {
	
	public void navigationCommand()
	{
		//driver.navigate().to("https://www.selenium.dev/");
		//driver.navigate().back();
		//driver.navigate().forward();
		driver.navigate().refresh();
	}
	
	public void browserCommands()
	{
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String title=driver.getTitle();
		System.out.println(title);
		String windowhandle=driver.getWindowHandle();//web page id
		System.out.println( windowhandle);
		String pagesource=driver.getPageSource();//to get html code of web page
		System.out.println(pagesource);
	}

	public static void main(String[] args)
	{
		BrowserCommands browsercommands=new BrowserCommands();
		browsercommands.initializeBrowser();
		browsercommands.navigationCommand();
		browsercommands.browserCommands();
		//browsercommands.driverCloseAndQuit();

	}

}
