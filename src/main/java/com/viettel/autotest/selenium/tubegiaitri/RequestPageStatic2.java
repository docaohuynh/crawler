package com.viettel.autotest.selenium.tubegiaitri;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RequestPageStatic2 {
	private static WebDriver driver = null;

	public static void main(String[] args) {
		// Create a new instance of the Firefox driver

		
		
		
//		driver.navigate().back();
		
		for (int n = 1; n <= 1000; n++) {
			driver = new FirefoxDriver();
			driver.get("https://www.youtube.com/watch?v=N7JsHXpZjNk");
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
