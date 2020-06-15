package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ScenarioOutlineStepDEf {
	
	// Initialise and launch the Chrome browser
	WebDriver driver;
	@Given("I launch the browser and application")
	public void i_launch_the_application() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.co.uk/");
	}
	
	// Launch the google application
	
	@When("I enter the {string} to search")
	public void i_enter_the_to_search(String string) {
	    WebElement searchItem=driver.findElement(By.name("q"));
	    searchItem.sendKeys(string);
	    searchItem.sendKeys(Keys.ENTER); 
	}

	// Search for the related products
	
	@Then("I search for the related product details")
	public void i_search_for_the_related_product_details() {
	    String title = driver.getTitle();
	    System.out.println("Searched Item page title is:"+title);
	    driver.navigate().back();
	}
	@Then("I close the browser")
	public void i_close_the_browser() {
	   driver.quit();
	}

}
