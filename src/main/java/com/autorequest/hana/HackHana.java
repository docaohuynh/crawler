package com.autorequest.hana;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HackHana {
	private static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("http://raxalo.com/converse/bold/batdongsan.html");
		Thread.sleep(10000);
		for (int n = 1; n <= 10000; n++) {
			Thread.sleep(100);
			driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[5]/div/form/textarea")).sendKeys("căn hộ");
			driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[5]/div/form/textarea")).sendKeys(Keys.RETURN);
		}
		driver.quit();
	}
}
