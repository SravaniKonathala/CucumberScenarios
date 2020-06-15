package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BackgroundStpDef {
	
	// Initialise and launch the Chrome browser
	
	WebDriver driver;
	
	@Given ("I launch browser")
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	@Given("I launch the application {string}")
	public void i_launch_the_application(String string) {
		
		driver.get(string);
	}

	@Given("I search for products in google search box {string}")
	public void i_search_for_products_in_google_search_box(String string) {
		
		WebElement element = driver.findElement(By.name("q"));
	    element.sendKeys(string);
	}
	
	@Given("I search for products in yahoo search box {string}")
	public void i_search_for_products_in_yahoo_search_box(String string) {
		
		WebElement element = driver.findElement(By.name("p"));
	    element.sendKeys(string);
	}
	
	@Then("I quit the browser")
	public void quitBrowser() {
		driver.quit();
	}

	
}
