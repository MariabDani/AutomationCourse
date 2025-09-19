package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown extends Base{
	
	public void verifyDropdrown()
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement drpDown=driver.findElement(By.id("dropdowm-menu-1"));
		Select select = new Select(drpDown);
		select.selectByIndex(1);
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		select.selectByValue("python");
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		select.selectByVisibleText("SQL");
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
		public void verifyCheckBox()
		{
			driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
			WebElement chkBox=driver.findElement(By.xpath("//input[@value='option-1']"));
			chkBox.click();
//			try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
		}
		
		public void verifyRadioBox()
		{
			driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
			WebElement rdBox=driver.findElement(By.xpath("//input[@value='blue']"));
			System.out.println("before selection "+rdBox.isSelected());
			rdBox.click();
			System.out.println("after selection "+rdBox.isSelected() );
			
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingDropdown hdlgDropdown= new HandlingDropdown();
		hdlgDropdown.initializeBrowser();
		hdlgDropdown.verifyDropdrown();
		hdlgDropdown.verifyCheckBox();
		hdlgDropdown.verifyRadioBox();
	}

}
