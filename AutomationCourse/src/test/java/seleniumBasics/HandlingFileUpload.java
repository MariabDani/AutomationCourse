package seleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFileUpload extends Base{
	
	public void verifyFileUploadingSendKeys()
	{
		driver.navigate().to("https://demo.guru99.com/test/upload/");
		WebElement chooseFileBtn= driver.findElement(By.id("uploadfile_0"));
		chooseFileBtn.sendKeys("C:\\Users\\Maria\\git\\AutomationCourse\\AutomationCourse\\src\\test\\resources\\Abstraction.pdf");
		WebElement chkBox= driver.findElement(By.className("field_check"));
		chkBox.click();
		WebElement submitBtn= driver.findElement(By.id("submitbutton"));
		submitBtn.click();
		
	}
	
	public void verifyFileUploadByRobotClass() throws AWTException
	{
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement selectPdfBtn= driver.findElement(By.id("pickfiles"));
		selectPdfBtn.click();
		
		StringSelection select= new StringSelection("C:\\Users\\Maria\\git\\AutomationCourse\\AutomationCourse\\src\\test\\resources\\Abstraction.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select, null);
		Robot r=new Robot();
		r.delay(2500);
		r.keyPress(KeyEvent.VK_ENTER);//?????
		r.keyRelease(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_ENTER);//for open button
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingFileUpload fileUpload= new HandlingFileUpload();
		fileUpload.initializeBrowser();
		//fileUpload.verifyFileUploadingSendKeys();
		try {
			fileUpload.verifyFileUploadByRobotClass();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
