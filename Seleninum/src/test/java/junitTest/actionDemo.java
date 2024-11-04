package junitTest;



import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class actionDemo {
  WebDriver driver;
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\abhib\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@After
	public void tearDown() throws Exception {
		driver.close();
	}

	@Test
	public void test() {
		WebElement elememt=driver.findElement(By.linkText("Electronics"));
		Actions action=new Actions(driver);
		action.moveToElement(elememt).perform();
		driver.findElement(By.linkText("Apple")).click();
	 System.out.println("title of the page:"+driver.getTitle());
	 String expected=driver.getTitle();
	 String actual="Apple products for sale | eBay";
	 Assert.assertEquals(actual, expected);
	
	}

}
