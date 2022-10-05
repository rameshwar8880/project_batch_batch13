package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A3 {

	WebDriver driver;
	@BeforeMethod
	public void Browser_open() {
//browser opning	
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("    https://www.facebook.com/ ");
		driver.manage().window().maximize();
	}
@Test
	public void Test1_email() {
		WebElement txt_emial=driver.findElement(By.xpath("//input[@name='email']"));
		txt_emial.sendKeys("rameshwarchavan8880@gmail.com");
	}
@Test
     public void test2_password() {
       WebElement txt_passsword=driver.findElement(By.xpath("//input[@name='pass']"));
       txt_passsword.sendKeys("Ram8880");
}
@AfterMethod
	public void tearDown() {
		driver.close();
	}
	
}
