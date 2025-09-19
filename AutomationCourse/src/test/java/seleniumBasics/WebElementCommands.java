package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends Base{
	
	public void verifyWebElementCommands()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement messageTxtBox= driver.findElement(By.id("single-input-field"));
		messageTxtBox.sendKeys("Hi Test!!");
		WebElement showMessageBtn= driver.findElement(By.xpath("//button[@id='button-one']"));
		showMessageBtn.click();
		WebElement messageTxt= driver.findElement(By.xpath("//div[starts-with(text(),'Your')]"));
		System.out.println(messageTxt.getText());
		System.out.println(messageTxt.isDisplayed());
		System.out.println(messageTxtBox.getTagName());
		System.out.println(messageTxtBox.isEnabled());
		System.out.println(showMessageBtn.getCssValue("border-color"));
		messageTxtBox.clear();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebElementCommands webCommands= new WebElementCommands();
		webCommands.initializeBrowser();
		webCommands.verifyWebElementCommands();
	}

}
