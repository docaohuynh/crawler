package com.viettel.autotest.selenium.tubegiaitri;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RequestPageStatic {
	private static WebDriver driver = null;

	public static void main(String[] args) {
		// Create a new instance of the Firefox driver

		
		
		
//		driver.navigate().back();
		
		for (int n = 1; n <= 1000; n++) {
			driver = new FirefoxDriver();
			driver.get("https://www.youtube.com/watch?v=vbky4_RgR3Y");
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			driver.quit();
		}
		
		// Close the driver
		
	}

}
