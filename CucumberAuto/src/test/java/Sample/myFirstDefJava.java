package Sample;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class myFirstDefJava {
	WebDriver driver;
	
	 @Given("^User need to be on Facebook login page$")
	    public void user_need_to_be_on_facebook_login_page() throws Throwable {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\bdine\\Desktop\\Cucumber\\chromedriver.exe");
		 driver = new ChromeDriver(); 
		 driver.get("https://www.facebook.com/");
	    }

	    @When("^User enters user first name$")
	    public void user_enters_user_first_name() throws Throwable {
	    	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Dinesh");
	    }

	    @Then("^User checks user first name is present$")
	    public void user_checks_user_first_name_is_present() throws Throwable {
	    	String userName1=driver.findElement(By.xpath("//input[@name='firstname']")).getAttribute("value");
	    	Assert.assertEquals("Dinesh", userName1);
	    	
	    }


}
