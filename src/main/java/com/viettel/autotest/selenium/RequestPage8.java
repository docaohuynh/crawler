package com.viettel.autotest.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RequestPage8 {
	private static WebDriver driver = null;

	public static void main(String[] args) {
		// Create a new instance of the Firefox driver

		driver = new FirefoxDriver();

		// Put a Implicit wait, this means that any search for elements on the
		// page could take the time the implicit wait is set for before throwing
		// exception
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Launch the facebook
		driver.get("http://tutslaptrinh.com/en");
		for (int n = 1; n <= 100; n++) {
			for (int j = 1; j <= 10; j++) {
				try {
					driver.findElement(
							By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div[1]/div/ul/li[" + j + "]/a")).click();
				} catch (Exception e) {
	
				}
	
				try {
					Thread.sleep(10000);
	
					for (int i = 1; i <= 20; i++) {
						try {
							driver.findElement(By.xpath("//html/body/div[2]/div/div/div[1]/div/article[" + i + "]/h2/a"))
									.click();
						} catch (Exception e) {
	
						}
	
						Thread.sleep(10000);
						try {
							driver.findElement(
									By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div[1]/div/ul/li[" + j + "]/a"))
									.click();
						} catch (Exception e) {
	
						}
	
						Thread.sleep(10000);
					}
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
	
			}
		}
		// Close the driver
		driver.quit();
	}

}
