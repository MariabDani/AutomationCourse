package seleniumBasics;

import org.openqa.selenium.By;

public class Locator extends Base{
	
	public void verifyLocators()
	{
		//driver.findElement(By.cssSelector("a[href='simple-form-demo.php']")).click();
		driver.findElement(By.id("button-one"));
		driver.findElement(By.className("btn-primary"));
		driver.findElement(By.tagName("button"));
		driver.findElement(By.name("description"));
		driver.findElement(By.linkText("Simple Form Demo"));
		driver.findElement(By.partialLinkText("Simple"));
		driver.findElement(By.cssSelector("button[id='button-one']"));//.click();;
		
		
	}

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Locator loc = new Locator();
//		loc.initializeBrowser();
//		loc.verifyLocators();
//
//	}

}
