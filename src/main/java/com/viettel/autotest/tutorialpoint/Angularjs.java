package com.viettel.autotest.tutorialpoint;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Angularjs {
	private  WebDriver driver = null;
	public static void main(String [] agrs){
		Angularjs tabao = new Angularjs();
//		driver = new FirefoxDriver();
//		tabao.getData("http://www.tutorialspoint.com/angularjs/angularjs_overview.htm");
	}

	public Object[]  getData(String url){
		driver = new FirefoxDriver();
		driver.get(url);
		try{
			String title = driver.findElement(
					By.xpath("//html/body/div[3]/div[1]/div/div[2]/div[1]/div/h1")).getText();
			String contentTemp = driver.findElement(
					By.xpath("//html/body/div[3]/div[1]/div/div[2]/div[1]/div")).getAttribute("innerHTML");
			System.out.println(title);
			System.out.println(contentTemp);
			String contentImg= contentTemp.replaceAll("/angularjs/images", "http://www.tutorialspoint.com/angularjs/images");
			driver.quit();
			return new Object[] { title, contentImg};
		}catch(Exception e){
			return null;
		}
		
		
	}
	
}
