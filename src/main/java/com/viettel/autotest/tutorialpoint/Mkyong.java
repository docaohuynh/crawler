package com.viettel.autotest.tutorialpoint;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Mkyong {
	private  WebDriver driver = null;
	public static void main(String [] agrs){
		Mkyong tabao = new Mkyong();
//		driver = new FirefoxDriver();
//		tabao.getData("http://www.tutorialspoint.com/angularjs/angularjs_overview.htm");
	}

	public Object[]  getData(String url){
		driver = new FirefoxDriver();
		driver.get(url);
		try{
			String title = driver.findElement(
					By.xpath("//html/body/div[2]/div/div/div[1]/div/article/h1")).getText();
			String contentTemp = driver.findElement(
					By.xpath("//html/body/div[2]/div/div/div[1]/div/article/div[2]")).getAttribute("innerHTML");
			System.out.println(title);
			System.out.println(contentTemp);
			String refe = "<ol><li><a href=\"http://mkyong.com\" target=\"_blank\">http://mkyong.com</a></li></ol>";
			contentTemp = contentTemp + refe;
//			String contentImg= contentTemp.replaceAll("/angularjs/images", "http://www.tutorialspoint.com/angularjs/images");
			driver.quit();
			return new Object[] { title, contentTemp};
		}catch(Exception e){
			return null;
		}
		
		
	}
	
}
