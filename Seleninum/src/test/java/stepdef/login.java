package stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login {
	static WebDriver driver;
	
	@Given("user must be on the home page of herokuapp login")
	public void user_must_be_on_the_home_page_of_herokuapp_login() {
	    // Write code here that turns the phrase above into concrete actions
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\abhib\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		 chromeOptions.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver( chromeOptions);
		driver.get("https://the-internet.herokuapp.com/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("Enter the username {string} and password {string}")
	public void enter_the_username_and_password(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("username")).sendKeys(string);
		driver.findElement(By.id("password")).sendKeys(string2);
		driver.findElement(By.xpath("//*[@id=\"login\"]/button/i")).click();
		try {
			driver.findElement(By.xpath("//div[@id='flash']"));
			System.out.println("login successfully username:"+string+" password:"+string2);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("login Unsuccessfully username:"+string+" password:"+string2);
		}
		finally {
			System.out.println("Thank you.....");
		}
	}

	@Then("check the outcomes & logout the page")
	public void check_the_outcomes_logout_the_page() {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.close();
	}

}
