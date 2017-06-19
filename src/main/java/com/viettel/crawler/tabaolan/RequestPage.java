package com.viettel.crawler.tabaolan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RequestPage {
	private static WebDriver driver = null;

	public static void main(String[] args) {
		// Create a new instance of the Firefox driver

		driver = new FirefoxDriver();
		
		for (int n = 1; n <= 11; n++) {
			driver.get("http://www.tabaolan.com/categories/newbie/");
			driver.manage().window().maximize();
			driver.findElement(
					By.xpath("//html/body/div/div/div/section/article["+n+"]/h2/a")).click();
			
			String title = driver.findElement(
					By.className("title")).getAttribute("innerHTML");
			
			String content = driver.findElement(
					By.className("entry-content")).getAttribute("innerHTML");
			System.out.println(content);
		
			driver.navigate().back();
		}
		
		driver.quit();
		// Close the driver
		
	}

}
