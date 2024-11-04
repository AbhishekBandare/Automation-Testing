package junitTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver","C:\\Users\\abhib\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.id("username")).sendKeys("abhishek");
	driver.findElement(By.id("password")).sendKeys("abhi@123");
	driver.findElement(By.xpath("//*[@id=\"login\"]/button/i")).click();
	System.out.println("successfuly install seleninum webdriver......");
	driver.close();
  
	}

}
