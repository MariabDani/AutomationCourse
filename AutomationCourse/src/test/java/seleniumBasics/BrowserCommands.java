package seleniumBasics;


public class BrowserCommands  extends Base{

	public void verifyBrowserCommands()
	{
		String title= driver.getTitle();
		System.out.println("title "+ title);
		String url= driver.getCurrentUrl();
		System.out.println("URL "+ url);
		String handleid= driver.getWindowHandle();
		System.out.println("Window Hanle id "+ handleid);
		String pageSource= driver.getPageSource();
		System.out.println(pageSource);
	}
	
	public void verifyNavigation() throws InterruptedException
	{
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.navigate().refresh();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserCommands browser= new BrowserCommands();
		browser.initializeBrowser();
		//browser.verifyBrowserCommands();
		try {
			browser.verifyNavigation();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
