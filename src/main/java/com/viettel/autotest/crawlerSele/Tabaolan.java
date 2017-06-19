package com.viettel.autotest.crawlerSele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tabaolan {
	private static WebDriver driver = null;
	public static void main(String [] agrs){
		Tabaolan tabao = new Tabaolan();
		driver = new FirefoxDriver();
		tabao.getData("http://www.tabaolan.com/NewBie/newbie-part-2-download-and-start-eclipse/");
	}

	public void getData(String url){
		
		driver.get(url);
		
		String title = driver.findElement(
				By.xpath("//html/body/div[1]/div/div/article/h2")).getText();
		String contentTemp = driver.findElement(
				By.xpath("//html/body/div[1]/div/div/article/div[1]")).getAttribute("innerHTML");
		System.out.println(title);
		System.out.println(contentTemp);
		driver.quit();
	}
	
}
