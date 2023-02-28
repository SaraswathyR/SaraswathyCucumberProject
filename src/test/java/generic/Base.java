package generic;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class Base {
	
	public ExtentReports extent;
	public ExtentSparkReporter spark;

	WebDriver driver;

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public void launchBrowser(String browserName) {
		switch (browserName) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\drivers\\chromedriver_109.exe");
			driver = new ChromeDriver();
			break;
		case "firefox":
			break;
		case "edge":
			break;
		}

	}

	public void launchApplication(String url) {
		getDriver().get(url);
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	public void maximizeWindow() {
		getDriver().manage().window().maximize();
	}
	
	
	
	@BeforeMethod
	public void openApplication() {
		extent= new ExtentReports();
		spark =new ExtentSparkReporter("ExtendReport.html");
//		https://www.youtube.com/watch?v=PzmEiG08L78
//		Mukesh otwani
//		Naveens Automation labs
//		Automation Step by Step
//		SDET
//		Selectors hub - Creator
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("MyReport");
		extent.attachReporter(spark);
		launchBrowser("chrome");
		launchApplication("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		maximizeWindow();
	}
	
	@AfterMethod
	public void tearDown() {
		extent.flush();
		driver.close();
		driver.quit();
	}
	
	
	
	/*
	 * Wait Methods
	 */
	public void waitForElementToBeVisible(WebElement ele, long seconds) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	
	public void pause(Integer seconds) {
		try {
			TimeUnit.SECONDS.sleep(seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public String readAProperty(String propertyName) throws Exception {
		Properties prop = new Properties();
		String path = System.getProperty("user.dir") + "\\src\\test\\resources\\project.properties";
		FileInputStream fs = new FileInputStream(path);
		prop.load(fs);
		return prop.getProperty(propertyName);
	}
}
