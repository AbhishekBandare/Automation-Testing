package junitTest;





import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;



public class webTableDemo {
 static WebDriver driver;
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\abhib\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/webtables");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@After
	public void tearDown() throws Exception {
		driver.close();
	}

	@Test
	public void test() {
		
		List<WebElement> e=driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div"));
		System.out.println("size:"+e.size());
		for (int i = 0; i < e.size(); i++) {
			System.out.println("********");
			System.out.println(e.get(i).getText());
			
		}
	}
	@Test
	public void test1() {
		String expected="ToolsQA";
		String actual="ToolsQA";
		Assert.assertEquals(actual, expected);	
	}

}
