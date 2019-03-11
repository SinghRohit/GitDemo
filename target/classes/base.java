package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class base {
	public static WebDriver driver;
	public Properties prop = new Properties();

	public WebDriver initializeDriver() throws IOException {

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\singhro\\Desktop\\Selenium_test\\E2EProjectEx\\src\\main\\java\\resources\\Data.properties");

		prop.load(fis);
		String browserName = prop.getProperty("browser");
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\singhro\\Desktop\\Selenium_test\\chromedriver_win32 (2)\\chromedriver.exe");

			driver = new ChromeDriver();

		} else if (browserName == "firefox") {
			System.out.println("Choose wrong browser");

		} else {
			System.out.println("Choose wrong browser");
		}

		// driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		return driver;
	}

	public void getScreenShot(String name) throws IOException
	{
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File saveFile = new File ("C:\\Users\\singhro\\Desktop\\"+name+".png");
		Files.copy(src, saveFile);
	}

}
