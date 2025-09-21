package seleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HandlingActions extends Base {
	
	
	public void rightClick()
	{
		WebElement rgtclick= driver.findElement(By.id("others"));
		Actions action= new Actions(driver);
		action.contextClick(rgtclick).build().perform();
	}
	
	public void mouseHover()
	{
		WebElement mouseHoverelm= driver.findElement(By.id("others"));
		Actions action= new Actions(driver);
		action.moveToElement(mouseHoverelm).build().perform();
	}
	
	public void dragNDrop()
	{
		driver.navigate().to("https://demoqa.com/droppable");
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		WebElement drag= driver.findElement(By.id("draggable"));
		WebElement drop= driver.findElement(By.id("droppable"));
		Actions action= new Actions(driver);
		action.dragAndDrop(drag, drop).build().perform();
	}

	public void verifyKeyBoardActions()
	{
		 try {
		        Robot robot = new Robot();
		        robot.keyPress(KeyEvent.VK_CONTROL);
		        robot.keyPress(KeyEvent.VK_T);
		        robot.keyRelease(KeyEvent.VK_CONTROL);
		        robot.keyRelease(KeyEvent.VK_T);
		    } catch (AWTException e) {
		        System.out.println("Robot initialization failed: " + e.getMessage());
		    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingActions hndlingActions= new HandlingActions();
		hndlingActions.initializeBrowser();
		//hndlingActions.rightClick();
		//hndlingActions.mouseHover();
		//hndlingActions.dragNDrop();
		hndlingActions.verifyKeyBoardActions();
	}

}
