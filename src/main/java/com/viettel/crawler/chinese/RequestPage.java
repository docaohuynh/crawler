package com.viettel.crawler.chinese;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RequestPage {
	private static WebDriver driver = null;

	public static void main(String[] args) {
		// Create a new instance of the Firefox driver

		driver = new FirefoxDriver();

		// Put a Implicit wait, this means that any search for elements on the
		// page could take the time the implicit wait is set for before throwing
		// exception
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Launch the facebook
		driver.get("http://tratu.coviet.vn/hoc-tieng-trung/cap-cau-song-ngu/vietgle-tra-tu/tat-ca/trang-1.html");
		for (int n = 1; n <= 15; n++) {
			   
			String chinese = driver.findElement(
					By.xpath("/html/body/form/div[3]/div[1]/div/div[6]/div/div[3]/div[5]/div/ul["+n+"]/li[1] ")).getText();
			String vi = driver.findElement(
					By.xpath("/html/body/form/div[3]/div[1]/div/div[6]/div/div[3]/div[5]/div/ul["+n+"]/li[2] ")).getText();
			
			System.out.println("CHINA " + chinese + " VI " + vi);
			/*
			try {
				driver.findElement(
						By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div[1]/div/ul/li[" + j + "]/a")).click();
			} catch (Exception e) {

			}*/
		}
		// Close the driver
		driver.quit();
	}

}
