package junitTest;



import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertdemo {
	static WebDriver driver;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\abhib\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@After
	public void tearDown() throws Exception {
		driver.close();
	}

	@Test
	public void test() {
		driver.findElement(By.id("alertButton")).click();
		Alert a=driver.switchTo().alert();
	String b=a.getText();
	System.out.println(b);
	    a.accept();
	}
	@Test
	public void test1() {
		driver.findElement(By.id("confirmButton")).click();
		driver.switchTo().alert().dismiss();
	}
	@Test
	public void test2() {
		driver.findElement(By.id("promtButton")).click();
		driver.switchTo().alert().sendKeys("Abhishek Chavan");
		driver.switchTo().alert().accept();
		
	}

}
