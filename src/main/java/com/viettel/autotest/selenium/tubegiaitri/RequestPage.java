package com.viettel.autotest.selenium.tubegiaitri;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RequestPage {
	private static WebDriver driver = null;

	public static void main(String[] args) {
		// Create a new instance of the Firefox driver

		
		
		
//		driver.navigate().back();
		
		for (int n = 1; n <= 1000; n++) {
			driver = new FirefoxDriver();
			driver.get("https://www.youtube.com/channel/UCOhxXQzLR2RpC2aj-NlNrZQ/videos");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			driver.quit();
		}
		
		// Close the driver
		
	}

}
