package testNg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class ExcelFileDEmo {
	static WebDriver driver;
  @Test
  public void f() throws IOException, Exception {
	  
     FileInputStream file=new FileInputStream("C:\\Users\\abhib\\OneDrive\\Documents\\Book1.xlsx");
	 XSSFWorkbook book=new XSSFWorkbook(file);
	 XSSFSheet sheet=book.getSheetAt(0);
	 int rowcount=sheet.getLastRowNum()-sheet.getFirstRowNum();
	 System.out.println(rowcount);
	 for (int i = 1; i <=rowcount; i++) {
		 
		String name=sheet.getRow(i).getCell(0).getStringCellValue();
		String phone=sheet.getRow(i).getCell(1).getRawValue();
		String Email=sheet.getRow(i).getCell(2).getStringCellValue();
		String country=sheet.getRow(i).getCell(3).getStringCellValue();
		String city=sheet.getRow(i).getCell(4).getStringCellValue();
		String username=sheet.getRow(i).getCell(5).getStringCellValue();
		String password=sheet.getRow(i).getCell(6).getStringCellValue();
		driver.findElement(By.xpath("//input[@name='name']")).clear();
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys(name);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='phone']")).clear();
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(phone);
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@name='email']")).clear();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(Email);
		Thread.sleep(500);
		WebElement e=driver.findElement(By.xpath("//*[@id=\"load_form\"]/fieldset[4]/select"));
		Select s=new Select(e);
		s.selectByVisibleText(country);
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@name='city']")).clear();
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys(city);
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"load_form\"]/fieldset[6]/input")).clear();
		driver.findElement(By.xpath("//*[@id=\"load_form\"]/fieldset[6]/input")).sendKeys(username);
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"load_form\"]/fieldset[7]/input")).clear();
		driver.findElement(By.xpath("//*[@id=\"load_form\"]/fieldset[7]/input")).sendKeys(password);
		sheet.getRow(i).createCell(7).setCellValue("Submitted");
		
	 }
	 sheet.getRow(0).createCell(7).setCellValue("Result");
	 FileOutputStream fout=new FileOutputStream("C:\\Users\\abhib\\OneDrive\\Documents\\Book3.xlsx");
	 book.write(fout);
	 book.close();
	
	 
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\abhib\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://way2automation.com/way2auto_jquery/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
