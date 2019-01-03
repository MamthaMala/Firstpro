package FirstProject.FirstPro;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import FirstProject.Common.Actions;
import FirstProject.DriverManager.DriverSetUP;
import FirstProject.ObjectRepository.HomePage;
import bsh.org.objectweb.asm.Type;

public class TicketBooking extends Actions{
	
	@Test(groups={"SmokeTest","FunctionalTest"})
	public void bookingTicket(){
		//intializeBrowser();
		System.out.println("Browser Launched");
		type(HomePage.source,"Bangalore");
		type(HomePage.destination,"Chennai");
		//Systemdriver.getTitle();
	//	Assert.assertEquals(true,true);
		driver.findElement(By.xpath(""))
		
	}
	@Test(groups={"FuctionalTest"})
	public void reservation(){
		System.out.println("Reserved1");
	}
	
	/*@AfterMethod 
	 public void screenShot(ITestResult result){
	
		if(ITestResult.FAILURE==result.getStatus()){
			try{
			 		 TakesScreenshot screenshot=(TakesScreenshot)driver;
			 		 File src=screenshot.getScreenshotAs(OutputType.FILE);
			 		 FileUtils.copyFile(src,new File("C:\\Users\\Admin\\workspace\\FirstPro\\FailedScreenShots"+result.getName()+".png"));
			 		 System.out.println("Successfully captured a screenshot");
			   }
			catch (Exception e){
					System.out.println("Exception while taking screenshot "+e.getMessage());
			 } 
	 }
		
	 driver.quit();
	 }*/
	
	}
	
	


