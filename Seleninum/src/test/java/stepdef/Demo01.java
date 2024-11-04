package stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Demo01 {
	
	WebDriver driver;
	
	@Given("login into the page")
	public void login_into_the_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","C:\\Users\\abhib\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		 chromeOptions.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver( chromeOptions);
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	@When("enter the {string} and {string}")
	public void enter_the_and(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("username")).sendKeys(string);
		driver.findElement(By.id("password")).sendKeys(string2);
		driver.findElement(By.id("submit")).click();
	   
	}

	@Then("check the output")
	public void check_the_output() {
	    // Write code here that turns the phrase above into concrete actions
		try {
			
			driver.findElement(By.linkText("Log out")).click();;
			System.out.println("Logged In Successfully");
			System.out.println("Congratulations student. You successfully logged in!");
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Logged In UnSuccessfully");
		}
		
	    
	}
	
	@Then("std logut from application")
	public void std_logut_from_application() {
	    // Write code here that turns the phrase above into concrete actions
		driver.close();
	}


}
