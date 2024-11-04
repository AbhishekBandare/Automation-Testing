package junitTest;

//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

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class login {
	WebDriver driver;

	

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\abhib\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@After
	public void tearDown() throws Exception {
		//driver.close();
	}

	@Test
	public void test() {
		driver.findElement(By.id("username")).sendKeys("tomsmith");
		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.xpath("//*[@id=\"login\"]/button/i")).click();
		try {
			driver.findElement(By.xpath("//div[@id='flash']"));
			System.out.println("login successfully");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("login Unsuccessfully");
		}
		finally {
			System.out.println("Thank you.....");
		}
		String title=driver.getTitle();
		System.out.println("Title of the page:"+title);
		System.out.println("url"+driver.getCurrentUrl());
		System.out.println("page source:"+driver.getPageSource());
		Assert.assertEquals(title, "The Internet");
  WebElement e=driver.findElement(By.className("subheader"));
  System.out.println(e.getText());
  if(driver.getCurrentUrl().contains("https://the-internet.herokuapp.com/secure")) {
	  System.out.println("success");
  }
  else {
	  System.out.println("fail bro sry....");
  }
	}
	
}
