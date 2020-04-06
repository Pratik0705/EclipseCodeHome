
package p1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 
{
//	@Test(dependsOnMethods={"m2"}, alwaysRun=true)//so the m1 will be executed after m2 execution. so we can have sequence of execution
	public void m1()							  // with alwaysRun = true : it will not skip dependent test case. it will execute dependent test case though the one fails. 
	{
		System.out.println("M1");
	}

//	@Test
	public void m2()
	{
		System.out.println("m2");
		int a = 1/0;
		Assert.assertTrue(1>1, "1 is not greter than one");// it expects true but 1>1 is false hence it will fail this test case as its false
		Assert.assertEquals("Test", "Test");
		Assert.assertNull(a);
		
	}
	
//	@Test
	public void m3()
	{
		System.out.println("m3");
	}
	
	@Test
	public void parallel1()
	{
		WebDriver dr = new FirefoxDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		dr.get("https://opensource-demo.orangehrmlive.com/");
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement Uname = dr.findElement(By.id("txtUsername")); // using ID 
		Uname.sendKeys("Admin");
		WebElement Pwd = dr.findElement(By.name("txtPassword")); // using Name
		Pwd.sendKeys("admin123");
		WebElement LoginBtn = dr.findElement(By.xpath("//input[@id='btnLogin']")); // *** BUTTON 
		LoginBtn.click();
		
	}
	
	
	
	
}	







