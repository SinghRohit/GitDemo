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

public class validateTitle extends base {
	public static Logger log = LogManager.getLogger(base.class.getName());

	@BeforeTest
	public void initilizeDriver() throws IOException {
		driver = initializeDriver();
		log.info("Driver is initialized");
		driver.get(prop.getProperty("url"));
		log.info("Navigated to home page");
	}

	@Test
	public void TitleTest() throws IOException {

		LandingPage l = new LandingPage(driver);
		Assert.assertEquals(l.getTitle().getText(), "FEATURED COURSES123");
		log.info("Successfully validated text message");

	}

	@AfterTest
	public void closebrowser() {
		driver.close();
		driver=null;
	}
}
