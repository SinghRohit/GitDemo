package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {

	WebDriver driver;

	public loginPage(WebDriver driver)
	{
		this.driver=driver;
	}

	By email = By.cssSelector("input[id='user_email']");
	By password = By.cssSelector("input[id='user_password']");
	
	By Sumbit =By.xpath("//*[@name='commit']");
	
	public WebElement getEmail()
	{
		return driver.findElement(email);
		
	}
	
	public WebElement getPwd()
	{
		return driver.findElement(password);
		
	}
	
	public WebElement SubmitData()
	{
		return driver.findElement(Sumbit);
		
	}
}
