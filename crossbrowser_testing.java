package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class crossbrowser_testing {
   WebDriver driver;
	
   @Parameters()
   @BeforeMethod
	
   
   public void BO(String browsername) {
	
	 if(browsername.equalsIgnoreCase("chrome"));{
			WebDriverManager.chromiumdriver().setup();
		     driver=new ChromeDriver();
	 }
     if(browsername.equalsIgnoreCase("Edge")) {
	   WebDriverManager.edgedriver().setup();
	   driver=new EdgeDriver();
	   
   }
    else if(browsername.equalsIgnoreCase("firfox")) {
	   WebDriverManager.firefoxdriver().setup();
	      driver=new EdgeDriver();
	      }
		
		
		driver.get("  https://www.facebook.com");
		driver.manage().window().maximize();

	}
	@Test
	public void test1_bt() {
		System.out.println("test 1");
	}
	@Test
	public void test2() {
		System.out.println("test 2");
	}
	@AfterMethod
	public void AM() {
	    driver.close();
	}
}
