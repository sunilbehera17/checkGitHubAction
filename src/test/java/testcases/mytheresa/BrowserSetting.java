package testcases.mytheresa;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static variables.mytheresa.UrlVariables.*;

public class BrowserSetting {
	
	public WebDriver BrowserSettings() {
		
		WebdriverSettings wds = new WebdriverSettings();
		WebDriver driver = wds.driverSettings();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get(BASE_URL);
		return driver;
	}

}
