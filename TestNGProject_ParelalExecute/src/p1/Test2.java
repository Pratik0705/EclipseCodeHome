package p1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Test2 {

	//	@Test(priority=4)
	public void m4()
	{
		System.out.println("m4");
	}

	//	@Test(priority=1)
	public void m5()
	{
		System.out.println("m5");
	}

	//	@Test(priority=7)
	public void m6()
	{
		System.out.println("m6");
	}

	@Test
	public void parallel2()
	{
//		System.setProperty("webdriver.chrome.driver","E:/Selenium Softwares/WebDrivers/latest chrome exe/chromedriver.exe");
//		WebDriver dr = new ChromeDriver();
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
