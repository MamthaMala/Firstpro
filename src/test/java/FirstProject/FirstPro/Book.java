package FirstProject.FirstPro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Book {
	
	public static WebDriver driver=null;
	@Test(groups="a")
	public void reservation1(){
		System.out.println("Reserved git");
		System.setProperty("webdriver.chrome.driver", "D:\\seljars\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");

	}
	@Test(groups="a")
	public void reservation(){
		System.out.println("Reserved1");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\Downloads\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.redbus.in/");

	}

	

}
