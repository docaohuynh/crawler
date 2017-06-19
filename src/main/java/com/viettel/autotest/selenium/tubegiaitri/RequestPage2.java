package com.viettel.autotest.selenium.tubegiaitri;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RequestPage2 {
	private static WebDriver driver = null;

	public static void main(String[] args) {
		// Create a new instance of the Firefox driver

		driver = new FirefoxDriver();
		driver.get("https://www.youtube.com/channel/UCOhxXQzLR2RpC2aj-NlNrZQ/videos");
		driver.manage().window().maximize();
		
		
//		driver.navigate().back();
		
		for (int n = 1; n <= 1000; n++) {
			
			for (int i = 1; i <= 27;i++) {
				// Launch the facebook
				
				
//				driver.findElement(
//						By.xpath("//html/body/div[2]/div[4]/div/div[5]/div/div[2]/div/div/div/div/ul/li[2]/ul/li["+i+"]/div/div[1]/div[2]/h3/a")).click();
				driver.findElement(
						By.cssSelector("li.channels-content-item:nth-child("+i+") > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > h3:nth-child(1) > a:nth-child(1)")).click();
			
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				driver.get("https://www.youtube.com/channel/UCOhxXQzLR2RpC2aj-NlNrZQ/videos");
			}
			
		}
		driver.quit();
		// Close the driver
		
	}

}
