package p1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Test4
{
//	@BeforeClass 
//	@BeforeSuite// executes 1st in suite
	public void beforeClass()
	{
		System.out.println("before class");
	}
//	@AfterClass
	public void afterClass()
	{
		System.out.println("after class");
	}

//	@BeforeMethod // this method will be executed b4 each method in test case
	
	public void setup()
	{
		System.out.println("login");
	}

//	@AfterMethod // this method will be executed after each method in test case
	public void m10()							 
	{
		System.out.println("M10");
	}

//	@Test
	public void m11()
	{
		System.out.println("m11");
		int a = 1/0;
	}

//	@Test
	public void m12()
	{
		System.out.println("m12");
	}


}
