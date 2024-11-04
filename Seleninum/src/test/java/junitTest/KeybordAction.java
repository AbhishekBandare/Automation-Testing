package junitTest;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeybordAction {
   WebDriver driver;
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\abhib\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@After
	public void tearDown() throws Exception {
		driver.close();
	}

	@Test
	public void test() {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Football"+Keys.ENTER);
		driver.findElement(By.id("twotabsearchtextbox")).clear();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mouse"+Keys.ENTER);
	}
	
	@Test
	public void tets1() {
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("link size:"+links.size());
		for (int i = 0; i <links.size(); i++) {
			System.out.println(links.get(i).getText());
			System.out.println(links.get(i).getAttribute("href"));
		}
	}

}
