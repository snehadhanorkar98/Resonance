package com.resonance02.regression02;

import java.io.FileNotFoundException;

//import com.resonance.utils.Environment;
//import com.resonance02.keywords.UIKeywords;
import com.resonance02.keywords02.UIKeywords02;

public class RegressionTests02 {
	//Environment en = new Environment();

	
	public void verifyTitlesOfHomePage() throws InterruptedException, FileNotFoundException {
		// WebDriverManager.chromedriver().setup();
		// RemoteWebDriver driver = new ChromeDriver();
		UIKeywords02.OpenBrowser("chrome");
		// UIKeywords.driver.get("");
	//	UIKeywords02.launchUrl(en.getAppUrl()); // en is not required here.
		// UIKeywords.launchUrl("https://testingshastra.com/assignments/simple-alert");
		// Above line is replaced by environment object
		// UIKeywords.launchUrl("https://testingshastra.com");
		// driver.get("");
		// String actualTitle = driver.getTitle();
		String actualTitle = UIKeywords02.getTitle();
		// By by = By.xpath("");
		UIKeywords02.enterText("input#user", "Sneha", "cssSelector");
		Thread.sleep(2000);
		UIKeywords02.click("button.alert-btn", "cssSelector");
		// UIKeywords.enterText(by,"Hello");
		// WebElement element = UIKeywords.driver.findElement(by.xpath(""));
		// UIKeywords.enterText(by, textToEnter);// line no. 29 and 30 merged

		// Assert.assertEquals("Home Page", actualTitle);
	}


}
