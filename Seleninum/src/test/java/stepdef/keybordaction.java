package stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class keybordaction {
	static WebDriver driver;
	
	
	@Given("user must be on the home page")
	public void user_must_be_on_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","C:\\Users\\abhib\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("search the itams {string}")
	public void search_the_itams(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(string+Keys.ENTER);
		
	}

	@Then("close the broswer")
	public void close_the_broswer() {
	    // Write code here that turns the phrase above into concrete actions
	driver.close();
	}
}
