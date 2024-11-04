package stepdef;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class dataTbaleDemo {
	static WebDriver driver;
	@Given("user open the url")
	public void user_open_the_url() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","C:\\Users\\abhib\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("enter the EmailId and password")
	public void enter_the_email_id_and_password(DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	List<Map<String, String>> data=dataTable.asMaps(String.class,String.class);
	  driver.findElement(By.id("username")).sendKeys(data.get(0).get("username"));
	  driver.findElement(By.id("password")).sendKeys(data.get(0).get("password"));
	  driver.findElement(By.xpath("//*[@id=\"login\"]/button/i")).click();
	}

	@Then("click on login button")
	public void click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions	
	   driver.close();
	}

}
