package AcademyOnline;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.loginPage;
import resources.base;

public class HomePage extends base {

	public static Logger log = LogManager.getLogger(base.class.getName());

	@BeforeTest
	public void initilizeDriver() throws IOException {
		driver = initializeDriver();

	}

	@Test(dataProvider = "getData")
	public void basePagenavigation(String username, String password) throws IOException, InterruptedException {
		driver.get("http://www.qaclickacademy.com");
		LandingPage l = new LandingPage(driver);
		l.getLogin().click();

		loginPage lp = new loginPage(driver);
		lp.getEmail().sendKeys(username);
		lp.getPwd().sendKeys(password);
		lp.SubmitData().click();
		log.info("login done");

	}

	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[2][2];
		data[0][0] = "abcd@gmail.com";
		data[0][1] = "abcd";
		data[1][0] = "efgh@gmail.com";
		data[1][1] = "efgh";

		return data;

	}

	@AfterTest
	public void closebrowser() {
		driver.close();
		driver=null;
	}
}
