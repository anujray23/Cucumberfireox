package testcases;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import core.Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonUid extends Page
{
	@FindBy(xpath = xpath.AllXpath.signin)
	WebElement signin;
	
	@FindBy(xpath = xpath.AllXpath.uid)
	WebElement uid;
	
	@FindBy(xpath = xpath.AllXpath.ctnbtn)
	WebElement ctnbtn;
	
	@FindBy(xpath = xpath.AllXpath.pwd)
	public static WebElement pwd;
	
	@FindBy(xpath = xpath.AllXpath.err1)
	WebElement err1;
	
	@FindBy(xpath = xpath.AllXpath.submit)
	public static WebElement submit;
	
	@FindBy(xpath = xpath.AllXpath.err2)
	public static WebElement err2;
	
	public static boolean flag = true;// static class can be called by another class in same package
	
	@Given("browser {string} opens and get website {string}")
	public void browser_opens_and_get_website(String browser, String url) 
	{
	    openBrowser(browser,url);
	}
	@Given("click signin")
	public void click_signin() 
	{
	    signin.click();
	}
	@When("I enter valid userid {string}")
	public void i_enter_valid_userid(String id) 
	{
	    uid.sendKeys(id);
	}
	@When("click continue button")
	public void click_continue_button() 
	{
	    ctnbtn.click();
	}
	@Then("password textbox must come")
	public void password_textbox_must_come() 
	{
	    try
	    {
	    System.out.println(	err1.getText() );
	    	Assert.fail();
	    	flag = false;
	    }
	    catch(Exception e)
	    {
	    	System.out.println("pass");
	    	flag = true;
	    }
	}

}
