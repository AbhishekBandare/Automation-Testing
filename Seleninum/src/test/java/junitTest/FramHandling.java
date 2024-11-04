package junitTest;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FramHandling {
	WebDriver driver;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\abhib\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@After
	public void tearDown() throws Exception {
		driver.close();
	}
	
   
	@Test
	public void test() throws Exception {
		driver.switchTo().frame("frame1");
		driver.findElement(By.xpath("/html/body/input")).sendKeys("seleninum");
		driver.findElement(By.xpath("/html/body/input")).clear();
		driver.findElement(By.xpath("/html/body/input")).sendKeys("abhishek");
		driver.switchTo().frame("frame3");
		driver.findElement(By.id("a")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		WebElement dropdwon=driver.findElement(By.id("animals"));
		Select s=new Select(dropdwon);
		s.selectByIndex(1);
		Thread.sleep(1000);
		s.selectByIndex(3);
		List<WebElement> dropdownlist=s.getOptions();
		System.out.println(dropdownlist.size());
		for (int i = 0; i < dropdownlist.size(); i++) {
			System.out.println(dropdownlist.get(i).getText());
		}
		System.out.println("suceessfully");
	}

}
