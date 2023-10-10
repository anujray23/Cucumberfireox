package testcases;

import org.openqa.selenium.By;

import core.Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FacebookLogin extends Page
{
	@Given("i open {string} and goto {string}")
	public void i_open_and_goto(String browser, String url)
	{
	    openBrowser(browser,url);
	}
	@When("^i enter userid (.*) and password (.*)")
	public void i_enter_userid_and_password(String id,String pd) 
	{
	    driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(id);
	    driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(pd);
	}
	@When("click login button")
	public void click_login_button()
	{
		driver.findElement(By.xpath("//*[@name='login']")).click();
	}
	
	@Then("get message")
	public void get_message()
	{
	    System.out.println("done....");
	    driver.quit();
	}



	
	
	
	
}
