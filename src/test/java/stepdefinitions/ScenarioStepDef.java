package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ScenarioStepDef {
	
	static WebDriver driver;
	
	// Initialise and launch the Chrome browser
	
	@Given("I launch the browser")
	public void i_launch_the_browser() {
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    
	}
	
//launching the amazon application
	
	@Given("I open the application")
	public void i_open_the_application() {
	    driver.get("https://www.amazon.co.uk/");
	    
	}
	
//SignIn using the valid credentials
	
	@When("I click on sign-in")
	public void i_click_on_sign_in() {
	   driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/div/span")).click();
	    
	}
	
	@When("I enter the username and password")
	public void i_enter_the_username_and_password() throws Exception {
		Thread.sleep(4000);
	    WebElement emailId = driver.findElement(By.id("ap_email"));
		emailId.sendKeys("user_emailId@gmail.com");
	    driver.findElement(By.id("continue")).click();
	    driver.findElement(By.name("password")).sendKeys("user_password");
	}

	@When("I click on Login")
	public void i_click_on_Login() {
	    
		driver.findElement(By.id("signInSubmit")).click();
	}

	// On successful login into application validate the message using "Assert" 
	
	@Then("I validate the message {string}")
	public void i_validate_the_message(String successMsg) {
	    WebElement message = driver.findElement(By.xpath("<xpath of the message>"));
	    String actualMsg = message.getText();
	    String expectedMsg = "Hello, user_name";
	    Assert.assertEquals(expectedMsg, actualMsg);
	    System.out.println(successMsg);
	    
	}

}
