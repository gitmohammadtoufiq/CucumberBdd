package BestBuy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	WebDriver driver;
	@Given("User is already in login page")
	public void user_is_already_in_login_page() throws Exception {
		System.setProperty("webdriver.chrome.driver", "/Users/mohammadtoufiq/eclipse-workspace/CucumberProject/chromedriver");
		driver=new ChromeDriver();
		driver.get("https://www.bestbuy.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
	    
	}

	@When("Title of login page is Best Buy")
	public void title_of_login_page_is_best_buy() {
	    String title=driver.getTitle();
	    
	}

	@Then("User enter username")
	public void user_enter_username() {
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("MohammadToufiq20");
		System.out.println("Enter your username");
	   
	}

	@Then("User enter password")
	public void user_enter_password() {
		System.out.println("Enter your password");
	   
	}

	@Then("User click on login button")
	public void user_click_on_login_button() {
		System.out.println("Click on login button");
	}

	@Then("User is on home page")
	public void user_is_on_home_page() {
		System.out.println("This is your homepage");
	}

}
