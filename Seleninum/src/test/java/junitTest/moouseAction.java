package junitTest;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class moouseAction {
 WebDriver driver;
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\abhib\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.lambdatest.com/blog/perform-mouse-actions-in-selenium-webdriver/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@After
	public void tearDown() throws Exception {
		driver.close();
	}

	@Test
	public void test() {
		WebElement e=driver.findElement(By.linkText("Platform "));
		Actions a= new Actions(driver);
		a.moveToElement(e).perform();
		driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/div/div/div[1]/div/div[1]/div/div[1]/div/div[1]/ul/li[2]/a/div/div[2]")).click();
		
	}

}
