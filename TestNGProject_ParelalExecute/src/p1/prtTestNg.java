package p1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class prtTestNg
{
	@BeforeSuite
	public void before_suite()
	{
		System.out.println("before suite...");
	}
	@AfterSuite
	public void after_suite()
	{
		System.out.println("after suite...");
	}
	@BeforeTest
	public void before_test()
	{
		System.out.println("before test..");
	}
	@AfterTest
	public void after_test()
	{
		System.out.println("after test..");
	}
	@BeforeClass
	public void before_class()
	{
		System.out.println("before class.");
	}
	@AfterClass
	public void after_class()
	{
		System.out.println("after class.");
	}
	@BeforeMethod
	public void before_method()
	{
		System.out.println("before method");
	}
	@AfterMethod
	public void after_method()
	{
		System.out.println("after method");
	}


	@Test(groups="test1", dependsOnGroups={"test2"}, alwaysRun=true)
	public void method1()
	{
		System.out.println("This is method 1");
	}
	@Test(groups="test2")
	public void method2()
	{
		System.out.println("This is method 2");
	}
}

class cl2
{
	@Test(groups={"test1","a1"})
	public void cl2_methos()
	{
		System.out.println("This method is in class 2 ");
	}

}














