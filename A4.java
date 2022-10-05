package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class A4 {

	@BeforeMethod
	public void open () {
		
		System.out.println("Browser open");
	}
	
	@Test(priority=2,invocationCount=3)
public void TestB() {                                                     //priority......enable=false......invocationcount=3...dependonmethod="testC"
		
		System.out.println("B");
	}
	
	@Test(priority=1,dependsOnMethods="testA")
public void testC () {
		
		System.out.println("C");
	}
	
	@Test(priority=0,enabled=false)
public void testA () {
		
		System.out.println("A");
	}
	
	@AfterMethod
public void closed() {
		
		System.out.println("Browser closed");
	}
}
