package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public WebDriver driver;

	public void initializeBrowser()
	{
		driver= new ChromeDriver();
		driver.get("https://selenium.qabible.in");
		driver.manage().window().maximize();
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
	
	public void driverClose()
	{
		//driver.close();
		//driver.quit();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base base= new Base();
		base.initializeBrowser();
	}

}
