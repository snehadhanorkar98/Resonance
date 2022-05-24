package com.resonance02.keywords02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UIKeywords02 {
	
	public static RemoteWebDriver driver = null;

	public static void OpenBrowser(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
			WebDriverManager.chromedriver().setup();
			driver = new EdgeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.chromedriver().setup();
			driver = new FirefoxDriver();
		} else {
			System.err.println("Invalid Keyword" + browserName);

		}

	}

	/**
	 * @author hp
	 * @param url
	 */

	public static void launchUrl(String url) {
		driver.get(url);
		System.out.println("Url");
	}

	public static String getTitle() {
		return driver.getTitle();
	}

	/**
	 * This method can be used to enter provided text in specified
	 * {@code WebElement}
	 * 
	 * @param element     in which you want to enter text
	 * @param textToEnter this is the text that you want to This method is not used
	 *                    for longer time. Instead You can use enterText(String
	 *                    locatorValue, String textToEnter, String locatorType)
	 */
	@Deprecated
	public static void enterText(WebElement element, String textToEnter) {

		element.sendKeys(textToEnter);
	}

	public static void enterText(By by, String textToEnter) {
		driver.findElement(by).sendKeys(textToEnter);
	}

	public static void enterText(String locatorValue, String textToEnter, String locatorType) {
		if (locatorType.equalsIgnoreCase("xpath")) {
			driver.findElement(By.xpath(locatorValue)).sendKeys(textToEnter);
		} else if (locatorType.equalsIgnoreCase("cssSelector")) {

			driver.findElement(By.cssSelector(locatorValue)).sendKeys(textToEnter);
		} else {
			System.err.println("Invalid locator type" + locatorType);
		}
	}

	public static void click(String locatorValue, String locatorType) {
		if (locatorType.equalsIgnoreCase("xpath")) {
			driver.findElement(By.xpath(locatorValue)).click();
		} else if (locatorType.equalsIgnoreCase("cssSelector")) {

			driver.findElement(By.cssSelector(locatorValue)).click();
		} else {
			System.err.println("Invalid locator type" + locatorType);
		}
	}

	public void closeBrowser() {
		driver.close();
		System.out.println("Browser is closed");
	}

	public void quitBrowser() {
		driver.quit();
		System.out.println("Browser is quited");
	}

}
