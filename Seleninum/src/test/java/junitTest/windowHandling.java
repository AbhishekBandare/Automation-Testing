package junitTest;



import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandling {
	static WebDriver driver;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\abhib\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@After
	public void tearDown() throws Exception {
		driver.close(); 
		driver.quit();
	}

	@Test
	public void test() {
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.linkText("Visit W3Schools.com!")).click();
		Set<String> set=driver.getWindowHandles();
		Iterator<String> i=set.iterator();
		String parentWindow=i.next();
		String childWindow=i.next();
		System.out.println(childWindow );
		driver.switchTo().window(childWindow);
		System.out.println(set);
		System.out.println(set.size());
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("modalusername")).sendKeys("Abhishek@gmail.com");
		driver.findElement(By.id("current-password")).sendKeys("123345");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[4]/div[1]/div/div[4]/div[1]/button")).click();
		
	}

}
