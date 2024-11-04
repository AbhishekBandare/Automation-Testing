package testNg;

import org.testng.annotations.Test;

import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class parameterDemo {
	WebDriver driver;
  @Test
  @Parameters({"broswer","url","name","phone","email"})
  public void parametres(String b,String url,String name,String phone,String email) {
	  if (b.equals("chrome")) {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\abhib\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			driver=new ChromeDriver();
	} else {
		 System.out.println("invalid broswer");
	}
	  driver.get(url);
	  driver.findElement(By.xpath("//input[@name='name']")).sendKeys(name);
	  driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(phone);
	  driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);
	  driver.close();
  }
 
}
