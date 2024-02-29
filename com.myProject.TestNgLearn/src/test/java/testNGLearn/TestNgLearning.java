package testNGLearn;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgLearning {
	
	@BeforeSuite
	public void suiteSetUp() {
		System.out.println("this is suite setup");
	}
	
	@BeforeTest
	public void testSetUp() {
		System.out.println("This is test setup");
	}
	
	@BeforeClass
	public void classSetUp() {
		System.out.println("This is class setup");
	}
	
	@BeforeMethod
	public void methodSetup() {
		System.out.println("This is method setup");
	}
	
	@AfterClass
	public void classaSetup() {
		System.out.println("This is after class setup");
	}
	
	@AfterMethod
	public void methodaSetUp() {
		System.out.println("This is after method setup");
	}
	
	@AfterTest
	public void testaSetup(){
		System.out.println("This is after test setup");
	}
	
	@AfterSuite
	public void suiteaSetUp() {
		System.out.println("This is after suite setup");
	}
	
	@Test
	public void hello() {
		System.out.println("testNg Execution");
	}
	
	@Test
	public void hello1() {
		System.out.println("testNg Execution 1");
	}

}
