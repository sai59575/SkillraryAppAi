package genericLibraries;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webDriverUtility {
	WebDriver driver;

	public WebDriver launchBrowser(String browser) {
		switch (browser) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		default:
			System.out.println("invalid browser info");
		}
		driver.manage().window().maximize();
		return driver;
	}

	/**
	 * this method is used to navigate to the application
	 * 
	 * @param time
	 */
	public void navigateToApp(String url) {
		driver.get(url);
	}

	/**
	 * This method is an implicit wait statement
	 * 
	 * @param time
	 */
	public void waitTillElementFound(long time) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	/**
	 * this method is used to wait until element is visible
	 * 
	 * @param time
	 * @param element
	 */
	public WebElement explicitWait(long time, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		return wait.until(ExpectedConditions.visibilityOf(element));

	}

	/**
	 * This method is used to wait until element is enable
	 * 
	 * @param element
	 * @param time
	 * @return
	 */
	public WebElement explicitWait(WebElement element, long time) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		return wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	/**
	 * This method is used until title of the web page appears
	 * @param title 
	 * @param time
	 * @return
	 */
	public Boolean explicitwait(String title, long time) {
	WebDriverWait wait = new WebDriverWait(driver, time);
	return wait.until(ExpectedConditions.titleContains(title));

     }
	/**
	 * This method is used to mouse hover on an element
	 * @param element
	 */
	public void mouseHoverToElement(WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
	}
	/**
	 * This method is used to double click on an element
	 * @param element
	 */
	public void doubleClickOnElement(WebElement element) {
		Actions actions = new Actions(driver);
		actions.doubleClick(element).perform();	
	}
	/**
	 * This method is used to right click on an element
	 * @param element
	 */
	public void rightClick(WebElement element) {
		Actions actions = new Actions(driver);
		actions.contextClick(element).perform();		
	}
	/**
	 * This method is used to drag and drop an element 
	 * @param element 
	 * @param target
	 */
	public void drag
	
}
