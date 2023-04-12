package stepDefA3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginA3steps {
	WebDriver driver = null;
	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("Inside Step-Browser Is Open");
		System.setProperty("webdriver.gecko.marionette","C:\\Users\\HP\\eclipse-workspace\\assignment3\\src\\test\\resources\\DriversA3\\geckodriver.exe" );
	    driver = new FirefoxDriver();
	    driver.manage().window().maximize();
	    }

	@And("user is on login page")
	public void user_is_on_login_page() throws Exception 
	{
	   driver.navigate().to("https://www.linkedin.com/");
	   Thread.sleep(2000);
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() throws Throwable
	{
		driver.findElement(By.id("session_key")).sendKeys("vinivinod2024@mca.ajce.in");
	    driver.findElement(By.id("session_password")).sendKeys("Vini@3701");
	    Thread.sleep(2000);
	}

	@And("User clicks on login")
	public void user_clicks_on_login() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() throws Exception {
		driver.findElement(By.id("ember26")).isDisplayed();
		Thread.sleep(2000);
		driver.close();
		driver.quit();
	}

}
