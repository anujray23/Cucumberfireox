package core;

//import java.sql.Connection;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class Page 
{
	public WebDriver driver = null;
	//public Connection con = null;

public void openBrowser(String browser,String url)
{
	if (browser.equalsIgnoreCase("chrome"))
	{
driver = new ChromeDriver(); 

}
	else if (browser.equalsIgnoreCase("edge"))
	{
		driver = new EdgeDriver();
	}
	else if (browser.equalsIgnoreCase("firefox"))
	{
		driver = new FirefoxDriver();
	}
     //driver.get(url);
	driver.navigate().to(url);
	PageFactory.initElements(driver,this);
     //implicit wait
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));// common time wait for 60 seconds in all programme 
     driver.manage().window().maximize();//full screen of laptop
}
     
     public void closeBrowser()
     {
    	 driver.quit();
     }}