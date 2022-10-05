package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class A2 {

@BeforeMethod
       public void Browser_open() {
	   System.out.println("Browser open");
   }
@Test
public void Test_001() {
	
	System.out.println("test 1");
    }
@Test
public void Test_003() {
	
	System.out.println("test 1");
    }
@Test
public void Test_002() {
	
	System.out.println("test 1");
    }
@AfterMethod
public void TearDown() {
	
	System.out.println("browser closed");
    }

}
