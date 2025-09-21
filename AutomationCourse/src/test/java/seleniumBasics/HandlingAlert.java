package seleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingAlert extends Base {
	
	public void verifySimpleAlert() {
		
		driver.navigate().to("https://demoqa.com/alerts");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement simpleAlert = driver.findElement(By.id("alertButton"));
		simpleAlert.click();
		Alert al = driver.switchTo().alert();
		al.accept();
		
	}
	
	public void verifyConfimAlert() {
		
		driver.navigate().to("https://demoqa.com/alerts");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement confirmAlert = driver.findElement(By.id("confirmButton"));
		confirmAlert.click();
		Alert al = driver.switchTo().alert();
		//al.accept();
		al.dismiss();
		
	}
	

	
	public void verifyPromptAlert() {
		driver.navigate().to("https://demoqa.com/alerts");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement promptAlert = driver.findElement(By.id("promtButton"));
		promptAlert.click();
		Alert al = driver.switchTo().alert();
		al.sendKeys("Hi");
		al.accept();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingAlert alertHandle = new HandlingAlert();
		alertHandle.initializeBrowser();
		//alertHandle.verifySimpleAlert();
		//alertHandle.verifyConfimAlert();
		alertHandle.verifyPromptAlert();
	}

}
