package testcases;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Amazonpwd // extends AmazonUid not allowed
{
	// @FindBy(xpath = xpath.AllXpath.pwd)  // not work without PageFactory
	// WebElement pwd;
	
	public boolean f = true;
	
	@Given("userid is valid")
	public void userid_is_valid() 
	{
		if(AmazonUid.flag == true)
		{
			f = true;
		}
		else
		{
			f = false;
		}
	}
	@When("i enter valid password {string}")
	public void i_enter_valid_password(String password) 
	{
	    if(f == true)
	    {
	    	AmazonUid.pwd.sendKeys(password);
	    }
	    else
	    {
	    	Assert.fail();
	    }
	}
	@When("click submit button")
	public void click_submit_button() 
	{
	    AmazonUid.submit.click();
	}
	@Then("I should login")
	public void i_should_login() 
	{
	    try {
	    	AmazonUid.err2.getText();
	    	Assert.fail();
	    }
	    catch(Exception e)
	    {
	    	System.out.println("pass");
	    }
	}
}
