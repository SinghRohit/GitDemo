package AcademyOnline;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;

import resources.base;

public class ValidateNavigationBar extends base {

	public static Logger log = LogManager.getLogger(base.class.getName());

	@BeforeTest
	public void initilizeDriver() throws IOException {
		driver = initializeDriver();
		driver.get("http://www.qaclickacademy.com");

	}

	@Test()
	public void navigationBarTest() throws IOException {

		LandingPage l = new LandingPage(driver);
		Assert.assertTrue(l.getNavigationBar().isDisplayed());
		log.info("Navigation bar displyaed");
	}

	@AfterTest
	public void closebrowser() {
		driver.close();
		driver = null;
	}
}
