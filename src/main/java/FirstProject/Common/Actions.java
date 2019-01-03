package FirstProject.Common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import FirstProject.DriverManager.DriverSetUP;

public class Actions extends DriverSetUP {
	
	public void type(By element,String str){
		driver.findElement(element).sendKeys(str);
		
	}
}