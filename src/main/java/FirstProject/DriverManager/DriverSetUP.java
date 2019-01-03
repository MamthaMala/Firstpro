package FirstProject.DriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class DriverSetUP {
	
	public static WebDriver driver=null;
	@BeforeSuite
	public void intializeBrowser(){
		System.setProperty("webdriver.chrome.driver", "D:\\seljars\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
	}

}
