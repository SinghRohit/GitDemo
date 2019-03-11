package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.base;

public class LandingPage extends base {

	public WebDriver driver;

	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}

	By signin = By.xpath("//a[@href='http://qaclickacademy.usefedora.com/sign_in']");
	By Title = By.xpath("//div[@class='container']//div[@class='text-center']");
	By navigation = By.cssSelector("ul[class='nav navbar-nav navbar-right']");

	public WebElement getLogin() throws InterruptedException {
		// Thread.sleep(8000);
		// if(driver.findElement(By.xpath("//button[contains(text(),'NO
		// THANKS')]")).isDisplayed())
		// {
		// driver.findElement(By.xpath("//button[contains(text(),'NO
		// THANKS')]")).click();

		// }
		return driver.findElement(signin);

	}

	public WebElement getTitle() {
		return driver.findElement(Title);
	}

	public WebElement getNavigationBar() {
		return driver.findElement(navigation);
	}

}
