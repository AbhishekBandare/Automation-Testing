package testNg;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.io.File;

import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class TestngAnnotations {
	
	static WebDriver driver;
	
  @Test(dataProvider = "Test")
  public void test(String u, String p) throws Exception {
	  String a=driver.getTitle();
	  driver.findElement(By.id("username")).sendKeys(u);
		driver.findElement(By.id("password")).sendKeys(p);
		driver.findElement(By.xpath("//*[@id=\"login\"]/button/i")).click();
		try {
			
			driver.findElement(By.xpath("//div[@id='flash']"));
			driver.findElement(By.linkText("Logout")).click();
			System.out.println("login successfully username:"+u+ " password:"+p);
			//screenshot of the webpage
			File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(srcfile,new File("C:\\Users\\abhib\\OneDrive\\Documents\\Screenshot\\ss.png"));
			
		} 
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("login Unsuccessfully username:"+u+ " password:"+p);
			
		}
		finally {
			System.out.println("Thank you.....");
		}
	}
  

  @DataProvider
  public Object[][] Test() {
    return new Object[][] {
     { "tomsmith", "tom@1234" },
     { "tom", "tom123" },
     {"tomsmith","SuperSecretPassword!"}
    };
  }
  
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\abhib\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
